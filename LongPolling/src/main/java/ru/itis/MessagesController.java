package ru.itis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 22.11.16
 * MessagesController
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@RestController
public class MessagesController {

    @Autowired
    MessagesService service;

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    public List<MessageDto> getMessage() {
        Callable<List<MessageDto>> taskGetUnreadMessages = () -> {
                synchronized (service.getNewMessages()) {
                    while (service.getNewMessages().isEmpty()) {
                        service.getNewMessages().wait();
                    }

                    List<MessageDto> result = new ArrayList<>(service.getNewMessages());
                    service.getNewMessages().clear();
                    return result;
                }
            };

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<List<MessageDto>> result = executor.submit(taskGetUnreadMessages);

        try {
            return result.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    public void sendMessage(@RequestBody MessageDto messageDto) {
        service.handleMessage(messageDto);
    }

}

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
        /**
         // Callable - это как Runnable, только
         // возвращает результат выполнения
         Callable<List<MessageDto>> taskGetUnreadMessages = () -> {
         // прошу у сервиса список новых сообщений
         // блокирую доступ к этому списку
         synchronized (service.getNewMessages()) {
         // пока список пустой
         while (service.getNewMessages().isEmpty()) {
         // мы ждем на этом списке
         service.getNewMessages().wait();
         }
         // мы формируем ответ клиенту
         List<MessageDto> result = new ArrayList<>(service.getNewMessages());
         // список сообщений очистили
         service.getNewMessages().clear();
         // отправили ответ
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
         **/

        synchronized (service.getNewMessages()) {
            // пока список пустой
            while (service.getNewMessages().isEmpty()) {
                // мы ждем на этом списке
                try {
                    service.getNewMessages().wait();
                } catch (InterruptedException e) {
                    throw new IllegalArgumentException();
                }
            }
            // мы формируем ответ клиенту
            List<MessageDto> result = new ArrayList<>(service.getNewMessages());
            // список сообщений очистили
            service.getNewMessages().clear();
            // отправили ответ
            return result;
        }
    }

    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    public void sendMessage(@RequestBody MessageDto messageDto) {
        service.handleMessage(messageDto);
    }

}

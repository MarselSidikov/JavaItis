package ru.itis;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 22.11.16
 * MessagesService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Service
public class MessagesService {

    private List<MessageDto> newMessages;

    public MessagesService() {
        newMessages = new ArrayList<>();
    }

    public void handleMessage(MessageDto inputMessage) {
        synchronized (newMessages) {
            newMessages.add(inputMessage);
            newMessages.notify();
        }
    }

    public List<MessageDto> getNewMessages() {
       return newMessages;
    }
}

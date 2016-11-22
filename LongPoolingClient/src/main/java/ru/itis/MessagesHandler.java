package ru.itis;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 22.11.16
 * MessagesHandler
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MessagesHandler implements Runnable {

    public void run() {
        while(true) {
            RestTemplate template = new RestTemplate();

            ResponseEntity<MessageDto[]> response = template.getForEntity("http://localhost:8080/messages", MessageDto[].class);
            MessageDto[] messages = response.getBody();

            for (MessageDto currentMessage : messages) {
                System.out.println(currentMessage.getText());
            }
        }
    }
}

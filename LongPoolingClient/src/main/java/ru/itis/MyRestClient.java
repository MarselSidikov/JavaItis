package ru.itis;

import org.springframework.web.client.RestTemplate;

/**
 * 22.11.16
 * MyRestClient
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MyRestClient {
    public void sendMessage(MessageDto messageDto) {
        RestTemplate template = new RestTemplate();
        template.postForObject("http://localhost:8080/messages", messageDto, MessageDto.class);
    }

}

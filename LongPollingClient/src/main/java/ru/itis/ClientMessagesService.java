package ru.itis;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientMessagesService {

    // сервис, который запускает задачи, которые необходимо
    // выполнять в потоках
    // реализует шаблон ThreadPool
    private ExecutorService executorService;

    // обертка над RestTemplate - класс, позволяющий отправлять HTTP сообщения
    // на сервер
    private MyRestClient myRestClient;

    public ClientMessagesService() {
        // создали пул потоков из одного потока
        executorService = Executors.newFixedThreadPool(1);
        myRestClient = new MyRestClient();
    }

    private void messagesHandle() {

        // перехват сообщений с сервера
        Runnable handleMessagesTask = () -> {
            while(true) {
                // мы получаем сообщения
                MessageDto[] messages = myRestClient.getMessages();
                // выводим каждое сообщение на экран
                for (MessageDto currentMessage : messages) {
                    System.out.println(currentMessage.getText());
                }
            }
        };
        // запускаем задачу на выполнение
        executorService.submit(handleMessagesTask);
    }

    //основной метод приложения
    public void messagesProcessing() {
        // запускаем обработку сообщений сервера
        messagesHandle();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            // считываем текст сообщения
            String text = scanner.nextLine();
            // создаем сообщение
            MessageDto messageDto = new MessageDto("marselka", text);
            // отправляем на сервер
            myRestClient.sendMessage(messageDto);
        }
    }
}

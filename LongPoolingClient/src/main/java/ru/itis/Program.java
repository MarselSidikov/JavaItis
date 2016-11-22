package ru.itis;

import java.util.Scanner;

/**
 * 22.11.16
 * Program
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Program {
    public static void main(String[] args) {

        MyRestClient restClient = new MyRestClient();

        Thread thread = new Thread(new MessagesHandler());
        thread.start();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String text = scanner.nextLine();

            MessageDto messageDto = new MessageDto("marselka", text);

            restClient.sendMessage(messageDto);
        }
    }
}

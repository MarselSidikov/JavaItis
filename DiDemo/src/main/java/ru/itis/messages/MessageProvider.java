package ru.itis.messages;

/**
 * Компонент, который отвечает за содержание сообщения
 */
public interface MessageProvider {
    /**
     * Получение сообщения, которое нужно вывести на экран
     * @return текст сообщение
     */
    String getMessage();
}

package ru.itis.messages;

/**
 * Класс, отвечающий за вывод сообщений на экран
 */
public interface MessageRenderer {
    // ВЫВОД СООБЩЕНИЯ
    void render();

    void setMessageProvider(MessageProvider messageProvider);

    MessageProvider getMessageProvider();
}

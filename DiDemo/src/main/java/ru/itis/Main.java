package ru.itis;

import ru.itis.messages.MessageProvider;
import ru.itis.messages.MessageRenderer;
import ru.itis.messages.MessageSupportFactory;

public class Main {
    public static void main(String[] args) {
        MessageRenderer renderer =
                MessageSupportFactory.getInstance().getRenderer();

        MessageProvider provider =
                MessageSupportFactory.getInstance().getProvider();

        renderer.setMessageProvider(provider);

        renderer.render();
    }
}

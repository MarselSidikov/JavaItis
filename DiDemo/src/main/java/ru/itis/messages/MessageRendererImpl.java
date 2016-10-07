package ru.itis.messages;

/**
 * Created by admin on 07.10.2016.
 */
public class MessageRendererImpl implements MessageRenderer {

    private MessageProvider provider;

    public void render() {
        if (this.provider != null) {
            System.out.println(provider.getMessage());
        } else throw new IllegalStateException();
    }

    public void setMessageProvider(MessageProvider messageProvider) {
        this.provider = messageProvider;
    }

    public MessageProvider getMessageProvider() {
        return this.provider;
    }
}

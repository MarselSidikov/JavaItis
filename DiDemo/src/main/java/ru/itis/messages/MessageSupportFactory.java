package ru.itis.messages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Класс отвечает за непосредственную инъекцию зависимости
 */
public class MessageSupportFactory {
    // Здесь мы храним единственный объект
    private static MessageSupportFactory instance;

    // сюда загружаем данные из messages.properties
    private Properties properties;

    private MessageProvider provider;
    private MessageRenderer renderer;

    private MessageSupportFactory() {
        try {
            properties = new Properties();
            properties.load(
                    new FileInputStream("C:\\Users\\admin.WIN-IPM3OA3VQNQ\\Desktop\\JAVA\\JavaItis\\DiDemo\\src\\main\\resources\\messages.properties"));

            String rendererClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");

            this.renderer = (MessageRenderer)Class.forName(rendererClass).newInstance();
            this.provider = (MessageProvider)Class.forName(providerClass).newInstance();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException();
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException();
        } catch (InstantiationException e) {
            throw new IllegalArgumentException();
        }
    }

    static  {
        instance = new MessageSupportFactory();
    }

    public MessageProvider getProvider() {
        return provider;
    }

    public MessageRenderer getRenderer() {
        return renderer;
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }
}

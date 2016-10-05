package ru.itis.tokenizer.tokens;

/**
 * Created by Ayrat on 03.10.2016.
 */
public interface Token {

    int start();

    int end();

    Tokens type();

    String content();
}

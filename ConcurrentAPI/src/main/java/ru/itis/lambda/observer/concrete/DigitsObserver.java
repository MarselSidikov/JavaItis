package ru.itis.lambda.observer.concrete;

import ru.itis.lambda.observer.TokenizerObserver;

public class DigitsObserver implements TokenizerObserver {
    @Override
    public void handle(char character) {
        if (Character.isDigit(character)) {
            System.out.println("From DigitsObserver: " + character);
        }
    }
}

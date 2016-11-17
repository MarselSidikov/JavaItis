package ru.itis.lambda.observer.concrete;

import ru.itis.lambda.observer.TokenizerObservable;
import ru.itis.lambda.observer.TokenizerObserver;

import java.util.ArrayList;
import java.util.List;

public class StringTokenizer implements TokenizerObservable {

    // список наблюдателей
    private List<TokenizerObserver> observers;

    public StringTokenizer() {
        // реализуем конкретным классом список
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(TokenizerObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void tokenize(String text) {
        for (int i = 0; i < text.length(); i++) {
            notifyObservers(text.charAt(i));
        }
    }

    @Override
    public void notifyObservers(char character) {
        for (TokenizerObserver observer : observers) {
            observer.handle(character);
        }
    }
}

package ru.itis.lambda.observer;

import ru.itis.lambda.observer.TokenizerObserver;
import ru.itis.lambda.observer.concrete.DigitsObserver;
import ru.itis.lambda.observer.concrete.StringTokenizer;

public class MainLambda {
    private final static String TEXT = "Hello, 123";
    public static void main(String[] args) {

        StringTokenizer tokenizer = new StringTokenizer();

        TokenizerObserver digitObserver = new DigitsObserver();

        tokenizer.addObserver(digitObserver);

        tokenizer.tokenize(TEXT);
        System.out.println("-----------------------");


        TokenizerObserver allCharacterObserver = new TokenizerObserver() {
            @Override
            public void handle(char character) {
                System.out.println("FROM AllCharacterObserver: " + character);
            }
        };

        tokenizer.addObserver(allCharacterObserver);

        tokenizer.tokenize(TEXT);
        System.out.println("-----------------------");


        TokenizerObserver lettersObserver = character -> {
            if (Character.isLetter(character)) {
                System.out.println("FROM LettersObserver: " + character);
            }
        };

        tokenizer.addObserver(lettersObserver);

        tokenizer.tokenize(TEXT);
        System.out.println("-----------------------");

        tokenizer.addObserver(character -> {
            if (Character.isLowerCase(character)) {
                System.out.println("FROM LambdaObserver: " + character);
            }
        });

        tokenizer.tokenize(TEXT);
    }
}

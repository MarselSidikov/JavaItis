package ru.itis.lambda.observer;

public interface TokenizerObservable {
    /**
     * Добавить наблюдателя
     * @param observer конкретный наблюдатель
     */
    void addObserver(TokenizerObserver observer);

    /**
     * Оповестить всех наблютелей о символе
     * @param character сам символ
     */
    void notifyObservers(char character);

    /**
     * Просматривает посимвольно текст
     * @param text сам текст
     */
    void tokenize(String text);
}

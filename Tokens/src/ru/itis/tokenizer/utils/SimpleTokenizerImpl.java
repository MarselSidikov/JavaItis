package ru.itis.tokenizer.utils;

import ru.itis.tokenizer.tokens.*;
import ru.itis.tokenizer.tokens.Number;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ayrat on 03.10.2016.
 */
public class SimpleTokenizerImpl implements Tokenizer {

    @Override
    public List<Token> parse(String text) {
        Tokens previousCharacterType = null;
        List<Token> tokens = new ArrayList<>();
        String word = "";
        int start = 0;
        int end = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (getCharType(currentChar) == Tokens.PUNCTUATION){
                Token token = new Punctuation(i, i, Tokens.PUNCTUATION, String.valueOf(currentChar));
                tokens.add(token);
            } else if(getCharType(currentChar) == Tokens.WORD){
                word+=currentChar;
                if(previousCharacterType == null || previousCharacterType != Tokens.WORD){
                    start = i;
                }else if((i == text.length() - 1) || ((i < text.length() - 1)
                        && getCharType(text.charAt(i + 1)) != Tokens.WORD)){
                    end = i;
                    Token token = new Word(start, end, Tokens.WORD, word);
                    tokens.add(token);
                    word = "";
                }
            } else if(getCharType(currentChar) == Tokens.NUMBER){
                word+=currentChar;
                if(previousCharacterType == null || previousCharacterType != Tokens.NUMBER){
                    start = i;
                }else if((i == text.length() - 1) || ((i < text.length() - 1)
                        && getCharType(text.charAt(i + 1)) != Tokens.NUMBER)){
                    end = i;
                    Token token = new Number(start, end, Tokens.NUMBER, word);
                    tokens.add(token);
                    word = "";
                }
            }
            previousCharacterType = getCharType(currentChar);
        }
        return tokens;
    }

    /**
     * Получает тип символа
     * @param c - анализируемый символ
     * @return тип символа из перечисления
     */
    private Tokens getCharType(char c) {
        if (Character.isLetter(c)) {
            return Tokens.WORD;
        } else if (Character.isDigit(c)) {
            return Tokens.NUMBER;
        } else if (Character.isWhitespace(c)) {
            return Tokens.WHITESPACE;
        } else return Tokens.PUNCTUATION;
    }
}

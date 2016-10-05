package ru.itis.tokenizer;

import ru.itis.tokenizer.tokens.Token;
import ru.itis.tokenizer.utils.SimpleTokenizerImpl;
import ru.itis.tokenizer.utils.Tokenizer;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        String target = scanner.nextLine();

        setMsg(target);

        Tokenizer tokenizer = new SimpleTokenizerImpl();

        // список токенов
        List<Token> tokens = tokenizer.parse(target);

        for (Token token : tokens){
            setMsg(token.toString());
        }
    }

    public static void setMsg(String msg){
        System.out.println(msg);
    }
}

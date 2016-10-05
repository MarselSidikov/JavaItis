package ru.itis.tokenizer;


import org.junit.Before;
import org.junit.Test;
import ru.itis.tokenizer.tokens.*;
import ru.itis.tokenizer.tokens.Number;
import ru.itis.tokenizer.utils.SimpleTokenizerImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by Ayrat on 04.10.2016.
 */
public class SimpleTokenizerImplTest {

    private SimpleTokenizerImpl tokenizer;

    private static final String TEXT_TO_PARSE = "Hello, 123 world!";
    private static final List<Token> PARSED_TEXT = generateParsedText();

    private static List<Token> generateParsedText() {
        Token word = new Word(0, 4, Tokens.WORD, "Hello");
        Token punctuation = new Punctuation(5, 5, Tokens.PUNCTUATION, ",");
        Token numbers = new Number(7, 9, Tokens.NUMBER, "123");
        Token word2 = new Word(11, 15, Tokens.WORD, "world");
        Token punctuation2 = new Punctuation(16, 16, Tokens.PUNCTUATION, "!");

        List<Token> result = new ArrayList<>();
        result.add(word);
        result.add(punctuation);
        result.add(numbers);
        result.add(word2);
        result.add(punctuation2);

        return result;
    }

    @Before
    public void setUp() throws Exception{
        tokenizer = new SimpleTokenizerImpl();
    }

    @Test
    public void parse() throws Exception {
        List<Token> expected = PARSED_TEXT;
        List<Token> actual = tokenizer.parse(TEXT_TO_PARSE);
        // assertThat - сравнивает объекты-списки
        assertThat(actual, is(expected));
    }
}
package ru.itis.tokenizer.utils;

import ru.itis.tokenizer.tokens.Token;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ayrat on 04.10.2016.
 */
public class RegularTokenizerImpl implements Tokenizer {

    private static final String WORD_PATTERN = "([A-z])\\w+";
    private static final String NUMBER_PATTERN = "([0-9])\\d+";
    private static final String PUNCTUATION_PATTERN = "";

    @Override
    public List<Token> parse(String text) {
        text = text.replaceAll(" ", "");
        Pattern wordPattern = Pattern.compile(WORD_PATTERN);
        Matcher wordMatcher = wordPattern.matcher(text);
        return null;
    }
}

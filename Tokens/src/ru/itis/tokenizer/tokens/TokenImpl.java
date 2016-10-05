package ru.itis.tokenizer.tokens;

public class TokenImpl implements Token {
    protected int start;
    protected int end;
    protected Tokens type;
    protected String content;

    @Override
    public int start() {
        return start;
    }

    @Override
    public int end() {
        return end;
    }

    @Override
    public Tokens type() {
        return type;
    }

    @Override
    public String content() {
        return content;
    }

    @Override
    public String toString() {
        return "Start: " + this.start + ", End: " + this.end + ", Type: " + this.content;
    }
}

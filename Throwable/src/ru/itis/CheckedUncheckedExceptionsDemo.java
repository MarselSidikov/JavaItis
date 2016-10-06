package ru.itis;


import java.io.IOException;

public class CheckedUncheckedExceptionsDemo {
    public int calcPositive(int a, int b) {
        if (a > 0 && b > 0) {
            return a + b;
        } else throw new IllegalArgumentException();
    }

    public int calcNegative(int a, int b) throws IOException {
        if (a < 0 && b < 0) {
            return a + b;
        } else throw new IOException();
    }
}

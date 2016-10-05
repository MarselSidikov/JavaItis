package ru.itis.models;

public class A {
    private int a;

    public A(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }

    public String toString() {
        return "A: " + this.a;
    }

    public void pow() {
        this.a =  a * a;
    }
}


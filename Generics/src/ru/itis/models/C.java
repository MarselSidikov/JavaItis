package ru.itis.models;

/**
 * Created by admin on 05.10.2016.
 */
public class C implements B {
    private int c;

    public C(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void pow3() {
        this.c = c * c * c;
    }

    @Override
    public void someCalc() {
        System.out.println(c * c + 2);
    }

    @Override
    public int number() {
        return this.c;
    }
}

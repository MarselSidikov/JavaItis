package ru.itis.models;

/**
 * Created by admin on 05.10.2016.
 */
public class D implements B{
    private int d;

    public D(int c) {
        this.d = c;
    }

    public int getD() {
        return d;
    }

    public void pow3() {
        this.d = d * d * d;
    }

    @Override
    public void someCalc() {
        System.out.println(d * d + 2);
    }

    @Override
    public int number() {
        return this.d;
    }
}

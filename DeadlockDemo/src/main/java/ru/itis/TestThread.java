package ru.itis;

public class TestThread {
    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        ThreadDemo2 threadDemo2 = new ThreadDemo2();

        threadDemo1.start();
        threadDemo2.start();



    }
}

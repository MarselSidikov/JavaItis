package ru.itis;

import static ru.itis.TestThread.Lock1;
import static ru.itis.TestThread.Lock2;

public class ThreadDemo1 extends Thread {
    public void run() {
        // заняли Lock1
        synchronized (Lock1) {
            System.out.println("Thread1: Holding lock1");

            // усыпили поток на 10 мс
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}

            // теперь мы ждем lock2
            System.out.println("Thread1 waiting for lock2");

            // заняли lock2
            synchronized (Lock2) {
                System.out.println("Thread1: Holding lock2 & lock1");
            }
        }
    }
}

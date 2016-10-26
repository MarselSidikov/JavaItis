package ru.itis;

import static ru.itis.TestThread.Lock1;
import static ru.itis.TestThread.Lock2;

public class ThreadDemo2 extends Thread {
    public void run() {
        // заняли Lock1
        synchronized (Lock1) {
            System.out.println("Thread2: Holding lock1");

            // усыпили поток на 10 мс
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}

            // теперь мы ждем lock1
            System.out.println("Thread2 waiting for lock2");

            // заняли lock1
            synchronized (Lock2) {
                System.out.println("Thread2: Holding lock2 & lock1");
            }
        }
    }
}

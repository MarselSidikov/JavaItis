package ru.itis.threads.worker;

public class MainPoolRun {
    public static void main(String[] args) {
        Runnable taskShowNumbers = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        };

        Runnable taskShowLetters = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + "A");
            }
        };

        WorkQueue workQueue = new WorkQueue(2);

        workQueue.execute(taskShowNumbers);
        workQueue.execute(taskShowLetters);

    }
}

package ru.itis.threads.concurrent;

import org.omg.CORBA.TIMEOUT;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
    //  ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.submit( () -> {
            System.out.println("Start: TASK1");
            for (int i = 0; i < 100; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread().getName() + " TASK 1 " +" I'm interrupted");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " TASK 1 " + i);
            }
        });

        pool.submit( () -> {
            System.out.println("Start: TASK2");
            for (int i = 0; i < 100; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread().getName() + " TASK 2 " +" I'm interrupted");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " TASK 2 " + i );
            }
        });

        pool.submit( () -> {
            System.out.println("Start: TASK3");
            for (int i = 0; i < 100; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println(Thread.currentThread().getName() + " TASK 2 " +" I'm interrupted");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " TASK 3 " + i );
            }
        });

        try {
            System.out.println(Thread.currentThread().getName() + " attempt to shutdown");
            pool.shutdown();
            pool.awaitTermination(60, TimeUnit.MICROSECONDS);
            System.out.println(Thread.currentThread().getName() + " shutdowned");
        } catch (InterruptedException e) {
           System.out.println("ERROR - " + e);
        } finally {
            if (!pool.isTerminated()) {
                System.out.println(Thread.currentThread().getName()+ " cancel non finished tasks");
            }

            List<Runnable> notFinishedTasks = pool.shutdownNow();

            notFinishedTasks.stream().forEach(runnable -> {
                System.out.println(runnable);
            });

            System.out.println(Thread.currentThread().getName() + " shutdown finished");
        }
    }
}

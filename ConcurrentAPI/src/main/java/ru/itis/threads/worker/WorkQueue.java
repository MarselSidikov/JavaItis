package ru.itis.threads.worker;


import java.util.LinkedList;

public class WorkQueue {
    // количество потоков в пуле
    private final int nThreads;
    // сами потоки
    private final PoolWorker[] threads;
    // очередь потоков
    private final LinkedList<Runnable> queue;

    public WorkQueue(int nThreads) {
        // инициализируем количество потоков в пуле
        this.nThreads = nThreads;
        // создаем очередь задач
        queue = new LinkedList<>();
        // создаем очередь потоков
        threads = new PoolWorker[nThreads];

        // инициализируем каждый поток и запускаем
        for (int i=0; i<nThreads; i++) {
            threads[i] = new PoolWorker();
            threads[i].start();
        }
    }

    // запускаем задачу в поток
    public void execute(Runnable task) {
        // блокируем очередь
        synchronized(queue) {
            // добавляем задачу
            queue.addLast(task);
            // оповещаем, что очередь свободна
            queue.notify();
        }
    }
    // поток, обрабатывающий задачу
    private class PoolWorker extends Thread {
        public void run() {
            // текущая задача
            Runnable task;

            // бесконечный цикл
            while (true) {
                // блокируем очередь
                synchronized(queue) {
                    // пока очередь пустая
                    while (queue.isEmpty()) {
                        // ждем задач
                        try {
                            queue.wait();
                        }
                        catch (InterruptedException ignored)
                        {
                        }
                    }

                    // достаем задачу из потока
                    task = queue.removeFirst();
                }

                // If we don't catch RuntimeException,
                // the pool could leak threads
                try {
                    task.run();
                }
                catch (RuntimeException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }
}



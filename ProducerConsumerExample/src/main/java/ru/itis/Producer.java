package ru.itis;

public class Producer extends Thread {
    private Product product;

    public Producer(Product product) {
        this.product = product;
    }

    public void run() {
        while (true) {
            synchronized (product) {
                while(!product.isUsed()) {
                    // снимаем блокировку
                    // поток, вызвал wait попадает в список ожидания


                    try {
                        System.out.println("Producer Waiting");
                        product.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Producer producing");
                product.produce();
                // поток, вызвавший notify будит из ожидания один из потоков в списке ожидания
                product.notify();
            }
        }
    }
}

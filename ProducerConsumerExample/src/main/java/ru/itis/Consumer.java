package ru.itis;

public class Consumer extends Thread {
    private Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    public void run() {
        while(true) {
            synchronized (product) {
                while(!product.isReady()) {
                    try {
                        System.out.println("Consumer Waiting");
                        product.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumer using");
                product.use();
                product.notify();
            }
        }
    }
}

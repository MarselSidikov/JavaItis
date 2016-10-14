package ru.itis;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + " " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        /**
         MyThread myThread = new MyThread();
         MyThread myThread1 = new MyThread();
         MyThread myThread2 = new MyThread();

         myThread.start();
         myThread1.start();
         myThread2.start();
         **/

        (new MyThread()).start();
        (new MyThread()).start();
        (new MyThread()).start();

    }
}

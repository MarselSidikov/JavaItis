package ru.itis;

import sun.awt.windows.ThemeReader;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(this.getName() + " " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

         MyThread myThread = new MyThread();
         MyThread myThread1 = new MyThread();
         MyThread myThread2 = new MyThread();

         myThread.start();
         myThread1.start();
         myThread2.start();

        myThread.run();
         while(myThread.getState() == State.RUNNABLE ||
                 myThread1.getState() == State.RUNNABLE ||
                 myThread2.getState() == State.RUNNABLE) {
             System.out.println(Thread.currentThread().getName() + ": " +
                     " " + myThread.getName() + "-" + myThread.getState()
             + ";" + myThread1.getName() + "-" + myThread1.getState() + ";" +
                     myThread2.getName() + "-" + myThread2.getState());
         }

        /**
        (new MyThread()).start();
        (new MyThread()).start();
        (new MyThread()).start();
        **/
    }
}

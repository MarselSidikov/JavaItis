package ru.itis;

public class SecondMyThread extends Thread {
    private int s = 0;

    public int getS() {
        return s;
    }

    @Override
    public void run() {
        for (int i =0; i < 50; i++) {
            s += i;
        }
    }

    public static void main(String[] args) throws Exception {
        SecondMyThread thread = new SecondMyThread();
        // thread.join();
         thread.start();

        int result = thread.getS();

        System.out.println(result); // в данном случае второй поток
        // не успел посчитать значение, которое сразу же вывел main

        try {
            // main ждет, пока поток не закончит работу
            System.out.println("State1: " + Thread.currentThread().getState());
            thread.join();
            System.out.println("State2: " + Thread.currentThread().getState());
            int result2 = thread.getS();
            System.out.println(result2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

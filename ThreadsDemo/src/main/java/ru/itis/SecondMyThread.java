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

    public static void main(String[] args) {
        SecondMyThread thread = new SecondMyThread();
        thread.start();

        try {
            // main ждет, пока поток не закончит работу
            thread.join();
            int result = thread.getS();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

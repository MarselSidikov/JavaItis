/**
 * Created by admin on 14.10.2016.
 */
public class MyThread3 implements Runnable {
    private Thread thread;

    public MyThread3() {
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Bye!!!!");
        }
    }
}

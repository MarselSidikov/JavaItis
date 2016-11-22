/**
 * Created by admin on 14.10.2016.
 */
public class ShowBye implements Runnable {
    private Thread thread;

    private ShowBye() {
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Bye!!!!");
        }
    }

    public static ShowBye runTask() {
        return new ShowBye();
    }
}

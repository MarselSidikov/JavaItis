
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread2());

        thread.start();
        thread2.start();
        MyThread3 thread3 = new MyThread3();
    }
}

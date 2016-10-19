package ru.itis;

public class VolatileExample {
    // volatile - переменная будет использоваться другими потоками!
    // мы говорим виртуальной машине о том, что не надо проводить оптимизации
    // и кешировать переменную для каждого потока
    public static volatile int MY_INT = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }
}

package ru.itis.generics.methods;

import ru.itis.models.A;
import ru.itis.models.B;
import ru.itis.models.C;
import ru.itis.models.D;

public class Main {

    public static <T extends B> int method(T a, T b) {
        int result = a.number() + b.number();
        return result;
    }
    public static void main(String[] args) {
        D d = new D(5);
        C c = new C(10);

        int result = method(d, c);

        System.out.println(result);

        A a = new A(10);
        A a1 = new A(15);

        // result = method(a, a1);
    }
}

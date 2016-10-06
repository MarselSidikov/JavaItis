package ru.itis.generics.methods;

import ru.itis.models.*;

public class Main {

    public static <T extends B> int method(T a, T b) {
        int result = a.number() + b.number();
        return result;
    }

    // выод типов ??
    public static <T> void method2(T x, T y) {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        D d = new D(5);
        C c = new C(10);

        int result = method(d, c);

        System.out.println(result);

        A a = new A(10);
        A a1 = new A(15);

        Q q = new Q();
        P p = new P();
        method2(p, q);
        // result = method(a, a1);
    }
}

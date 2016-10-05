package ru.itis.objects;

import ru.itis.models.A;
import ru.itis.models.C;

public class Main {

    public static void main(String[] args) {
        List list = new ListArrayImpl();
        list.add(6);
        list.add(7);

        List list1 = new ListArrayImpl();
        A a = new A(10);
        A a1 = new A(9);

        list1.add(a);
        list1.add(a1);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));

        A aFromList = (A)list1.get(0);

        aFromList.pow();

        System.out.println(aFromList);

        C c = new C(15);

        list1.add(c);

        aFromList = (A)list1.get(2);

        System.out.println(aFromList);
    }
}

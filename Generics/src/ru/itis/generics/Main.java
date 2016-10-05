package ru.itis.generics;


import ru.itis.models.A;
import ru.itis.models.B;
import ru.itis.models.C;
import ru.itis.models.D;

public class Main {
    public static void main(String[] args) {
        List<A> listOfA = new ListArrayImpl<>();

        A a = new A(10);
        A a1 = new A(9);

        listOfA.add(a);
        listOfA.add(a1);

        A aFromList = listOfA.get(0);

        C c = new C(10);

        // listOfA.add(c);
        System.out.println(aFromList);

        ListOfB<C> listOfB = new ListArrayOfBImpl<>();

        // ListOfB<A> listOfAasB = new ListArrayOfBImpl<>();

        ListOfB<D> listOfB1 = new ListArrayOfBImpl<>();
    }
}

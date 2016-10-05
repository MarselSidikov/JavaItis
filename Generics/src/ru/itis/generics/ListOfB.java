package ru.itis.generics;

import ru.itis.models.B;

/**
 * Created by admin on 05.10.2016.
 */
public interface ListOfB<T extends B> {
    void add(T element);
    T get(int index);
}

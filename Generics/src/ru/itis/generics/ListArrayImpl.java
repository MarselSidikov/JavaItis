package ru.itis.generics;

/**
 * Created by admin on 05.10.2016.
 */
public class ListArrayImpl<T> implements List<T> {
    private static final int MAX_SIZE =  5;

    private Object data[];
    private int count;

    public ListArrayImpl() {
        this.data = new Object[MAX_SIZE];
        this.count = 0;
    }
    @Override
    public void add(T element) {
        if (count < MAX_SIZE) {
            this.data[count] = element;
            count++;
        } else throw new IllegalArgumentException();
    }

    @Override
    public T get(int index) {
        if (index < count) {
            return (T)this.data[index];
        }  throw new IllegalArgumentException();
    }
}

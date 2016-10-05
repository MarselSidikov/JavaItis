package ru.itis.objects;


public class ListArrayImpl implements List {
    private static final int MAX_SIZE =  5;

    private Object data[];
    private int count;

    public ListArrayImpl() {
        this.data = new Object[MAX_SIZE];
        this.count = 0;
    }
    @Override
    public void add(Object element) {
        if (count < MAX_SIZE) {
            this.data[count] = element;
            count++;
        } else throw new IllegalArgumentException();
    }

    @Override
    public Object get(int index) {
        if (index < count) {
            return this.data[index];
        }  throw new IllegalArgumentException();
    }
}

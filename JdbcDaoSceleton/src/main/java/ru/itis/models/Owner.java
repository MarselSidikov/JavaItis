package ru.itis.models;

import com.google.common.base.MoreObjects;


public class Owner {
    private int id;
    private String name;

    public Owner(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", this.id)
                .add("name", this.name)
                .toString();
    }
}

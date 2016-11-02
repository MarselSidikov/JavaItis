package ru.itis;

import java.util.List;

public class User {
    private String name;
    private int age;
    private int[] ids;
    private List<Auto> autos;

    public User() {
    }

    public User(String name, int age, int[] ids, List<Auto> autos) {
        this.name = name;
        this.age = age;
        this.ids = ids;
        this.autos = autos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getIds() {
        return ids;
    }

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }
}

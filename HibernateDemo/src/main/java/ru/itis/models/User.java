package ru.itis.models;

import java.util.List;

public class User {
    private Integer id;
    private String name;
    private List<Auto> autos;
    private Integer age;

    public User(Integer id, String name, List<Auto> autos, Integer age) {
        this.id = id;
        this.name = name;
        this.autos = autos;
        this.age = age;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

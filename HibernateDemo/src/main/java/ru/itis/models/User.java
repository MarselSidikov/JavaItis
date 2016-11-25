package ru.itis.models;

import java.util.List;

public class User {
    private Integer id;
    private String name;
    private List<Auto> autos;

    public User(Integer id, String name, List<Auto> autos) {
        this.id = id;
        this.name = name;
        this.autos = autos;
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
}

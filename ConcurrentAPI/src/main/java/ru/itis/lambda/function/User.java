package ru.itis.lambda.function;

public class User {
    private int age;
    private String name;
    private int autoCounts;

    public User(int age, String name, int autoCounts) {
        this.age = age;
        this.name = name;
        this.autoCounts = autoCounts;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAutoCounts() {
        return autoCounts;
    }

    public void setAutoCounts(int autoCounts) {
        this.autoCounts = autoCounts;
    }
}

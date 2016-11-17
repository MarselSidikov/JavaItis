package ru.itis.lambda.collections;


public class Driver {
    private int age;
    private String name;
    private int autoCount;
    private String autoName;

    public Driver(int age, String name, int autoCount, String autoName) {
        this.age = age;
        this.name = name;
        this.autoCount = autoCount;
        this.autoName = autoName;
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

    public int getAutoCount() {
        return autoCount;
    }

    public void setAutoCount(int autoCount) {
        this.autoCount = autoCount;
    }

    public String getAutoName() {
        return autoName;
    }

    public void setAutoName(String autoName) {
        this.autoName = autoName;
    }
}

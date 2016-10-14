package ru.itis;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.sun.media.jfxmedia.events.BufferListener;

public class Model {
    private String name;
    private int age;
    private double height;
    private double weight;
    private char sex;
    private boolean isMongol;
    private boolean isCrocodile;
    private String motherName;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public char getSex() {
        return sex;
    }

    public boolean isMongol() {
        return isMongol;
    }

    public boolean isCrocodile() {
        return isCrocodile;
    }

    public String getMotherName() {
        return motherName;
    }

    public Model(Builder builder) {
        this.age = builder.age;
        this.height = builder.height;
        this.isCrocodile = builder.isCrocodile;
        this.isMongol = builder.isMongol;
        this.name = builder.name;
        this.weight = builder.weight;
        this.motherName = builder.motherName;
        this.sex = builder.sex;
    }

    public static class Builder {
        private String name;
        private int age;
        private double height;
        private double weight;
        private char sex;
        private boolean isMongol;
        private boolean isCrocodile;
        private String motherName;

        public Builder name(String value) {
            name = value;
            return this;
        }

        public Builder age(int value) {
            age = value;
            return this;
        }

        public Builder height(double value) {
            height = value;
            return this;
        }
        public Builder weight(double value) {
            weight = value;
            return this;
        }

        public Builder sex(char value) {
            sex = value;
            return this;
        }

        public Builder isMongol(boolean value) {
            isMongol = value;
            return this;
        }

        public Builder isCrocodile(boolean value) {
            isCrocodile = value;
            return this;
        }

        public Builder motherName(String value) {
            motherName = value;
            return this;
        }

        public Model build() {
            return new Model(this);
        }
    }

    public boolean equals(Object object) {
        if (object == null || !object.getClass().equals(this.getClass())) {
            return false;
        } else {
            Model that = (Model)object;
            return Objects.equal(this.age, that.age) &&
                    Objects.equal(this.isMongol, that.isMongol);

        }
    }
}

package ru.itis;

public class Product {
    // статус продукта - готовность
    private boolean status = false;

    // готовность
    public boolean isReady() {
        return status;
    }

    // использовался он или нет
    public boolean isUsed() {
        return !status;
    }

    public void produce() {
        this.status = true;
    }

    // освободить продукт
    public void use() {
        // using
        this.status = false;
    }
}

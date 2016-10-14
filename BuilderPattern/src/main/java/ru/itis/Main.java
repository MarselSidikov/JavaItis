package ru.itis;

/**
 * Created by admin on 14.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model.Builder().
                age(10).
                height(22).
                isMongol(true).build();

        Model model1 = new Model.Builder().
                age(10).
                height(22).
                isMongol(true).build();

        if (model.equals(model1)) {
            System.out.println("EQUAL!!!!");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}

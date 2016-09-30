package ru.itis;

/**
 * Created by admin on 30.09.2016.
 */
public class RussianProgrammer implements Programmer {
    @Override
    public void goWork() {
        System.out.println("I'm russian");
    }

    @Override
    public int getSkillsCount() {
        return 50;
    }

    @Override
    public void Coding() {
        System.out.println("Coding");
    }
}

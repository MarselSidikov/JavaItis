package ru.itis;


public class GrandmotherProgrammerImpl implements Programmer {
    @Override
    public void goWork() {
        System.out.println("Grand go working");
    }

    @Override
    public int getSkillsCount() {
        return 10;
    }

    @Override
    public void Coding() {
        System.out.println("Grand coding");
    }
}

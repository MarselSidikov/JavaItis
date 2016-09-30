package ru.itis;

public class Main {

    public static void main(String[] args) {

        Programmer programmer1 = new GrandmotherProgrammerImpl();
        Programmer programmer2 = new RussianProgrammer();
        Programmer programmers[] = {programmer1, programmer2};

        programmers[0].goWork();

        System.out.println("Hey, director, " +
                "our programmer has " + programmers[1].getSkillsCount() +
        " skills");
    }
}

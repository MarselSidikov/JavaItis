package ru.itis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthNumber = scanner.nextInt();

        if (Season.WINTER.isIn(monthNumber)) {
            System.out.println(Season.WINTER);
        } else if (Season.SPRING.isIn(monthNumber)) {
            System.out.println(Season.SPRING);
        } else if (Season.SUMMER.isIn(monthNumber)) {
            System.out.println(Season.SUMMER);
        } else if (Season.AUTUMN.isIn(monthNumber)) {
            System.out.println(Season.AUTUMN);
        }

        Season season = Season.AUTUMN;

        int ordinal = season.ordinal();
        System.out.println(ordinal);

        if (season.ordinal() == 3) {

        }

        Season seasons[] = Season.values();
        
        Season winter = Season.valueOf("WINTER");

        System.out.println(winter);
    }
}

package ru.itis;

public enum Season {
    WINTER(new int[]{12,1,2}), SPRING(new int[]{3,4,5}),
    SUMMER(new int[]{6, 7, 8}), AUTUMN(new int[]{9,10, 11});

    private int[] months;

    public boolean isIn(int monthNumber) {
        for (int i = 0; i < months.length; i++) {
            if (months[i] == monthNumber) {
                return true;
            }
        } return false;
    }

    Season(int[] months) {
        this.months = months;
    }
}

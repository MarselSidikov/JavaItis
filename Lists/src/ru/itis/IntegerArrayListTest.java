package ru.itis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


// Этот класс - тестирует

// 1) Тест-метод тестирует один метод тестируемого класса
// 2) assertEquals  должен вызываться в одном месте, либо в циклах
// 3) actual - то, что получили, expected - то, что ожидаем
public class IntegerArrayListTest {

    private static int GET_CORRECT_POSITION = 2;
    private static int GET_CORRECT_ANSWER_ON_CORRECT_POSITION = 3;
    private static int INCORRECT_POSITION = 10;
    // объектная переменная для тестируемого объекта
    IntegerArrayList testedList;

    // @Before - означет, что метод будет запускаться перед каждым тестом
    @Before
    public void setUp() throws Exception {
        int testData[] = {2, 5, 3, 4, 8};

        testedList = new IntegerArrayList(testData);
    }

    // @Test - метод тест, тестируем метод get класса IntegerArrayList
    @Test
    public void testGetOnCorrectData() throws Exception {
        int expected = GET_CORRECT_ANSWER_ON_CORRECT_POSITION;

        int actual = testedList.get(GET_CORRECT_POSITION);

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetOnOnIncorrectData() throws Exception {
        testedList.get(INCORRECT_POSITION);
    }
}
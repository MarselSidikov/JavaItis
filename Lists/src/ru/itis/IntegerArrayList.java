package ru.itis;

/*
Список целых чисел на основе массива
 */
public class IntegerArrayList {

    private static final int MAX_SIZE = 10;

    // Массив данных
    private int data[];

    // Количество элементов
    private int count;

    public IntegerArrayList() {
        this.count = 0;
        this.data = new int[MAX_SIZE];
    }

    /**
     * Метод добавление элемента в конец списка
     * @param element элемент, который необходимо добавить
     * @throws IllegalArgumentException когда места нет
     */
    public void add(int element) {
        if (this.count < MAX_SIZE -1) {
            this.data[count] = element;
            count++;
        }
        // Создаем объект исключительной ситуации
        else throw new IllegalArgumentException();
    }

    /**
     * Добавление элемента в заданную позицию - элементы
     * правее позиции сдвигаются на один вправо
     * @param element элемент
     * @param position позиция, должна быть меньше, чем количество элементов
     * @throws IllegalArgumentException если вставляем элемент в самый конец, а там
     * элемент уже есть
     */
    public void add(int element, int position) {
        if (position < count && count < MAX_SIZE - 1) {
            // TODO: реализовать сдвиг
        }
    }

    /**
     * Удаление элемента со сдвигом
     * @param element элемент, который необходимо удалить
     * @return true, если удаление прошло успешно, false - если элемент не был найден
     */
    public boolean delete(int element) {
        return true;
    }

    /**
     * Удаление элемента из заданной позиции со сдвигом
     * @param position индекс, где находится удаляемый элемент
     */
    public void deleteByPosition(int position) {

    }

    /**
     * Поиск заданного элемента
     * @param element искомый элемент
     * @return индекс, в котором находится элемент. -1 - если элемент не найден
     */
    public int find(int element) {
        return -1;
    }

    /**
     * Получение элемента по индексу
     * @param position индекс искомого элемента
     * @return значение элемента
     */
    public int get(int position) {
        return -1;
    }
}

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        // получили класс SimpleClass как объект
        // и положили в объектную переменную clazz
        Class clazz = SimpleClass.class;

        // выводим на экран все названия открытых полей
        for (int i = 0; i < clazz.getFields().length; i++) {
            System.out.println(clazz.getFields()[i].getName());
        }

        // выводим на экран названия всех полей
        for (int i = 0; i < clazz.getDeclaredFields().length; i++) {
            System.out.println(clazz.getDeclaredFields()[i].getName());
        }

        // как создать объект данного класса с помощью рефлексии?
        SimpleClass simpleClass = (SimpleClass)clazz.newInstance();

        System.out.println(simpleClass.calc(10, 15));

        // а если хотим передать параметры через конструктор?
        Constructor constructor = clazz.getConstructor(int.class, String.class);

        SimpleClass simpleClass1 = (SimpleClass)constructor.newInstance(12, "Bye");

        Method method = clazz.getDeclaredMethod("calc", int.class, int.class);

        System.out.println(method.invoke(simpleClass1, 10, 12));

        System.out.println("------------------------");

        SimpleClass simpleClass2 = new SimpleClass();
        simpleClass2.x = 10;
        simpleClass2.y = 20;

        Method method1 = simpleClass2.getClass().getMethod("mult", int.class);

        System.out.println(method1.invoke(simpleClass2, 10));

        SimpleClass simpleClass3 = new SimpleClass();
        simpleClass3.x = 5;
        simpleClass3.y = 6;

        System.out.println(method1.invoke(simpleClass3, 10));

        Field field = simpleClass.getClass().getField("FieldInt");

        field.set(simpleClass3, 777);

        System.out.println(simpleClass3.FieldInt);

        Field privateField = simpleClass.getClass().getDeclaredField("privateStringField");

        // приватные поля можем только смотреть
        privateField.setAccessible(true);
        System.out.println(privateField.get(simpleClass));

    }
}

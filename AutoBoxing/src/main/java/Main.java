/**
 * Created by admin on 16.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Integer n1 = 30;
        Integer n2 = 30;

        System.out.println(n1 == n2);

        Integer n4 = 256;
        Integer n5 = 256;

        System.out.println(n4 == n5);

        // 69609650 - Hello
        // 65602
        String s = "";
        System.out.println(s.hashCode());

        String test = "Hello";

        if (test.equals("Hello")) {
            System.out.println("test passed 1");
        }

        String test2 = new String("Hello");

        if (test2.equals("Hello")) {
            System.out.println("test passed 2");
        }

        if (test == "Hello") {
            System.out.println("test passed 3");
        }

        String test4 = "Hello";
        String test42 = "Hello";

        if (test4 == test42) {
            System.out.println("test passed 4");
        }

        String test5 = new String("Hello");
        String test52 = new String("Hello");

        if (test5.equals(test52)) {
            System.out.println("test passed 5");
        }


        if (test5 == test52) {
            System.out.println("test passed 6");
        } else System.out.println("test failed 6");

        if (test4 == test52) {
            System.out.println("test passed 7");
        } else System.out.println("test failed 7");

        if (test5.intern() == test52.intern()) {
            System.out.println("test passed 8");
        }
        /*
        // These two have the same value
        new String("test").equals("test"); // --> true

        // ... but they are not the same object
        new String("test") == "test"; // --> false

        // ... neither are these
        new String("test") == new String("test") // --> false

        // ... but these are because literals are interned by
        // the compiler and thus refer to the same object
        "test" == "test" // --> true

        // ... but you should really just call Objects.equals()
        Objects.equals("test", new String("test")) // --> true
        Objects.equals(null, "test") // --> false
        */

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2);
        // intern - если в пуле строк эта строка уже есть - ее и возвращаю
        // если нет - добавляю и возвращаю
        System.out.println(s1.intern() == s2.intern());
    }
}

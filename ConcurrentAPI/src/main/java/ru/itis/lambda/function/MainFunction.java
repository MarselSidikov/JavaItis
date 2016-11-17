package ru.itis.lambda.function;

import java.util.function.Function;

public class MainFunction {
    public static void main(String[] args) {
        Function<User, String> stringRepresentOfUserNameAndAge = user -> user.getName() + " " + user.getAge();

        Function<User, String> stringRepresentOfUserCountOfAuto = user -> {
            return user.getAutoCounts() + "";
        };

        User user = new User(22, "Marsel", 0);

        String nameAndAge = stringRepresentOfUserNameAndAge.apply(user);
        String autoCount = stringRepresentOfUserCountOfAuto.apply(user);

        System.out.println(nameAndAge);
        System.out.println(autoCount);
    }
}

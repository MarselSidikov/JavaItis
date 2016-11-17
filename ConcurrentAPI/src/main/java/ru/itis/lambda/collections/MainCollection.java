package ru.itis.lambda.collections;

import ru.itis.lambda.function.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCollection {

    private static String merge(String ... values) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            stringBuilder.append(values[i]);
        }

        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        User marsel = new User(22, "Marsel", 0);
        User guzel = new User(22, "Guzel", 0);
        User anton = new User(29, "Anton", 1);
        User alexey = new User(22, "Alexey", 1);
        User vitaliy = new User(22, "Vitaliy", 1);
        User airat = new User(22, "Airat", 1);

        List<User> javaGroup = Arrays.asList(marsel,
                guzel, anton, alexey, vitaliy, airat);

        Stream<User> drivers = javaGroup.stream().filter(user -> user.getAutoCounts() > 0);

        drivers.forEach(user -> System.out.println(user.getName()));

        /**
        Stream<Driver> otherDrivers = javaGroup.stream().filter(driver -> driver.getAutoCounts() > 0)
                .map(new Function<User, Driver>() {
                    @Override
                    public Driver apply(User user) {
                        return new Driver(user.getAge(), user.getName(), user.getAutoCounts(),
                                "MOSCKVICH");
                    }
                });
         **/

        Stream<Driver> otherDrivers = javaGroup.stream().filter(user -> user.getAutoCounts() > 0)
                .map(user -> new Driver(user.getAge(), user.getName(), user.getAutoCounts(),
                        "MOSCKVICH"));
        otherDrivers.forEach(driver -> System.out.println(driver.getName() + " " + driver.getAutoName()));

        List<Driver> driverList = javaGroup.stream().filter(user -> user.getAutoCounts() > 0)
                .map(user -> new Driver(user.getAge(), user.getName(), user.getAutoCounts(),
                        "MOSCKVICH")).collect(Collectors.toList());
    }

}

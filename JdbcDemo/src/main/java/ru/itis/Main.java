package ru.itis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;

        String URL = "jdbc:postgresql://localhost:5432/SimpleDb";

        String name = "postgres";
        String password = "qwerty007";

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, name, password);

            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery("SELECT car_id, name FROM cars, " +
                    "owners WHERE owners.city = 'Kazan' AND " +
                    "cars.owner_id = owners.owner_id");

            while(result.next()) {
                System.out.println(result.getInt("car_id") +
                        " " + result.getString("name"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

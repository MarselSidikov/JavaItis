package ru.itis;

import java.sql.*;

public class Main {

    // language=SQL
    private static final String SQL_INSERT_OWNER_QUERY =
            "INSERT INTO owners(city, age, name) VALUES (?, ?, ?);";


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
            /*
            statement.executeUpdate("INSERT INTO " +
                    "owners(city, age, name) VALUES ('Moscow', 22, 'Marsel');");
            */

            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_OWNER_QUERY);

            preparedStatement.setString(1, "New York");
            preparedStatement.setInt(2, 30);
            preparedStatement.setString(3, "John");

            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

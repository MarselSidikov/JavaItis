package ru.itis.utils;

import ru.itis.dao.OwnersDao;
import ru.itis.factories.ConnectionFactory;
import ru.itis.factories.DaoFactory;
import ru.itis.models.Owner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Verifier {

    private static Connection connection;

    static {
        connection = ConnectionFactory.getInstance().getConnection();
    }
    // language=SQL
    private static final String SQL_FIND_OWNER = "SELECT * FROM owners WHERE owner_id = ?;";

    public static void verifyUserExist(int userId) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_FIND_OWNER);
            preparedStatement.setInt(1, userId);

            ResultSet result = preparedStatement.executeQuery();

            if (!result.next()) {
                throw new IllegalArgumentException("USER_NOT_FOUND");
            }
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}

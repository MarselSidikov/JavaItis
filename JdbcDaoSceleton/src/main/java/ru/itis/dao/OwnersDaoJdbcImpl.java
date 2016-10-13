package ru.itis.dao;

import ru.itis.models.Owner;

import java.sql.*;

public class OwnersDaoJdbcImpl implements OwnersDao {

    private Connection connection;

    // language=SQL
    private final String SQL_FIND_OWNER = "SELECT * FROM owners WHERE owner_id = ?;";

    public OwnersDaoJdbcImpl(Connection connection) {
        this.connection = connection;
    }

    public Owner find(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_FIND_OWNER);
            preparedStatement.setInt(1, id);

            ResultSet result = preparedStatement.executeQuery();

            result.next();
            return new Owner(result.getInt("owner_id"), result.getString("name"));

        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }

    }
}

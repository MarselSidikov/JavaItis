package ru.itis.factories;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {
    private static ConnectionFactory instance;

    private Connection connection;
    private Properties properties;

    private ConnectionFactory() {
        this.properties = new Properties();
        try {
            properties.load(new FileInputStream("C:\\Users\\admin.WIN-IPM3OA3VQNQ\\Desktop\\JAVA\\JavaItis\\" +
                    "JdbcDaoSceleton\\src\\main\\resources\\connetion.properties"));

            String URL = properties.getProperty("jdbc.url");
            String name = properties.getProperty("jdbc.name");
            String password = properties.getProperty("jdbc.password");

            String driverName = properties.getProperty("jdbc.driver");
            Class.forName(driverName);
            connection = DriverManager.getConnection(URL, name, password);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    static {
        instance = new ConnectionFactory();
    }

    public static ConnectionFactory getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return this.connection;
    }
}

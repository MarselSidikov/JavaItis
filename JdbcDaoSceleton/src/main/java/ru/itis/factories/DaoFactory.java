package ru.itis.factories;


import ru.itis.dao.OwnersDao;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.sql.Connection;
import java.util.Properties;

public class DaoFactory {
    private static DaoFactory instance;

    private Properties properties;

    private OwnersDao ownersDao;

    private DaoFactory() {
        this.properties = new Properties();
        try {
            properties.load(new FileInputStream("C:\\Users\\admin.WIN-IPM3OA3VQNQ\\Desktop\\JAVA\\JavaItis\\" +
                    "JdbcDaoSceleton\\src\\main\\resources\\dao.properties"));

            String daoClassName = properties.getProperty("dao.class");

            Class clazz = Class.forName(daoClassName);

            Constructor constructor = clazz.getConstructor(Connection.class);

            ownersDao = (OwnersDao)constructor.newInstance(ConnectionFactory.getInstance().getConnection());

        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    static {
        instance = new DaoFactory();
    }

    public static DaoFactory getInstance() {
        return instance;
    }
    public OwnersDao getOwnersDao() {
        return this.ownersDao;
    }
}

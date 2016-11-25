package ru.itis.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnector {
    private static HibernateConnector connector;
    private Configuration configuration;
    private SessionFactory sessionFactory;

    private HibernateConnector() {
        configuration = new Configuration();

        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/java_itis_group");
        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "qwerty007");
        configuration.setProperty("hibernate.show_sql", "false");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        configuration.addResource("User.hbm.xml");
        configuration.addResource("Auto.hbm.xml");

        sessionFactory = configuration.buildSessionFactory();
    }

    static {
        connector = new HibernateConnector();
    }

    public static HibernateConnector getConnector() {
        return connector;
    }

    public Session getSession() throws HibernateException {
        Session session = sessionFactory.openSession();
        if (!session.isConnected()) {
            this.reconnect();
        }
        return session;
    }

    private void reconnect() throws HibernateException {
        this.sessionFactory = configuration.buildSessionFactory();
    }
}

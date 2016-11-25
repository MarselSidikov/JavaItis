package ru.itis.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.itis.hibernate.HibernateConnector;
import ru.itis.models.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public class UsersDaoHibernateImpl {
    Session session;

    public UsersDaoHibernateImpl() {
        this.session = HibernateConnector.getConnector().getSession();
    }

    public List<User> findAll() {
        return session.createQuery("from User", User.class).list();
    }
}

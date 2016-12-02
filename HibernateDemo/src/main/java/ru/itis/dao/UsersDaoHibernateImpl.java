package ru.itis.dao;

import org.hibernate.Session;

import ru.itis.hibernate.HibernateConnector;
import ru.itis.models.Child;
import ru.itis.models.User;

import java.util.List;

@SuppressWarnings("JpaQlInspection")
public class UsersDaoHibernateImpl {
    Session session;

    public UsersDaoHibernateImpl() {

    }

    public List<User> findByName(String name) {
        this.session = HibernateConnector.getConnector().getSession();
        session.beginTransaction();

        List<User> result =  session.createQuery("from User user where name = :userName", User.class).
                setParameter("userName", name).list();
        session.getTransaction().commit();

        return result;
    }

    public Integer saveChild(Child child) {
        this.session = HibernateConnector.getConnector().getSession();
        session.beginTransaction();

        Integer resultId = (Integer) session.save(child);

        session.getTransaction().commit();

        return resultId;
    }
}

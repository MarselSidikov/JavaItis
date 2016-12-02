package ru.itis;

import ru.itis.dao.UsersDaoHibernateImpl;
import ru.itis.models.Auto;
import ru.itis.models.Child;
import ru.itis.models.User;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        UsersDaoHibernateImpl hibernate = new UsersDaoHibernateImpl();
        List<User> users = hibernate.findByName("Toleg");

        User user = users.get(0);
        Child child = new Child("rebenok", user);

        System.out.println(hibernate.saveChild(child));

        int i = 0;
    }
}

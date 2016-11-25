package ru.itis;

import ru.itis.dao.UsersDaoHibernateImpl;
import ru.itis.models.Auto;
import ru.itis.models.User;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        UsersDaoHibernateImpl hibernate = new UsersDaoHibernateImpl();
        List<User> users = hibernate.findAll();

        for (User user : users) {
            System.out.println(user.getName());
            if (!user.getAutos().isEmpty()) {
                for (Auto auto : user.getAutos()) {
                    System.out.println(auto.getModel());
                }
            }
        }
    }
}

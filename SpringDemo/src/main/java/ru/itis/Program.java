package ru.itis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
    public static void main(String[] args) {
        /*
        UsersService service = new UsersService();

        System.out.println(service.findUser(10).getName());

        UsersDao usersDao = new UsersDaoImpl();

        service = new UsersService(usersDao);
        */
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:context.xml");

        UsersService service = (UsersService)context.getBean("usersService");
        System.out.println(service.findUser(10).getName());
    }
}

package ru.itis.servlets;

import com.google.common.collect.Lists;
import ru.itis.models.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Servlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        User user1 = new User("Marsel", 22);
        User user2 = new User("Anna", 20);
        User user3 = new User("Victor", 23);
        List<User> users = Lists.newArrayList(user1, user2, user3);

        request.setAttribute("myUsers", users);
        getServletContext().getRequestDispatcher("/hello.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("FROM SERVLET " + name + " " + password);
    }
}

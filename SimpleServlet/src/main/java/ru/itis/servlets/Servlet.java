package ru.itis.servlets;

import com.google.common.collect.Lists;
import org.springframework.context.ApplicationContext;
import ru.itis.UserService;
import ru.itis.models.User;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Servlet extends HttpServlet {

    private UserService userService;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ApplicationContext context = (ApplicationContext)config.getServletContext().getAttribute("applicationContext");

        this.userService = (UserService)context.getBean("user-service");
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {


        request.setAttribute("myUsers", userService.getUsers());
        getServletContext().getRequestDispatcher("/hello.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("FROM SERVLET " + name + " " + password);
    }
}

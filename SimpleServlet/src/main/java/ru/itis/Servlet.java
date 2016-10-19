package ru.itis;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {
    // метод, реагирующий на http-запрос
    // request - здесь лежит сам запрос
    // response - сюда вы положите ответ
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String message = request.getParameterValues("message")[0];
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }
}

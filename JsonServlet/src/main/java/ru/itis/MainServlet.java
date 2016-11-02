package ru.itis;


import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setName("Marsel");
        user.setAge(22);
        int ids[] = {22, 33, 44, 55};
        user.setIds(ids);

        Auto auto = new Auto(1, "Toyota");
        Auto auto1 = new Auto(2, "Hundai");

        List<Auto> autoList = new ArrayList<Auto>();
        autoList.add(auto);
        autoList.add(auto1);

        user.setAutos(autoList);

        ObjectMapper objectMapper = new ObjectMapper();

        String stringResponse = objectMapper.writeValueAsString(user);

        resp.setContentType("application/json");
        resp.getWriter().write(stringResponse);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String stringRequest = req.getReader().readLine();

        ObjectMapper objectMapper = new ObjectMapper();

        User myUser = objectMapper.readValue(stringRequest, User.class);

        System.out.println(myUser.getName() + " " + myUser.getAutos().get(0).getModelName());
    }
}

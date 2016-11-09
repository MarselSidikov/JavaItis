package ru.itis;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class CheckUserController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        User user = new User(name, password);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("secondPage");

        modelAndView.addObject("userJSP", user);

        return modelAndView;
    }
}

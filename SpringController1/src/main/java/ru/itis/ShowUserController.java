package ru.itis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowUserController{
    @RequestMapping(value = "/show-user", method = RequestMethod.POST)
    public ModelAndView getUser(@RequestParam("name") String name, @RequestParam("password") String password) {

        User user = new User(name, password);

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("secondPage");

        modelAndView.addObject("userJSP", user);

        return modelAndView;
    }
}

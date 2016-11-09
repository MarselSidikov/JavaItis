package ru.itis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView getWelcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("firstPage");

        return modelAndView;
    }
}

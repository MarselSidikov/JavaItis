package ru.itis.controllers;

import org.springframework.web.bind.annotation.*;
import ru.itis.models.User;

@RestController
public class MyRestController {
    @RequestMapping(value = "rest/json/{country}/user", method = RequestMethod.GET,
            produces = "application/json; charset=utf-8")
    public User getUserAsObject(@RequestParam("name") String name, @RequestHeader("age") int age,
                                @PathVariable("country") String country) {
        User user = new User(name, age, country);

        return user;
    }
}

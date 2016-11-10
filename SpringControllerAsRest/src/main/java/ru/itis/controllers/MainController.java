package ru.itis.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import ru.itis.models.User;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {
    @RequestMapping(value = "{country}/user", method = RequestMethod.GET,
            produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getUser(@RequestParam("name") String name, @RequestHeader("age") int age,
                          @PathVariable("country") String country) {
        User user = new User(name, age, country);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String result = objectMapper.writeValueAsString(user);
            return result;
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException();
        }
    }

    @RequestMapping(value = "json/{country}/user", method = RequestMethod.GET,
            produces = "application/json; charset=utf-8")
    @ResponseBody
    public User getUserAsObject(@RequestParam("name") String name, @RequestHeader("age") int age,
                          @PathVariable("country") String country) {
        User user = new User(name, age, country);

        return user;
    }

    @RequestMapping(value = "extended/json/{country}/user", method = RequestMethod.GET,
            produces = "application/json; charset=utf-8")
    @ResponseBody
    public ResponseEntity<User> getUserAsResponseEntity(@RequestParam("name") String name, @RequestHeader("age") int age,
                                                  @PathVariable("country") String country) {
        User user = new User(name, age, country);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("MyResponseHeader", "MyValue");
        responseHeaders.set("SomeHeader", "SomeHeaderValue");

        ResponseEntity<User> response = new ResponseEntity<User>(user, responseHeaders, HttpStatus.ACCEPTED);

        return response;

    }
}

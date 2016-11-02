package ru.itis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

    @Bean
    public UserService userService() {
        return new UserServiceImpl(usersDao());
    }

    @Bean
    public UsersDao usersDao() {
        return new UsersDaoImpl();
    }
}

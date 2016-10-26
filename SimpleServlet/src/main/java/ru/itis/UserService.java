package ru.itis;

import ru.itis.models.User;

import java.util.List;

/**
 * Created by admin on 26.10.2016.
 */
public interface UserService {
    List<User> getUsers();
}

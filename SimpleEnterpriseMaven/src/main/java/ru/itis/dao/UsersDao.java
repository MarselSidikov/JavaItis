package ru.itis.dao;


import ru.itis.models.User;

import java.util.List;

public interface UsersDao {
    List<User> getAll();
}

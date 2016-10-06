package ru.itis.dao;


import ru.itis.models.User;

import java.util.List;

public interface UsersDao {
    List<User> getAll();
    User get(int userId);
    void save(User user);
    void delete(int userId);
}

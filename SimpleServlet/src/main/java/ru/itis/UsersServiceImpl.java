package ru.itis;


import com.google.common.collect.Lists;
import ru.itis.models.User;

import java.util.List;

public class UsersServiceImpl implements UserService {

    public UsersServiceImpl() {}

    public List<User> getUsers() {
        User user1 = new User("Marsel", 22);
        User user2 = new User("Anna", 20);
        User user3 = new User("Victor", 23);
        List<User> users = Lists.newArrayList(user1, user2, user3);

        return users;
    }
}

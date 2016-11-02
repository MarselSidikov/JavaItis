package ru.itis;

/**
 * Created by admin on 02.11.2016.
 */
public class UserServiceImpl implements UserService {

    private UsersDao usersDao;

    public UserServiceImpl(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    public void showUser() {
        System.out.println("Hello from UserService");
        usersDao.showUserFromDao();
    }
}

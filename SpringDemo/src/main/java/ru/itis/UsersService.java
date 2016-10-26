package ru.itis;

public class UsersService {

    // сильная связь
    // private UsersDaoImpl usersDaoImpl;

    private UsersDao usersDao;

    public UsersService() {
        // очень сильная связь
        // this.usersDaoImpl = new UsersDaoImpl();
    }

    // немного ослабим связь
    /*
    public UsersService(UsersDaoImpl usersDaoImpl) {
        // this.usersDaoImpl = usersDaoImpl;
    }
    */
    // совсем ослабляем связь
    public UsersService(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    // совсем ослабим связь

    public User findUser(int userId) {
        // return usersDaoImpl.find(10);
        return this.usersDao.find(10);
    }
}

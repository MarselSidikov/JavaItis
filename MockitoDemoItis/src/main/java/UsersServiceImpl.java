import java.util.List;

public class UsersServiceImpl {

    private UsersDao usersDao;
    private SimpleLogger logger;

    public UsersServiceImpl(UsersDao usersDao, SimpleLogger logger) {
        this.usersDao = usersDao;
        this.logger = logger;
    }

    boolean isRegistered(String name) {
        List<User> users = usersDao.getAll();

        for (User user : users) {
            if (user.getName().equals(name)) {
                logger.log("REGISTERED: " + name);
                return true;
            }
        }
        return false;
    }

    public User getByName(String name) {
        return usersDao.get(name);
    }
}

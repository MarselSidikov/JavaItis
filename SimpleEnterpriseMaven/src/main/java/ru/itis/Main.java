package ru.itis;

import ru.itis.dao.UsersDao;
import ru.itis.dao.UsersDaoFileBasedImpl;
import ru.itis.service.SimpleUsersService;
import ru.itis.service.SimpleUsersServiceImpl;

public class Main {

    public static void main(String[] args) {
        UsersDao usersDao = new UsersDaoFileBasedImpl("C:\\Users\\" +
                "admin.WIN-IPM3OA3VQNQ\\Desktop" +
                "\\JAVA\\JavaItis\\SimpleEnterprise\\users.txt");

        SimpleUsersService service = new SimpleUsersServiceImpl(usersDao);

        System.out.println(service.isRegistered("Marsel", "qwerty008"));
    }
}

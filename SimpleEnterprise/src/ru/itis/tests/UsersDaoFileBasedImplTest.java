package ru.itis.tests;

import org.junit.Before;
import org.junit.Test;
import ru.itis.dao.UsersDaoFileBasedImpl;
import ru.itis.models.User;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by admin on 06.10.2016.
 */
public class UsersDaoFileBasedImplTest {

    private UsersDaoFileBasedImpl usersDao;

    @Before
    public void setUp() throws Exception {
        usersDao = new UsersDaoFileBasedImpl("C:\\Users\\" +
                "admin.WIN-IPM3OA3VQNQ\\Desktop" +
                "\\JAVA\\JavaItis\\SimpleEnterprise\\users.txt");
    }

    @Test
    public void getAll() throws Exception {
        List<User> registeredUsers = usersDao.getAll();
        int i = 0;
    }

}
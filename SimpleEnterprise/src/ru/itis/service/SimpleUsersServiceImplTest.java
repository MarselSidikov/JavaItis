package ru.itis.service;

import org.junit.Before;
import org.junit.Test;
import ru.itis.dao.UsersDao;
import ru.itis.models.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SimpleUsersServiceImplTest {

    private SimpleUsersServiceImpl service;

    @Before
    public void setUp() throws Exception {
        UsersDao usersDao = mock(UsersDao.class);
        List<User> testRegisteredUsers = new ArrayList<>();
        User marsel = new User("Marsel", "qwerty007", 22);
        User salavat = new User("Salavat", "qwerty008", 20);
        User almaz = new User("Almaz","asprin12", 21);

        testRegisteredUsers.add(marsel);
        testRegisteredUsers.add(salavat);
        testRegisteredUsers.add(almaz);

        // стаббинг
        when(usersDao.getAll()).thenReturn(testRegisteredUsers);

        service = new SimpleUsersServiceImpl(usersDao);
    }

    @Test
    public void isRegisteredOnCorrectUser() throws Exception {
        boolean actual = service.isRegistered("Salavat", "qwerty008");

        assertTrue(actual);
    }

    @Test
    public void isRegisteredOnInCorrectUser() throws Exception {
        boolean actual = service.isRegistered("Misha", "qwerty008");

        assertFalse(actual);
    }

}
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class UsersServiceImplTest {

    private UsersServiceImpl service;

    private UsersDao usersDao;
    private SimpleLogger logger;

    @Before
    public void setUp() throws Exception {
        usersDao = mock(UsersDao.class);
        logger = mock(SimpleLogger.class);

        User marsel = new User("Marsel");
        User marat = new User("Marat");
        User vladislav = new User("Vladislav");

        List<User> users = new ArrayList<User>();

        users.add(marat);
        users.add(vladislav);
        users.add(marsel);

        //stubbing
        when(usersDao.getAll()).thenReturn(users);
        doNothing().when(logger).log("REGISTERED: Marsel");
        service = new UsersServiceImpl(usersDao, logger);

        User simpleUser = new User("DEFAULT");

        when(usersDao.get(anyString())).thenReturn(simpleUser);
        when(usersDao.get("Bulat")).thenThrow(IllegalArgumentException.class);
    }

    @Test
    public void isRegistered() throws Exception {
        assertTrue(service.isRegistered("Marsel"));
        verify(logger).log("REGISTERED: Marat");
    }

    @Test
    public void getByName() throws Exception {
        User actual = service.getByName("Marsel");
        assertEquals(actual.getName(), "DEFAULT");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getByNameOnIncorrect() throws Exception {
        service.getByName("Bulat");
    }
}
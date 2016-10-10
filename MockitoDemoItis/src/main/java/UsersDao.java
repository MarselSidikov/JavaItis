import java.util.List;

public interface UsersDao {
    List<User> getAll();

    /**
     * Возвращает пользователя по имени
     * @param name имя пользователя
     * @return модель пользователя
     * @throws IllegalArgumentException если имя - Bulat
     */
    User get(String name);
}

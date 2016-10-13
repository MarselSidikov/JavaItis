package ru.itis.dao;


import ru.itis.models.Owner;

import java.sql.Connection;

public interface OwnersDao {
    Owner find(int id);
}

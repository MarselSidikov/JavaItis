package ru.itis.services;

import ru.itis.models.Owner;

public interface OwnerService {
    Owner findUserById(int id);
}

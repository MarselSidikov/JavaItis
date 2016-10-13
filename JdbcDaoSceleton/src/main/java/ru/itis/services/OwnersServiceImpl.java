package ru.itis.services;

import ru.itis.dao.OwnersDao;
import ru.itis.models.Owner;

public class OwnersServiceImpl implements OwnerService {

    private OwnersDao ownersDao;

    public OwnersServiceImpl(OwnersDao ownersDao) {
        this.ownersDao = ownersDao;
    }

    public Owner findUserById(int id) {
        return ownersDao.find(id);
    }
}

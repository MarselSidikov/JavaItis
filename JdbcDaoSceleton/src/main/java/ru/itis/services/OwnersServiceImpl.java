package ru.itis.services;

import ru.itis.dao.OwnersDao;
import ru.itis.models.Owner;
import ru.itis.utils.Verifier;

import static ru.itis.utils.Verifier.verifyUserExist;

public class OwnersServiceImpl implements OwnerService {

    private OwnersDao ownersDao;

    public OwnersServiceImpl(OwnersDao ownersDao) {
        this.ownersDao = ownersDao;
    }

    public Owner findUserById(int id) {
        return ownersDao.find(id);
    }

    public void updateOwner(Owner owner) {
        verifyUserExist(owner.getId());
        this.ownersDao.update(owner);
    }
}

package ru.itis;

import ru.itis.dao.OwnersDao;
import ru.itis.factories.DaoFactory;
import ru.itis.factories.ServiceFactory;
import ru.itis.models.Owner;
import ru.itis.services.OwnerService;
import ru.itis.services.OwnersServiceImpl;

public class Main {
    public static void main(String[] args) {
        OwnerService ownerService = ServiceFactory.getInstance().getOwnerService();

        Owner owner = ownerService.findUserById(3);

        System.out.println(owner);
    }
}

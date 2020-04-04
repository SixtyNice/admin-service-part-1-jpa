package com.accenture.tveratc.bank.DAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class genericDAO {
    protected static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("com.accenture.tveratc.bank.entity.Client");

}

package com.accenture.tveratc.bank.DAO.ClientDAO;

import com.accenture.tveratc.bank.DAO.genericDAO;
import com.accenture.tveratc.bank.entity.Client;

import javax.persistence.*;
import java.sql.*;
import java.util.UUID;


public class ClientDAOImpl
        extends genericDAO
        implements ClientDAO {


    @Override
    public Client getClient(String login) {
        EntityManager entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
        String queryString = "SELECT client FROM Client client WHERE client.login=:login";
        TypedQuery<Client> query = entityManager.createQuery(queryString, Client.class);
        query.setParameter("login", login);

        Client client = null;

        try {
            client = query.getSingleResult();


        } catch (NoResultException ex) {
            ex.printStackTrace();

        } finally {
            entityManager.close();
        }

        return client;
    }



}

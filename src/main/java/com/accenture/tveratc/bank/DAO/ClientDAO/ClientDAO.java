package com.accenture.tveratc.bank.DAO.ClientDAO;

import com.accenture.tveratc.bank.entity.Client;

public interface ClientDAO {
    Client getClient(String login);

}

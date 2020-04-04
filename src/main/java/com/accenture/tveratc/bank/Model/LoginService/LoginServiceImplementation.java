package com.accenture.tveratc.bank.Model.LoginService;

import com.accenture.tveratc.bank.DAO.ClientDAO.ClientDAO;
import com.accenture.tveratc.bank.DAO.ClientDAO.ClientDAOImpl;
import com.accenture.tveratc.bank.entity.Client;

public class LoginServiceImplementation implements LoginService {
    @Override
    public boolean validate(String login, String password) {
        ClientDAO clientDAO = new ClientDAOImpl();
        Client client = clientDAO.getClient(login);
        if (client != null) {
            if (client.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}

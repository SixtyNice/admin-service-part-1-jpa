package com.accenture.tveratc.bank.Controller;

import com.accenture.tveratc.bank.DAO.ClientDAO.ClientDAOImpl;
import com.accenture.tveratc.bank.Model.LoginService.LoginServiceImplementation;
import com.accenture.tveratc.bank.entity.Client;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/login")
public class Login {


    @GET()
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public boolean login(Client client) {

        boolean validate = new LoginServiceImplementation().validate(client.getLogin(), client.getPassword());
        return validate;

    }
}

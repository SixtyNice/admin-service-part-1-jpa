package com.accenture.tveratc.bank.Controller;

import com.accenture.tveratc.bank.DAO.ClientDAO.ClientDAOImpl;
import com.accenture.tveratc.bank.entity.Client;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//
//@WebServlet(name = "RootServlet")
//public class RootServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession(true);
//        response.setContentType("text/html");
//
//        System.out.println(session.getId());
//        String login = (String) session.getAttribute("login");
//
//        if (login == null) {
//            String path = request.getContextPath() + "/login.html";
//            response.sendRedirect(path);
//        } else {
//            Client client = ClientDAOImpl.getClientInfo();
//            session.setAttribute("id", client.getId());
//            session.setAttribute("name", client.getName());
//            session.setAttribute("lastName", client.getLastName());
//            session.setAttribute("middleName", client.getMiddleName());
//            session.setAttribute("role", client.getRole());
//
//            String path = "/index.jsp";
//            ServletContext servletContext = getServletContext();
//            RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
//            requestDispatcher.forward(request, response);
//        }
//
////    }
//}

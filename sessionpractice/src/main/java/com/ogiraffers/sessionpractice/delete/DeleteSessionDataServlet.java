package com.ogiraffers.sessionpractice.delete;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/delete")
public class DeleteSessionDataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        Enumeration<String> sessionNames = session.getAttributeNames();
        while (sessionNames.hasMoreElements()) {
            System.out.println("sessionNames.nextElement() : " + sessionNames.nextElement());
        }

        session.removeAttribute("firstName");
        sessionNames = session.getAttributeNames();
        while (sessionNames.hasMoreElements()) {
            System.out.println("remain : " + sessionNames.nextElement());
        }

        session.invalidate();
        sessionNames = session.getAttributeNames();
        while (sessionNames.hasMoreElements()) {
            System.out.println("invalidate() : " + sessionNames.nextElement());
        }
    }
}

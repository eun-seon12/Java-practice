package com.ogiraffers.menu.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/menu/order")
public class MenuOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String menuName = req.getParameter("menuName");
        int amount = Integer.parseInt(req.getParameter("amount"));

        System.out.println("menuName = " + menuName);
        System.out.println("amount = " + amount);

        int orderPrice = 0;

        switch (menuName) {
            case "햄버거" : orderPrice = 6000 * amount; break;
            case "짜장면" : orderPrice = 7000 * amount; break;
            case "짬뽕" : orderPrice = 8000 * amount; break;
            case "순대국" : orderPrice = 9000 * amount; break;
        }

        req.setAttribute("menuName", menuName);
        req.setAttribute("amount", amount);
        req.setAttribute("orderPrice", orderPrice);

        RequestDispatcher rd = req.getRequestDispatcher("/jsp/5_response.jsp");
        rd.forward(req, resp);
    }
}

package com.ohgiraffers.calculator.controller;

import com.ohgiraffers.calculator.service.CalcNumber;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(value = "/calculate")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int number1 = Integer.parseInt(req.getParameter("number1"));
        int number2 = Integer.parseInt(req.getParameter("number2"));
        String operator = req.getParameter("operator");

        int resultTotal = (int) new CalcNumber().calc(number1, number2, operator);

        // 결과를 request 객체에 저장하고 JSP로 포워딩

        req.setAttribute("resultTotal", resultTotal);
        req.setAttribute("number1", number1);
        req.setAttribute("number2", number2);
        req.setAttribute("operator", operator);

        RequestDispatcher rd = req.getRequestDispatcher("/jsp/response.jsp");

        rd.forward(req, resp);


    }





}

package com.example.calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CalculatorServlet extends HttpServlet {
    private Calculator calculator = new Calculator();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String op = request.getParameter("op");
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));

        int result = 0;
        switch (op) {
            case "add": result = calculator.add(a, b); break;
            case "sub": result = calculator.subtract(a, b); break;
            case "mul": result = calculator.multiply(a, b); break;
            case "div": result = calculator.divide(a, b); break;
            default: throw new IllegalArgumentException("Invalid operation");
        }

        response.setContentType("text/html");
        response.getWriter().println("<h2>Result: " + result + "</h2>");
    }
}
package com.ohgiraffers.test.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/response")
public class ReceiveRequestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = (String) req.getAttribute("id");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body>\n")
                .append("<h3 align=\"center\">")
                .append("</h3>")
                .append("</body>\n")
                .append("</html>");
        resp.setContentType("text/html;charset=UTF-8");
    }
}

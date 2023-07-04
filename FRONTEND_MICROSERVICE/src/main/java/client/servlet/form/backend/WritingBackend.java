/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client.servlet.form.backend;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author homec
 */


//@WebServlet("/paramters/url-get")
public class WritingBackend extends HttpServlet{
    
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String hello = req.getParameter("hello");
        String names = req.getParameter("names");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("    <head>");
        out.println("        <meta charset=\"UTF-8\">");
        out.println("        <title>Get url parameter</title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println("        <h1>Get url parameter!</h1>");
        if (hello != null && names != null) {
            out.println("        <h2>sey hi to them: " + hello + " " + names + "</h2>");
        } else if (hello != null) {
            out.println("        <h2>sey hi to them: " + hello + "</h2>");
        } else if (names != null) {
            out.println("        <h2>Hollo my name is " + names + "</h2>");
        } else {
            out.println("<h2>no parameter was passed to name</h2>");
        }

        try {
            int code = Integer.parseInt(req.getParameter("code"));
            out.println("<h3>the code sent is : " + code + "</h3>");
        } catch (NumberFormatException e){
            out.println("<h3>the code sent is, is null</h3>");
        }
        out.println("    </body>");
        out.println("</html>");
        out.close();
    }
}

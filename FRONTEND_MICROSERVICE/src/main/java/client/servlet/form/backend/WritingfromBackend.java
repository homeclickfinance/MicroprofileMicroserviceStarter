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

//@WebServlet("/hollo-world")
public class WritingfromBackend extends HttpServlet {
    
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("    <head>");
        out.println("        <meta charset=\"UTF-8\">");
        out.println("        <title>Hollo world Servlet</title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println("        <h1>Hollo world Servlet!</h1>");
        out.println("    </body>");
        out.println("</html>");
        out.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package displayapp.using.servlet;

import jakarta.servlet.annotation.WebServlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 *
 * @author homec
 */

//@WebServlet("/App1hostbotton/url-get")
public class App1hostbottoon extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        out.println("<script>");
        out.println("function gethost1console() {");
        out.println("  fetch('http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/microservice')");
        out.println("    .then(function(response) {");
        out.println("      return response.json();");
        out.println("    })");
        out.println("    .then(function(myJson) {");
        out.println("      console.log(JSON.stringify(myJson));");
        out.println("    });");
        out.println("}");
        out.println("gethost1console();");
        out.println("</script>");

        out.println("</body></html>");
    }
}
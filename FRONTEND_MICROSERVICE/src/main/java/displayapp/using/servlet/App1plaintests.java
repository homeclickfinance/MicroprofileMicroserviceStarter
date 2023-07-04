/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package displayapp.using.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author homec
 */


//@WebServlet("/App1hostplaintext/url-get")
public class App1plaintests extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("connected Host 1 app");

        //=================================================================================================

        String url = "http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/Microgroup1/view1";

        try {
            URL connectionUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) connectionUrl.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            conn.disconnect();

            String data = content.toString();
            // Update the content of the container element
            out.println("<script>");
            out.println("document.addEventListener('DOMContentLoaded', function() {");
            out.println("  const container = document.getElementById('App1-plaintext');");
            out.println("  container.textContent = '" + data.replace("'", "\\'") + "';");
            out.println("});");
            out.println("</script>");
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    }
}
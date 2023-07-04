/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package displayapp.using.servlet;

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

//@WebServlet("/App1hot/url-get")
public class App1host extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("connected Host 1 app");

        //=================================================================================================

        String url = "http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/microservice";

        try {
            // Perform the HTTP GET request
            // You can use libraries like Apache HttpClient or HttpURLConnection to make the request
            // and retrieve the response

            // Example using HttpURLConnection:
            java.net.URL connectionUrl = new java.net.URL(url);
            java.net.HttpURLConnection conn = (java.net.HttpURLConnection) connectionUrl.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            // Check the response code to ensure a successful request
            int responseCode = conn.getResponseCode();
            if (responseCode == java.net.HttpURLConnection.HTTP_OK) {
                // Read the response content
                java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder responseContent = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    responseContent.append(inputLine);
                }
                in.close();

                // Process the JSON response
                // You can use libraries like Gson or Jackson to parse the JSON response

                // Example using Gson:
                com.google.gson.JsonArray dataArray = com.google.gson.JsonParser.parseString(responseContent.toString()).getAsJsonArray();
                String displayText = "Data: " + dataArray.get(0).getAsJsonObject().get("microservicea1").getAsString();

                // Send the response
                out.println("<p>" + displayText + "</p>");
            } else {
                out.println("<p>Error: " + responseCode + "</p>");
            }

            conn.disconnect();
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
        
    }

}
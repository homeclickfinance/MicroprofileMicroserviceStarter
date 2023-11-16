/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets.directs;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import logins.sqls.LoginEntilysql;
import user.log.autenti.Tradeloginusers;

/**
 *
 * @author homec
 */

@WebServlet("/databaseloginauth")
public class Logindatabase extends HttpServlet {
    
     /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
          
        List<Tradeloginusers> tradeloginusers = new LoginEntilysql().getlists(); // This comes comes from the login database service and gettraderloginnuser con the same class package
        System.out.println("================================= Getting user Autentication lists =========================");
        System.out.println("tradeloginusers = " + tradeloginusers);
        System.out.println(" hi Trade login users today date is ..." + new java.util.Date());
        request.setAttribute("tradeloginusers", tradeloginusers);
        request.getRequestDispatcher("/NforJAPP.java").forward(request, response);
    }
    
}


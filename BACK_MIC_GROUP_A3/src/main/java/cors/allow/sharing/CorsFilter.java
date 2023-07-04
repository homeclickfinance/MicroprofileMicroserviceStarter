/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cors.allow.sharing;

import jakarta.servlet.*;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;


/**
 *
 * @author homec
 */

@WebFilter("/*")
public abstract class CorsFilter implements Filter {
    
//@Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code, if any
    }

    //@Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpResponse.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        httpResponse.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");

        chain.doFilter(request, response);
    }

    //@Override
    public void destroy() {
        // Cleanup code, if any
    }

 
}

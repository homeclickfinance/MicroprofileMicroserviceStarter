/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cros.orig.resour.sharing;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;
import java.io.IOException;

/**
 *
 * @author homec
 */

/*
@Path("app1v")
@Provider
public class App1Cros implements ContainerResponseFilter, ContainerRequestFilter {
    
    
   @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
        responseContext.getHeaders().add("Access-Control-Allow-Origin", "http://localhost:8081/BACK_MIC_GROUP_A1/");
        responseContext.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
        responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
        responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
        responseContext.getHeaders().add("Access-Control-Max-Age", "1209600");
    }
    

    
    @GET
    @Path("app1text") //http://localhost:8090/FRONTEND_MICROSERVICE/webapi/app1v/app1text
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String demo() {    
        
        Client client = ClientBuilder.newClient();
        Response response =  client.target("http://localhost:8081/BACK_MIC_GROUP_A1/webapi/MicroservicetestgroupaOne1/Microsergropa1view").request().get(); 
        return response.toString();
        
        
    }
    
    

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
      
}
    
 */   


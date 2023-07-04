/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package endpoint.all.example;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import java.net.URI;
import java.sql.SQLException;
import java.util.List;

import micro.clas.Microsergropa1;

/**
 *
 * @author homec
 */

@Path("app2")
public class EndpointGET {
    
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String demo() {    

         Client client = ClientBuilder.newClient();
         WebTarget baseMicrosergropaURL =  client.target("http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/microservice");
         WebTarget microsergropaURL = baseMicrosergropaURL.path("{microA1}");
         
              
         String response = microsergropaURL
        		           .resolveTemplate("microA1", "6")
        		           .request(MediaType.APPLICATION_JSON)
        		           .get(String.class);
       
         return response;
	}

}

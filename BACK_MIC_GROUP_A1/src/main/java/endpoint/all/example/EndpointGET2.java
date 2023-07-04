/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package endpoint.all.example;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import micro.clas.Microsergropa1;

/**
 *
 * @author homec
 */

@Path("app3")
public class EndpointGET2 {
    
        @GET
	@Produces(MediaType.APPLICATION_JSON)
	public String demo() {    

         Client client = ClientBuilder.newClient();
         String response =  client.target("http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/microservice")
        		 .request(MediaType.APPLICATION_JSON)
        		 .get(String.class); 
         return response;
	}

}
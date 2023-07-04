/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */






package endpont.json.entity;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import micro.clas.Microsergropa1;

/**
 *
 * @author homec
 */


public class JsonDeleteexample {
    
    
static Client client = ClientBuilder.newClient();
	static WebTarget baseBrandURL = client
			.target("http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/microservice");
	static WebTarget brandURL = baseBrandURL.path("{microA1}");

	public static void main(String[] args) {


	Response response = brandURL
    			.resolveTemplate("microA1", "3")
    			.request()
    			.delete();
        System.out.println(response.getStatus());
		
		
		
	}

}





    
    
    

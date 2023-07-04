/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */





package endpont.json.entity;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import micro.clas.Microsergropa1;

/**
 *
 * @author homec
 */


public class JsonPostexample {

        static Client client = ClientBuilder.newClient();
	static WebTarget baseBrandURL = client
			.target("http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/postMicroLIST");
	static WebTarget brandURL = baseBrandURL.path("{microA1}");

	public static void main(String[] args) {


		
		/*
		 * Add new microservicea1   {"microservicea1":"putting test"}
                */
                

		Response response = baseBrandURL
				        .request()
				        .post(Entity.json(new Microsergropa1("New microsergropa1 100")));
		System.out.println(response.readEntity(Microsergropa1.class).displayMicrosergropa1());
		
		
		
		
		
		
	}

}





    
    
    

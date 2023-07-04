/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package endpont.json.entity;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

import micro.clas.Microsergropa1;

/**
 *
 * @author homec
 */
public class JsonGetspecifyexample {

  static Client client = ClientBuilder.newClient();
	static WebTarget baseBrandURL = client
			.target("http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/microservice");
	static WebTarget brandURL = baseBrandURL.path("{microA1}");

	public static void main(String[] args) {
	
		/*
		 * Getting specific Brand info
                */
                
		Microsergropa1 specificMicrosergropa1 = brandURL
				      .resolveTemplate("microA1", "2")
		                      .request()
		                      .get(Microsergropa1.class);
		System.out.println(specificMicrosergropa1);
		


		
	}

}





    
    
    

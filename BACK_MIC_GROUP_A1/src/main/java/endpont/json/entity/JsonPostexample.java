/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
 * Example class for adding a new microservice using JSON and JAX-RS client.
 */
public class JsonPostexample {

    static Client client = ClientBuilder.newClient();
    static WebTarget baseBrandURL = client.target("http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/microservice");

    public static void main(String[] args) {
        /*
         * Add a new microservice
         */
        Microsergropa1 newMicrosergropa1 = new Microsergropa1();
        newMicrosergropa1.setMicroservicea1("New microservicea1 100");

        Response response = baseBrandURL
                .request()
                .post(Entity.json(newMicrosergropa1));

        if (response.getStatus() == Response.Status.CREATED.getStatusCode()) {
            Microsergropa1 createdMicrosergropa1 = response.readEntity(Microsergropa1.class);
            System.out.println(createdMicrosergropa1.displayMicrosergropa1());
        } else {
            System.out.println("Failed to add a new microservice. Status: " + response.getStatus());
        }

        client.close();
    }
}



/*
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

/*
public class JsonPostexample {

        static Client client = ClientBuilder.newClient();
	static WebTarget baseBrandURL = client
			.target("http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/microserviced");
	static WebTarget brandURL = baseBrandURL.path("{microA1}");

	public static void main(String[] args) {


		
		/*
		 * Add new microservicea1   {"microservicea1":"putting test"}
                */
                
/*
		Response response = baseBrandURL
				        .request()
				        .post(Entity.json(new Microsergropa1("New microsergropa1 100")));
		System.out.println(response.readEntity(Microsergropa1.class).displayMicrosergropa1());
		
		
		
		
		
		
	}

}
*/




    
    
    

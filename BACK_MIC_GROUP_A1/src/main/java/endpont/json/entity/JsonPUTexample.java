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
 * Example class for updating a brand using JSON and JAX-RS client.
 */
public class JsonPUTexample {

    static Client client = ClientBuilder.newClient();
    static WebTarget baseBrandURL = client.target("http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/microservice");
    static WebTarget brandURL = baseBrandURL.path("{microA1}");

    public static void main(String[] args) {
        /*
         * Update a brand info
         */
        Microsergropa1 updatedMicrosergropa1 = new Microsergropa1();
        updatedMicrosergropa1.setMicroservicea1("kfkfl");

        Response response = brandURL
                .resolveTemplate("microA1", "4")
                .request(MediaType.APPLICATION_JSON)
                .put(Entity.json(updatedMicrosergropa1));

        System.out.println(response.getStatus());

        client.close();
    }
}


/*
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
/*
public class JsonPUTexample {

        static Client client = ClientBuilder.newClient();
	static WebTarget baseBrandURL = client
			.target("http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/microserviced");
	static WebTarget brandURL = baseBrandURL.path("{microA1}");

	public static void main(String[] args) {

		/*
		*Update a brand info
		*/
/*
		Response response = brandURL
		        			.resolveTemplate("microA1", "4")
		        			.request(MediaType.APPLICATION_JSON)
		        			.put(Entity.json(new Microsergropa1("kfkfl")));
		System.out.println(response.getStatus());
		

		
		
	}

}
*/




    
    
    


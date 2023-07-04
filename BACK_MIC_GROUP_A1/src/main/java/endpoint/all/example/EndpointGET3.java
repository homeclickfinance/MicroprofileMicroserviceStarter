/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package endpoint.all.example;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import java.sql.SQLException;

import micro.clas.Microsergropa1;

public class EndpointGET3 {

    public static void main(String[] args)throws SQLException, ClassNotFoundException {
        Client client = ClientBuilder.newClient();
        WebTarget baseBrandURL = client.target("http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/microservice");
        WebTarget brandURL = baseBrandURL.path("{microA1}");

        Microsergropa1[] response = brandURL.resolveTemplate("microA1", "1")
                .request(MediaType.APPLICATION_JSON)
                .get(Microsergropa1[].class);

        for (Microsergropa1 microsergropa1 : response) {
            System.out.println(microsergropa1);
        }

        // Close the client
        client.close();
    }
}


/*
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
/*
public class EndpointGET3 {


static Client client = ClientBuilder.newClient();

	static WebTarget baseBrandURL = client
			.target("http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/microserviced");
	static WebTarget brandURL = baseBrandURL.path("{microA1}");

	public static void main(String[] args) {

		Microsergropa1[] response = baseBrandURL.request(MediaType.APPLICATION_JSON)
				.get(Microsergropa1[].class);
		
		for(Microsergropa1 microsergropa1: response) {
			System.out.println(microsergropa1);
		}
		
		
	}

}
*/
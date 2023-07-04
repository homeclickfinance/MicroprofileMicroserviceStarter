/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clients.restful.endpoint;

import com.mysql.cj.xdevapi.Client;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.client.ClientConfig;

/**
 *
 * @author homec
 */

@Path("appendpoint3")//http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/appendpoint3
public class GetMicroserviceViews {
    
    /*
        @GET
	@Produces(MediaType.APPLICATION_JSON)
	public String demo() {    

         jakarta.ws.rs.client.Client client = ClientBuilder.newClient();
         Response response =  client.target("http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/microservicec").request().get(); 
         return response.toString();
	}
*/
    /**
     * @param args the command line arguments
     */
   /* public static void main(String[] args) {
        // TODO code application logic here
        
  
        
        /*Client client = ClientBuilder.newClient();
        WebTarget baseBrandURL =  client.target("http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/microservicec");*/
        
        
        /*
        String uri = "http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/microservicec";
        ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        WebTarget target = client.target(uri);
         
        String response = target.request()
                    .accept(MediaType.APPLICATION_JSON)
                    .get(String.class);
         
        System.out.println(response);*/  /*
 
    }*/
 
}
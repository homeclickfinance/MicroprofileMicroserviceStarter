/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resfulweb.servlet.maphttp;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author homec
 */

@Path("/Microservicetestgroupa1")//This is what will be display in the web browser
public class RestwebMicrogroupa1 {
    
@GET
@Produces(MediaType.TEXT_PLAIN)  // http://localhost:8081/BACK_MIC_GROUP_A1/webapi/Microservicetestgroupa1
	public String getIt() {
		return "This is a plain text restfull webservice  and the Endpoint above";
	}
    
    
}

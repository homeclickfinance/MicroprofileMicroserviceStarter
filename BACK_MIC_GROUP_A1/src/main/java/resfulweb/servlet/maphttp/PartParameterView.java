/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resfulweb.servlet.maphttp;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author homec
 */

@Path("/MultiplePathformdatabase")//This is what will be display in the web browser
public class PartParameterView {
    
        @GET
	@Path("/MicroMultipleview")     //http://localhost:8081/BACK_MIC_GROUP_A1/webapi/MultiplePathformdatabase/MicroMultipleview
	@Produces(MediaType.TEXT_PLAIN)   
	public String getMultipleview() {
		return "list of Microsergropa1view";
	}
        

        @POST
	@Path("/postMicroMultipleview")
	@Produces(MediaType.TEXT_PLAIN)    //http://localhost:8081/BACK_MIC_GROUP_A1/webapi/MultiplePathformdatabase/postMicroMultipleview
	public String postMultipleview() {
		return "Add a new Microcroservicepost" ;
	}
        
    
        @PUT
	@Path("/putMicroMultipleview/{microA1}/{Microservicea1}")  // FOR PUT REQUEST INSTEAD OF USING microA1, WE USE THE VALUE OF THE ID WE WANT TO PUT IN THE DATABASE vslue n3
	@Produces(MediaType.TEXT_PLAIN) //http://localhost:8081/BACK_MIC_GROUP_A1/webapi/MultiplePathformdatabase/putMicroMultipleview/3/mic1
	public String putMultipleview(@PathParam("microA1")  int microA1,
                                      @PathParam("Microservicea1")  String Microservicea1)     {
		return "update Microcroservice parthparam info with ID & NAME "+microA1+" "+Microservicea1;
	}
	
	@DELETE
	@Path("/deleteMicroMultipleview/{microA1}/{Microservicea1}") // FOR DELETE REQUEST INSTEAD OF USING microA1, WE USE THE VALUE OF THE ID WE WANT TO DELETE IN THE DATABASE value 3 
	@Produces(MediaType.TEXT_PLAIN)  // http://localhost:8081/BACK_MIC_GROUP_A1/webapi/MultiplePathformdatabase/deleteMicroMultipleview/3/mic1
	public String deleteMultipleview(@PathParam("microA1") int microA1,
                                         @PathParam("Microservicea1")  String Microservicea1) {
		return "delete Microcroservice parthparam from db with ID & NAME "+microA1+" "+Microservicea1;
	}
    
}

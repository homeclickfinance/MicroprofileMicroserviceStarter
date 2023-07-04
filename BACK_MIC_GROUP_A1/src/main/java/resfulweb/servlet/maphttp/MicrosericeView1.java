/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resfulweb.servlet.maphttp;

import jakarta.ws.rs.Consumes;
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

@Path("/MicroservicetestgroupaOne1")//This is what will be display in the web browser
public class MicrosericeView1 {
    
    	@GET
	@Path("/Microsergropa1view")     //http://localhost:8081/BACK_MIC_GROUP_A1/webapi/MicroservicetestgroupaOne1/Microsergropa1view
        @Produces(MediaType.TEXT_PLAIN)
        @Consumes(MediaType.TEXT_PLAIN)    
	public String getMicrosericeView1() {
		return "list of Microsergropa1view App1";
	}
        

        @POST
	@Path("/postMicrosergropa1view")
	@Produces(MediaType.TEXT_PLAIN)    //http://localhost:8081/BACK_MIC_GROUP_A1/webapi/MicroservicetestgroupaOne1/postMicrosergropa1view
	public String postMicrosericeView1() {
		return "Add a new Microcroservicepost" ;
	}
        
	
	@PUT
	@Path("/putMicrosergropa1view/{microA1}")  // FOR PUT REQUEST INSTEAD OF USING microA1, WE USE THE VALUE OF THE ID WE WANT TO PUT IN THE DATABASE vslue n3
	@Produces(MediaType.TEXT_PLAIN) //http://localhost:8081/BACK_MIC_GROUP_A1/webapi/MicroservicetestgroupaOne1/putMicrosergropa1view/3 
	public String putMicrosericeView1(@PathParam("microA1")  int microA1) {
		return "update Microcroservice info with ID "+microA1;
	}
	
	@DELETE
	@Path("/deleteMicrosergropa1view/{microA1}") // FOR DELETE REQUEST INSTEAD OF USING microA1, WE USE THE VALUE OF THE ID WE WANT TO DELETE IN THE DATABASE value 3 
	@Produces(MediaType.TEXT_PLAIN)  // http://localhost:8081/BACK_MIC_GROUP_A1/webapi/MicroservicetestgroupaOne1/deleteMicrosergropa1view/3
	public String deleteMicrosericeView1(@PathParam("microA1") int microA1) {
		return "delete Microcroservice from db with ID "+microA1;
	}
        
}


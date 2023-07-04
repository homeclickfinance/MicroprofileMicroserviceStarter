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
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import java.net.URI;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author homec
 */


@Path("/Microgroup4")//This is what will be display in the web browser
public class MicroApp4plaintest {
    
    @GET         
    @Path("view4")//http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microgroup4/view4
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)    
    public String getMicrogroup3() {
      return "list of Microservicetestgroupa4 App4 view plain TEXT";
    }
    
}


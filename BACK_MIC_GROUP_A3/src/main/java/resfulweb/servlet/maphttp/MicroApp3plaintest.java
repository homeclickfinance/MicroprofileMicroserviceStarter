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

@Path("/Microgroup3")//This is what will be display in the web browser
public class MicroApp3plaintest {
    
    
    @GET
    @Path("view")//http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microgroup3/view"
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)    
    public String getMicrogroup3() {
      return "list of Microservicetestgroupa3 App3 view plain TEXT";
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resfulweb.servlet.maphttp.change;

import interfaze.change.microgroupa2.ImpleIntViewchange2;
import jakarta.inject.Inject;
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
import miro.host2.Microsergropa2;




/**
 *
 * @author homec
 */

@Path("/Microservicetestgroupa2")//This is what will be display in the web browser
public class MicrosericeView2 {
  
    
    private ImpleIntViewchange2 service2 = new ImpleIntViewchange2();
    
    @GET
    @Path("/microservicec")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8082/BACK_MIC_GROUP_A2/webapp2/Microservicetestgroupa2/microservicec
    public List<Microsergropa2> getMicrosergropa2() throws SQLException, ClassNotFoundException {
        return service2.getMicrosergropa2();
    }
        
    @GET
    @Path("/getmicroservicec")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8082/BACK_MIC_GROUP_A2/webapp2/Microservicetestgroupa2/getmicroservicec
    public List<Microsergropa2> findAll() throws SQLException, ClassNotFoundException {
        return service2.findAll();
    }

    @POST
    @Path("/postMicroLISTc")
    @Consumes(MediaType.APPLICATION_JSON) //http://localhost:8082/BACK_MIC_GROUP_A2/webapp2/Microservicetestgroupa3/postMicroLISTc
    public Response postMultipleview(Microsergropa2 microsergropa2, @Context UriInfo uri) throws SQLException, ClassNotFoundException {
        service2.addMicrosergropa2(microsergropa2);
        
        URI location = uri.getAbsolutePath();
        return Response.created(location).entity(microsergropa2).build();
        
    }
    

    @PUT
    @Path("/putMicroLISTc/{microA2}")
    @Consumes(MediaType.APPLICATION_JSON) // http://localhost:8082/BACK_MIC_GROUP_A2/webapp2/Microservicetestgroupa3/putMicroLISTc/3
    public Response putMultipleview(@PathParam("microA2") int microA2, Microsergropa2 updatedMicrosergropa2) throws SQLException, ClassNotFoundException {
        updatedMicrosergropa2.setMicroA2(microA2);
        service2.updateMicrosergropa2(updatedMicrosergropa2);
        return Response.ok().status(201).build();
    }

    @DELETE
    @Path("/deleteMicroLISTc/{microA2}")
    @Consumes(MediaType.APPLICATION_JSON) // http://localhost:8082/BACK_MIC_GROUP_A2/webapp2/Microservicetestgroupa3/deleteMicroLISTc/3
    public Response deleteMultipleview(@PathParam("microA2") int microA2) throws SQLException, ClassNotFoundException {
        service2.deleteMicroserviceLIST2(microA2);
        return Response.ok().status(201).build();
    }
    
   
    
    
}






    

    
    


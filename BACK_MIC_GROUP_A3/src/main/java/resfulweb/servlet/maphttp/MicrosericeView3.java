/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resfulweb.servlet.maphttp;

import interfaze.microgroupa3.ImpleIntView3;
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
import micro.classb.Microsergropa3;


/**
 *
 * @author homec
 */

@Path("/Microservicetestgroupa3")//This is what will be display in the web browser
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON) 
public class MicrosericeView3 {
    
    
    private ImpleIntView3 service3 = new ImpleIntView3();
    

        
    
    @GET
    @Path("/microservicec")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/microservicec
    public List<Microsergropa3> getMicrosergropa3() throws SQLException, ClassNotFoundException {
        return service3.getMicrosergropa3();
    }
        
    @GET
    @Path("/getmicroservicec")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/getmicroservicec
    public List<Microsergropa3> findAll() throws SQLException, ClassNotFoundException {
        return service3.findAll();
    }

    @POST
    @Path("/postMicroLISTc")
    @Consumes(MediaType.APPLICATION_JSON) //http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/postMicroLISTc
    public Response postMultipleview(Microsergropa3 microsergropa3, @Context UriInfo uri) throws SQLException, ClassNotFoundException {
        service3.addMicrosergropa3(microsergropa3);
        
        URI location = uri.getAbsolutePath();
        return Response.created(location).entity(microsergropa3).build();
        
    }
    

    @PUT
    @Path("/putMicroLISTc/{microA3}")
    @Consumes(MediaType.APPLICATION_JSON) // http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/putMicroLISTc/3
    public Response putMultipleview(@PathParam("microA3") int microA3, Microsergropa3 updatedMicrosergropa3) throws SQLException, ClassNotFoundException {
        updatedMicrosergropa3.setMicroA3(microA3);
        service3.updateMicrosergropa3(updatedMicrosergropa3);
        return Response.ok().status(201).build();
    }

    @DELETE
    @Path("/deleteMicroLISTc/{microA3}")
    @Consumes(MediaType.APPLICATION_JSON) // http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/deleteMicroLISTc/3
    public Response deleteMultipleview(@PathParam("microA3") int microA3) throws SQLException, ClassNotFoundException {
        service3.deleteMicroserviceLIST3(microA3);
        return Response.ok().status(201).build();
    }
    
    
    
    
}






    

    
    


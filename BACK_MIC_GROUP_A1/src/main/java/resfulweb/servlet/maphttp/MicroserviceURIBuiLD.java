/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resfulweb.servlet.maphttp;

import interfaze.microgroupa1.MicroImpLURIBuiLD;
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
import micro.clas.Microsergropa1;

/**
 *
 * @author homec
 */


@Path("/EntityURIbuilder")
public class MicroserviceURIBuiLD {
    
    
    private MicroImpLURIBuiLD service = new MicroImpLURIBuiLD();
    
    @GET
    @Path("/microservice")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8081/BACK_MIC_GROUP_A1/webapi/EntityURIbuilder/microservice
    public List<Microsergropa1> getMicrosergropa1() throws SQLException, ClassNotFoundException {
        return service.getMicrosergropa1();
    }
        
    @GET
    @Path("/getmicroservice")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8081/BACK_MIC_GROUP_A1/webapi/EntityURIbuilder/getmicroservice
    public List<Microsergropa1> findAll() {
        return service.findAll();
    }

    @POST
    @Path("/postMicroLIST")
    @Consumes(MediaType.APPLICATION_JSON) //http://localhost:8081/BACK_MIC_GROUP_A1/webapi/EntityURIbuilder/postMicroLIST
    public Response postMultipleview(Microsergropa1 microsergropa1, @Context UriInfo uri) {
        service.addMicrosergropa1(microsergropa1);
        
       /* 
       // THis is how we get the URI resource path for a specific pathURI
       String ResourceURL = uri.getAbsolutePath().toString()+ "/"+ microsergropa1.getMicroservicea1();
       URI location = URI.create(ResourceURL);
       return Response.created(location).entity(microsergropa1).build();
       // THis is how we get the URI resource path for a specific pathURI
       */
       
       
       
       //URI location = uri.getAbsolutePathBuilder().path(Integer.toString(microsergropa1.getMicroservicea1())).build();
       
       
        //This is the basic way to the a URI path
        URI location = uri.getAbsolutePath();
        return Response.created(location).entity(microsergropa1).build();
        
    }

    @PUT
    @Path("/putMicroLIST/{microA1}")
    @Consumes(MediaType.APPLICATION_JSON) // http://localhost:8081/BACK_MIC_GROUP_A1/webapi/EntityURIbuilder/putMicroLIST/3
    public Response putMultipleview(@PathParam("microA1") int microA1, Microsergropa1 updateMicrosergropa1) {
        updateMicrosergropa1.setMicroA1(microA1);
        service.updateMicrosergropa1(updateMicrosergropa1);
        return Response.ok().build();
    }

    @DELETE
    @Path("/deleteMicroLIST/{microA1}")
    @Consumes(MediaType.APPLICATION_JSON) // http://localhost:8081/BACK_MIC_GROUP_A1/webapi/EntityURIbuilder/deleteMicroLIST/3
    public Response deleteMultipleview(@PathParam("microA1") int microA1) {
        service.deleteMicroserviceLIST(microA1);
        return Response.ok().build();
    }
}






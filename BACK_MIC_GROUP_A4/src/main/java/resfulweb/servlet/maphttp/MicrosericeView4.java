/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resfulweb.servlet.maphttp;

import interfaze.microgroupa4.ImpleIntView4;
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
import micro.classd.Microsergropa4;


/**
 *
 * @author homec
 */

@Path("/Microservicetestgroupa4")//This is what will be display in the web browser
public class MicrosericeView4 {
    
  private ImpleIntView4 service4 = new ImpleIntView4();
    
    @GET
    @Path("/microserviced")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/microserviced
    public List<Microsergropa4> getMicrosergropa4() throws SQLException, ClassNotFoundException {
        return service4.getMicrosergropa4();
    }
        
    @GET
    @Path("/getmicroserviced")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/getmicroserviced
    public List<Microsergropa4> findAll() throws SQLException, ClassNotFoundException {
        return service4.findAll();
    }
    
    @GET
    @Path("/getmicroservicebyID/{microA4}")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/getmicroservicebyID/2
    public List<Microsergropa4> findMicrosergropa1ById() throws SQLException, ClassNotFoundException {
        return service4.findMicrosergropa1ById();
    }

    @POST
    @Path("/postMicroLISTd")   // Post is done next put
    @Consumes(MediaType.APPLICATION_JSON) //http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/postMicroLISTd
    public Response postMultipleview(Microsergropa4 microsergropa4) throws SQLException, ClassNotFoundException {
        service4.addMicrosergropa4(microsergropa4);
        return Response.ok().status(201).build();
        
    }
    /*
    @PUT
    //@Path("/putMicroLISTd/{microA4}")
    @Path("/putMicroLISTd/{microA4}/{microservicea4}") //http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/putMicroLISTd/1/helloupdate
    @Consumes(MediaType.APPLICATION_JSON) 
    @Produces(MediaType.APPLICATION_JSON)
    public Response putMultipleview4(@PathParam("microA4") int microA4, Microsergropa4 updatedMicrosergropa4, 
                                     @PathParam("microservicea4")String microservicea4) throws SQLException, ClassNotFoundException {
        updatedMicrosergropa4.setMicroA4(microA4);
        updatedMicrosergropa4.setMicroservicea4(microservicea4);
        service4.updateMicrosergropa4(updatedMicrosergropa4);
        return Response.ok().status(201).build();
    }*/
   
    
    @PUT
    @Path("/putMicroLISTd/{microA4}")
    @Consumes(MediaType.APPLICATION_JSON) // http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/putMicroLISTd/1
    @Produces(MediaType.APPLICATION_JSON)
    public Response putMultipleview4(@PathParam("microA4") int microA4, Microsergropa4 updatedMicrosergropa4) throws SQLException, ClassNotFoundException {
        
        updatedMicrosergropa4.setMicroA4(microA4); //{"microservicea4":"putting test"} this is use in the POSTMAN get PUT and upgrade data
        service4.updateMicrosergropa4(updatedMicrosergropa4);
        return Response.ok().status(201).build();
    }
    
    
  

    @DELETE
    @Path("/deleteMicroLISTd/{microA4}")
    @Consumes(MediaType.APPLICATION_JSON) // http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/deleteMicroLISTd/3
    public Response deleteMultipleview4(@PathParam("microA4") int microA4) throws SQLException, ClassNotFoundException {
        service4.deleteMicroserviceLIST4(microA4);
        return Response.ok().status(201).build();
    }
    
    
    
    
}






/*

@Path("/Microservicetestgroupa4")//This is what will be display in the web browser
public class MicrosericeView4 {
    
  private ImpleIntView4 service4 = new ImpleIntView4();
    
    @GET
    @Path("/microserviced")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/microserviced
    public List<Microsergropa4> getMicrosergropa4() throws SQLException, ClassNotFoundException {
        return service4.getMicrosergropa4();
    }
        
    @GET
    @Path("/getmicroserviced")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/getmicroserviced
    public List<Microsergropa4> findAll() {
        return service4.findAll();
    }

    @POST
    @Path("/postMicroLISTd")
    @Consumes(MediaType.APPLICATION_JSON) //http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/postMicroLISTd
    public Response postMultipleview(Microsergropa4 microsergropa4, @Context UriInfo uri) {
        service4.addMicrosergropa4(microsergropa4);
        
        URI location = uri.getAbsolutePath();
        return Response.created(location).entity(microsergropa4).build();
        
    }

    @PUT
    @Path("/putMicroLISTd/{microA4}")
    @Consumes(MediaType.APPLICATION_JSON) // http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/putMicroLISTd/3
    public Response putMultipleview4(@PathParam("microA4") int microA4, Microsergropa4 updateMicrosergropa4) {
        updateMicrosergropa4.setMicroA4(microA4);
        service4.updateMicrosergropa4(updateMicrosergropa4);
        return Response.ok().build();
    }

    @DELETE
    @Path("/deleteMicroLISTd/{microA4}")
    @Consumes(MediaType.APPLICATION_JSON) // http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/deleteMicroLISTd/3
    public Response deleteMultipleview4(@PathParam("microA4") int microA4) {
        service4.deleteMicroserviceLIST4(microA4);
        return Response.ok().build();
    }
    
    
    
    
}






    



*/    



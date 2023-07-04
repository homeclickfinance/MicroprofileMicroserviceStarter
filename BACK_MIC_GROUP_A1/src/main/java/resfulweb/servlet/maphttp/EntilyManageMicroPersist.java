/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package resfulweb.servlet.maphttp;

import interfaze.microgroupa1.MicroIntImpEntityMang;


import jakarta.ejb.Stateless;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
//import jakarta.xml.bind.annotation.XmlRootElement;
import java.sql.SQLException;
import java.util.List;
import micro.clas.Microsergropa1;

@Path("/EntityPath")
//@XmlRootElement      //This is use when using a APPLICATION_XML format
//@Stateless // Add this line
public class EntilyManageMicroPersist {
    
    private MicroIntImpEntityMang service = new MicroIntImpEntityMang();
    
    @GET
    @Path("/microservice")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/microservice
    public List<Microsergropa1> getMicrosergropa1() throws SQLException, ClassNotFoundException {
        return service.getMicrosergropa1();
    }
        
    @GET
    @Path("/getmicroservice")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/getmicroservice
    public List<Microsergropa1> findAll() throws SQLException, ClassNotFoundException {
        return service.findAll();
    }
    
    @GET
    @Path("/getmicroservicebyID/{microA1}")
    @Produces(MediaType.APPLICATION_JSON) //http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/getmicroservicebyID/2
    public List<Microsergropa1> findMicrosergropa1ById(@PathParam("microA1") int microA1)  throws SQLException, ClassNotFoundException {
        return service.findMicrosergropa1ById(microA1);
    }

    

    @POST
    @Path("/postMicroLIST")
    @Consumes(MediaType.APPLICATION_JSON) //http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/postMicroLIST
    public Response addMicrosergropa1(Microsergropa1 microservice) throws SQLException, ClassNotFoundException  {
        service.addMicrosergropa1(microservice);
        return Response.ok().status(201).build();
    }
    
    
    @PUT
    @Path("/putMicroLIST/{microA1}")
    @Consumes(MediaType.APPLICATION_JSON) // http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/putMicroLIST/2
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateMicrosergropa1(@PathParam("microA1") int microA1, Microsergropa1 updatedMicrosergropa1) throws SQLException, ClassNotFoundException {
        
        updatedMicrosergropa1.setMicroA1(microA1);//{"microservicea1":"putting test"} this is use in the POSTMAN get PUT and upgrade data
                
        service.updateMicrosergropa1(updatedMicrosergropa1);
        return Response.ok().status(201).build();
    }
    
    @DELETE
    @Path("/deleteMicroLIST/{microA1}")
    @Consumes(MediaType.APPLICATION_JSON) // http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/deleteMicroLIST/3
    public Response deleteMultipleview(@PathParam("microA1") int microA1) throws SQLException, ClassNotFoundException {
        service.deleteMicroserviceLIST(microA1);
        return Response.ok().status(201).build();
    }
}






/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cookie.header.details;


import jakarta.servlet.ServletContext;
import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;

/**
 *
 * @author homec
 */

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class HeadercookieDemo {
    
        @Context
	private UriInfo uriInfo;
	
	@Context
	private ServletContext servletContext;
	
	@GET
	public String usefulAnnotations(@HeaderParam("HeaderValue") String headerAttrib,
			@CookieParam("_xsrf") String xsrf) {
		
		return "Header Value: "+headerAttrib+ "  Cookie _xsrf value: "+xsrf;
	}
	
        @GET
        @Path("demo")
        public String contextDemo(@Context HttpHeaders header) {
	   return header.getRequestHeaders().keySet().toString();
	  // return "Absolute Path: "+uriInfo.getAbsolutePath().toString();
	   
   }
	

}
package service;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/service_class")
public class Rerst_service {
	
	@Inject
	EntityManager mng;
	
	@Path("/getMessage")
	//@Consumes(MediaType.TEXT_PLAIN)
	@GET
	public String getMessage()
	{
		return "Welcome";
	}

}

package com.platzhaltr.taskr.server;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/task")
public class TaskrServlet {

	@POST
	@Produces("text/plain")
	@Consumes("application/x-www-form-urlencoded")
	public String post(@FormParam("content") String rawTask) {
		System.out.println(rawTask);
		return "";
	}
}

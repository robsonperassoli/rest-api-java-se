package com.robsonp.restjse.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class GreetingResource {
    

    @POST
    @Path("/say")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting say(Greeting greeting){
        return new Greeting(greeting.getName().toUpperCase(), greeting.getGreeting().toUpperCase());
    }
}

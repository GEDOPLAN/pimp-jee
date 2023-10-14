package de.gedoplan.showcase.rest;

import javax.inject.Inject;
import javax.resource.spi.ConfigProperty;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

  // Use the following with MicroProfile Config
  // @Inject
  // @ConfigProperty(name = "greeting")
  String greeting = "Hello Jakarta EE!";

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    return greeting;
  }
}
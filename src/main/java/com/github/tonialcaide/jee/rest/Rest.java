package com.github.tonialcaide.jee.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/book")
public class Rest {

        @GET
        @Path("/test")
        @Produces("text/plain")
        public String getBookTitle() {
            return "It works!";
        }

}

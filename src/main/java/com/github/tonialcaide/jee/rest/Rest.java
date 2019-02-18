package com.github.tonialcaide.jee.rest;

import com.github.tonialcaide.tomata.ejb.TomataEJB;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/book")
public class Rest {

        @EJB
        TomataEJB tomataEJB;

        @GET
        @Path("/test")
        @Produces("text/plain")
        public String getBookTitle() {

                return tomataEJB.test();

        }

}

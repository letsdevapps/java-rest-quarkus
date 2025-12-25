package com.pro;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class HomeResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "----- Quarkus Home Resource | Index ----";
    }

    @GET
    @Path("/greet")
    @Produces(MediaType.TEXT_PLAIN)
    public String greet(@QueryParam("name") String name) {
        if (name == null || name.isEmpty()) {
            return "Bem-vindo, Usuário!";
        }
        return "Bem-vindo, " + name + "!";
    }
}

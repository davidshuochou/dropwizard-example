package com.davidshuochou.dropwizardexample.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.davidshuochou.dropwizardexample.ExampleApplication;
import com.davidshuochou.dropwizardexample.dao.MonsterDao;

@Path("/api/monsters")
@Produces(MediaType.APPLICATION_JSON)
public class MonsterResources {

    MonsterDao dao = ExampleApplication.getMonsterDao();

    @Path("/name/{name}")
    @Consumes(MediaType.APPLICATION_JSON)
    @POST
    public Response getMonstersByName(String name) {
    	return Response.ok().build();
    }
    
}

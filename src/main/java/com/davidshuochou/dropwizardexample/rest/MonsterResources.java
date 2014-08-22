package com.davidshuochou.dropwizardexample.rest;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.davidshuochou.dropwizardexample.ExampleApplication;
import com.davidshuochou.dropwizardexample.dao.MonsterDao;

@Path("/api/monsters")
@Produces(MediaType.APPLICATION_JSON)
public class MonsterResources {

    MonsterDao dao = ExampleApplication.getMonsterDao();
}

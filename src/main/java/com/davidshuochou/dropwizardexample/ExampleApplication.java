package com.davidshuochou.dropwizardexample;

import com.davidshuochou.dropwizardexample.dao.MonsterDao;
import com.davidshuochou.dropwizardexample.rest.MonsterResources;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ExampleApplication extends Application<ExampleConfiguration> {

    private static ExampleApplication instance;
    private MonsterDao monsterDao;
    
    public static void main(String args[]) throws Exception {
        instance = new ExampleApplication();
        instance.run(args);
    }

    @Override
    public void initialize(Bootstrap<ExampleConfiguration> bootstrap) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void run(ExampleConfiguration config, Environment env)
            throws Exception {
        monsterDao = new MonsterDao();
        env.jersey().register(MonsterResources.class);
        env.jersey().setUrlPattern("/service/*");
    }

    public static MonsterDao getMonsterDao() {
        return instance.monsterDao;
    }

}

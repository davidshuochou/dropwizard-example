package com.davidshuochou.dropwizardexample;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ExampleApplication extends Application<ExampleConfiguration> {

    public static void main(String args[]) throws Exception {
        new ExampleApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<ExampleConfiguration> bootstrap) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void run(ExampleConfiguration config, Environment env)
            throws Exception {
        // TODO Auto-generated method stub
        
    }

}

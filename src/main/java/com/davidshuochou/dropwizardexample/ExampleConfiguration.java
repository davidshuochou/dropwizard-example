package com.davidshuochou.dropwizardexample;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

public class ExampleConfiguration extends Configuration {
    
    @NotEmpty
    private String userName;

    @JsonProperty
    public String getUserName() {
        return userName;
    }

}

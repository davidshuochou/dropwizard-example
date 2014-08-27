package com.davidshuochou.dropwizardexample;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

public class ExampleConfiguration extends Configuration {
    
    @NotEmpty
    private Integer maxMonsterLimbCount;

    @JsonProperty
    public Integer getUserName() {
        return maxMonsterLimbCount;
    }

}

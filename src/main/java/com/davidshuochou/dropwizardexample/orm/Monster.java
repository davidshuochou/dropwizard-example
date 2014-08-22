package com.davidshuochou.dropwizardexample.orm;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Monster {

    @JsonProperty(value = "id")
    public Long id;

    @JsonProperty(value = "name")
    public String name;

    @JsonProperty(value = "limb_count")
    public Integer limbCount;

    @JsonProperty(value = "birthday")
    public Date birthday;

}

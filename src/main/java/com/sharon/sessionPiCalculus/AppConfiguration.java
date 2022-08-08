package com.sharon.sessionPiCalculus;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class AppConfiguration extends Configuration {

    private String test;

    @JsonProperty
    public String getTest() {
        return test;
    }

    @JsonProperty
    public void setTest(String test) {
        this.test = test;
    }
}

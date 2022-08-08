package com.sharon.sessionPiCalculus.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TypingContext {
    private String var;
    private String type;

    @JsonProperty
    public String getVar() {
        return var;
    }

    @JsonProperty
    public void setVar(String var) {
        this.var = var;
    }

    public TypingContext() {
    }

    @JsonProperty
    public String getType() {
        return type;
    }

    @JsonProperty
    public void setType(String type) {
        this.type = type;
    }

    public TypingContext(String var, String type) {
        this.var = var;
        this.type = type;
    }
}

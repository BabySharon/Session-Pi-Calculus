package com.sharon.sessionPiCalculus.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class ProcessDao {
    private String name;
    private String coVariable;
    private TypingContext typingContext;

    public ProcessDao() {
    }

    @JsonProperty
    public String getName() {
        return name;
    }
    @JsonProperty
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public String getCoVariable() {
        return coVariable;
    }
    @JsonProperty
    public void setCoVariable(String coVariable) {
        this.coVariable = coVariable;
    }

    @JsonProperty
    public TypingContext getTypingContext() {
        return typingContext;
    }

    @JsonProperty
    public void setTypingContext(TypingContext typingContext) {
        this.typingContext = typingContext;
    }

    public ProcessDao(String name, String coVariable, TypingContext typingContext) {
        this.name = name;
        this.coVariable = coVariable;
        this.typingContext = typingContext;
    }

}

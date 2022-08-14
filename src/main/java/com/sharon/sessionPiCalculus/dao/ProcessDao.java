package com.sharon.sessionPiCalculus.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class ProcessDao {
    private String name;
    private String coVariable;
    //TODO co variable field may be removed as that information in present in parse tree
    private Map<String, String> typingContextMap;

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
    public Map<String, String> getTypingContextMap() {
        return typingContextMap;
    }

    @JsonProperty
    public void setTypingContextMap(Map<String, String> typingContextMap) {
        this.typingContextMap = typingContextMap;
    }

    public ProcessDao(String name, String coVariable, Map<String, String> typingContextMap) {
        this.name = name;
        this.coVariable = coVariable;
        this.typingContextMap = typingContextMap;
    }

}

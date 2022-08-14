package com.sharon.sessionPiCalculus.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputDao {
    private String input;
    List<ProcessDao> processList;
    private Map<String, String> sessionVariables;

    @JsonIgnore
    public static Map<String, String> sessionVariableObjects = new HashMap<>();

    public InputDao() {
    }

    @JsonProperty
    public Map<String, String> getSessionVariables() {
        return sessionVariables;
    }

    @JsonProperty
    public String getInput() {
        return input;
    }

    @JsonProperty
    public List<ProcessDao> getProcessList() {
        return processList;
    }

    public  Map<String, Map<String, String>> getAllTypingContexts(){
        Map<String, Map<String, String>> allTypingContexts = new HashMap();
        for (ProcessDao p: processList) {
            allTypingContexts.put(p.getName(), p.getTypingContextMap());
        }
        return allTypingContexts;
    }

}

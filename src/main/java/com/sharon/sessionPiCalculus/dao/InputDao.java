package com.sharon.sessionPiCalculus.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputDao {
    private String input;
    List<ProcessDao> processList;

    public InputDao(String input, List<ProcessDao> processList) throws JsonProcessingException {
        this.input = input;
        this.processList = processList;
    }

    public InputDao() {
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

    public Map<String, List<String>> getAllSessionTypes() {
        Map<String, List<String>> allSessionTypes = new HashMap<>();
        for (ProcessDao processDao: processList ) {
            allSessionTypes.put(processDao.getName(), processDao.getSessionType());
        }
        return allSessionTypes;
    }
}

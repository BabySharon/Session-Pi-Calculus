package com.sharon.sessionPiCalculus.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

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

}

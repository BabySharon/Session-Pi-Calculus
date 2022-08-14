package com.sharon.sessionPiCalculus.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sharon.sessionPiCalculus.SessionTypeDeserializer;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ProcessDao {
    private String name;

    @JsonDeserialize(using = SessionTypeDeserializer.class)
    private List<String> sessionType;

    public ProcessDao(String name, List<String> sessionType, Map<String, String> typingContextMap) {
        this.name = name;
        this.sessionType = sessionType;
        this.typingContextMap = typingContextMap;
    }

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
    public Map<String, String> getTypingContextMap() {
        return typingContextMap;
    }

    @JsonProperty
    public void setTypingContextMap(Map<String, String> typingContextMap) {
        this.typingContextMap = typingContextMap;
    }

    public String getSessionTypeString() {
        StringBuilder sb = new StringBuilder("");
        for (String str: sessionType) {
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> getSessionType(){
        return sessionType;
    }

    public void setSessionType(List<String> sessionType) {
        this.sessionType = sessionType;
    }
}

package com.sharon.sessionPiCalculus;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sharon.sessionPiCalculus.typing.SessionTypeDeserializer;
import com.sharon.sessionPiCalculus.typing.dao.BasicType;

import java.util.List;
import java.util.Map;

public class ProcessDao {
    private String name;

    @JsonDeserialize(using = SessionTypeDeserializer.class)
    private List<BasicType> sessionType;

    public ProcessDao(String name, List<BasicType> sessionType, Map<String, String> typingContextMap) {
        this.name = name;
        this.sessionType = sessionType;
        this.typingContextMap = typingContextMap;
    }

    private Map<String, String> typingContextMap;


    public ProcessDao() {
    }

    public void setTypingContextMap(Map<String, String> typingContextMap) {
        this.typingContextMap = typingContextMap;
    }

    @JsonProperty
    public String getName() {
        return name;
    }
    @JsonProperty
    public void setName(String name) {
        this.name = name;
    }


    public Map<String, String> getTypingContextMap() {
        return typingContextMap;
    }


    public String getSessionTypeString() {
        StringBuilder sb = new StringBuilder("");
        for (BasicType bt: sessionType) {
            sb.append(bt.typeString);
        }
        return sb.toString();
    }

    public List<BasicType> getSessionType(){
        return sessionType;
    }

    public void setSessionType(List<BasicType> sessionType) {
        this.sessionType = sessionType;
    }
}

package com.sharon.sessionPiCalculus.reduction.dao;

import com.sharon.sessionPiCalculus.typing.dao.Types;

import java.util.HashMap;
import java.util.Map;
//TODO sending expressions
public class Communication extends SubProcess {
    private String name;
    private String value;
    private StdType stdType;

    public Communication(String name, String value, StdType stdType, Types type) {
        this.type = type;
        this.name = name;
        this.value = value;
        this.stdType = stdType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setStdType(StdType stdType) {
        this.stdType = stdType;
    }

    public Communication() {

    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public StdType getStdType() {
        return stdType;
    }
}

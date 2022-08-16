package com.sharon.sessionPiCalculus.dao;

public class BasicType {
    String typeString;
    Types type;

    public String getTypeString() {
        return typeString;
    }

    public void setTypeString(String typeString) {
        this.typeString = typeString;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public BasicType(String tyeString, Types type) {
        this.typeString = tyeString;
        this.type = type;
    }
}

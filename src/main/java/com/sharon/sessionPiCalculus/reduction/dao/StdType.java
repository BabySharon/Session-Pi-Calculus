package com.sharon.sessionPiCalculus.reduction.dao;

public enum StdType {
    INT,
    STRING,
    FLOAT,
    VARIABLE,
    EXPRESSION,
    BOOLEAN;

    public static StdType getStdType(String type){
        StdType stdType = null;
        switch (type){
            case "Int":
                stdType = INT;
                break;

            case "String":
                stdType = STRING;
                break;

            case "Float":
                stdType = FLOAT;
                break;

            case "Bool":
                stdType = BOOLEAN;
                break;
        }
        return stdType;
    }
}

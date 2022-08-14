package com.sharon.sessionPiCalculus.dao;

public class Message {
    private String receivedType;
    private boolean res;
    private boolean add;

    public Message() {

    }

    public String getReceivedType() {
        return receivedType;
    }

    public void setReceivedType(String receivedType) {
        this.receivedType = receivedType;
    }

    public boolean isRes() {
        return res;
    }

    public void setRes(boolean res) {
        this.res = res;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public Message(String receivedType, boolean res, boolean add) {
        this.receivedType = receivedType;
        this.res = res;
        this.add = add;
    }
}

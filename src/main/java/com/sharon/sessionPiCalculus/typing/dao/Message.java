package com.sharon.sessionPiCalculus.typing.dao;

import com.sharon.sessionPiCalculus.reduction.dao.Communication;

public class Message {
    private String receivedType;
    private boolean res;
    private boolean add;
    private Communication comm;

    public Message() {

    }

    public Communication getComm() {
        return comm;
    }

    public void setComm(Communication comm) {
        this.comm = comm;
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
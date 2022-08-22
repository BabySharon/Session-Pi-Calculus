package com.sharon.sessionPiCalculus.reduction.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ScopeNode {
    private List<String> channels;
    List<ProcessNode> processNodeList = new LinkedList<>();

    public ScopeNode() {

    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public void setProcessNodeList(List<ProcessNode> processNodeList) {
        this.processNodeList = processNodeList;
    }

    public ScopeNode(List<String> channels) {
        this.channels = channels;
    }

    public List<ProcessNode> getProcessNodeList() {
        return processNodeList;
    }


    public void addProcessNode(ProcessNode node) {
        processNodeList.add(node);
    }

}

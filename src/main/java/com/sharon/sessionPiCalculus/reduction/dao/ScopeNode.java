package com.sharon.sessionPiCalculus.reduction.dao;

import java.util.ArrayList;
import java.util.List;

public class ScopeNode {
    public void setChannel1(String channel1) {
        this.channel1 = channel1;
    }

    public void setChannel2(String channel2) {
        this.channel2 = channel2;
    }
    private String channel1;
    private String channel2;
    List<ScopeNode> scopeNodeList = new ArrayList<>();
    List<ProcessNode> processNodeList = new ArrayList<>();

    public ScopeNode() {

    }

    public List<ScopeNode> getScopeNodeList() {
        return scopeNodeList;
    }

    public void setScopeNodeList(List<ScopeNode> scopeNodeList) {
        this.scopeNodeList = scopeNodeList;
    }

    public void setProcessNodeList(List<ProcessNode> processNodeList) {
        this.processNodeList = processNodeList;
    }

    public ScopeNode(String channel1, String channel2) {
        this.channel1 = channel1;
        this.channel2 = channel2;
    }

    public String getChannel1() {
        return channel1;
    }

    public String getChannel2() {
        return channel2;
    }

    public List<ProcessNode> getProcessNodeList() {
        return processNodeList;
    }

    public void addScopeNode(ScopeNode sn){
        scopeNodeList.add(sn);
    }

    public void addProcessNode(ProcessNode node){
        processNodeList.add(node);
    }

}

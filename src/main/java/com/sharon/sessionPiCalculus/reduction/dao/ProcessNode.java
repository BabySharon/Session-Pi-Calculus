package com.sharon.sessionPiCalculus.reduction.dao;

import java.util.ArrayList;
import java.util.List;

public class ProcessNode {
    private String name;
    private boolean underCheck;
    private List<SubProcess> subProcesses = new ArrayList<>();
    ScopeNode scopeNode;
    private ScopeNode parentScopeNode;
    private List<String> endPoints = new ArrayList<>();

    public ProcessNode() {

    }

    public ScopeNode getParentScopeNode() {
        return parentScopeNode;
    }

    public void setParentScopeNode(ScopeNode parentScopeNode) {
        this.parentScopeNode = parentScopeNode;
    }

    public ProcessNode(String name) {
        this.name = name;
    }

    public void addEndPoint(String end){
        endPoints.add(end);
    }

    public String getEndpoint(){
        return endPoints.get(0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUnderCheck() {
        return underCheck;
    }

    public void setUnderCheck(boolean underCheck) {
        this.underCheck = underCheck;
    }

    public String getName() {
        return name;
    }

    public List<SubProcess> getSubProcesses() {
        return subProcesses;
    }

    public void addSubprocess(SubProcess sp) {
        subProcesses.add(sp);
    }

    public ScopeNode getScopeNode() {
        return scopeNode;
    }

    public void setScopeNode(ScopeNode scopeNode) {
        this.scopeNode = scopeNode;
    }

    public String getString(String channel) {
        StringBuilder sb = new StringBuilder("");
        for (SubProcess sp: subProcesses) {
            sb.append(sp.getString(channel));
            sb.append(".");
        }
        return sb.toString();
    }


}

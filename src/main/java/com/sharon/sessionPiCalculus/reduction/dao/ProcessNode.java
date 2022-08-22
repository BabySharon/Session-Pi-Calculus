package com.sharon.sessionPiCalculus.reduction.dao;

import java.util.ArrayList;
import java.util.List;

public class ProcessNode {
    private String name;
    private boolean underCheck;
    private List<SubProcess> subProcesses = new ArrayList<>();
    ScopeNode scopeNode;

    public ProcessNode(String name) {
        this.name = name;
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

    public ProcessNode() {

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

}

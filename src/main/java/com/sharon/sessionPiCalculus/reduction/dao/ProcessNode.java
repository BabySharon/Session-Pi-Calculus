package com.sharon.sessionPiCalculus.reduction.dao;

import java.util.ArrayList;
import java.util.List;

public class ProcessNode {
    public void setName(String name) {
        this.name = name;
    }
    private String name;
    private List<SubProcess> subProcesses = new ArrayList<>();

    public ProcessNode(String name) {
        this.name = name;
    }

    public ProcessNode() {

    }

    public String getName() {
        return name;
    }

    public List<SubProcess> getSubProcesses() {
        return subProcesses;
    }

    public void addSubprocess(SubProcess sp){
        subProcesses.add(sp);
    }


}

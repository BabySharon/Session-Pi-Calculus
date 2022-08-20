package com.sharon.sessionPiCalculus.reduction.dao;

import java.util.ArrayList;
import java.util.List;

public class ProcessNode {
    private String name;
    private List<SubProcess> subProcesses = new ArrayList<>();

    public ProcessNode(String name) {
        this.name = name;
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

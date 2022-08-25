package com.sharon.sessionPiCalculus.reduction.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Contains current versions of objects
public class Pointers {
    public boolean isChoiceSet = false;
    public ScopeNode currentScopeNode;
    public ScopeNode sn;
    public ProcessNode currentProcessNode = new ProcessNode();
    public Choice choice = new Choice();
    public List<Communication> commList = new ArrayList<>();

    public void addCommunicationNode(Communication comm) {
        if (isChoiceSet == false)
            currentProcessNode.addSubprocess(comm);
        else
            commList.add(comm);
    }

    public List<Communication> createListCopy(List<Communication> list){
        return list.stream().map(c -> new Communication(c.getName(), c.getValue(), c.getStdType(), c.type))
                .collect(Collectors.toList());
    }
}

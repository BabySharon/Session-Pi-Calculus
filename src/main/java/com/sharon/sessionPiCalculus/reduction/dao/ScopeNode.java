package com.sharon.sessionPiCalculus.reduction.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ScopeNode {
    private List<String> channels;
    List<ProcessNode> processNodeList = new LinkedList<>();
    private ProcessNode parentProcessNode;
    private boolean isRoot;

    public ScopeNode() {

    }

    public boolean isRoot() {
        return isRoot;
    }

    public void setRoot(boolean root) {
        isRoot = root;
    }

    public ProcessNode getParentProcessNode() {
        return parentProcessNode;
    }

    public void setParentProcessNode(ProcessNode parentProcessNode) {
        this.parentProcessNode = parentProcessNode;
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

    public void addProcessNodeList(List<ProcessNode> nodeList) {
        processNodeList.addAll(nodeList);
    }

    public String getString() {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < channels.size(); i+=2) {
            str.append("new ").append(channels.get(i)).append(" "+channels.get(i+1)+" " );
        }
        str.append("(");
        List<ProcessNode> processNodes = getProcessNodeList();
        for (int i = 0; i < processNodes.size(); i++) {
            ProcessNode pn = processNodes.get(i);
            if (pn.getScopeNode() == null) {
                str.append(pn.getString(channels.get(i)));
            }
            str.append(" | ");
        }
        str.deleteCharAt(str.length()-2);
        str.append(")");
        return str.toString();
    }

}

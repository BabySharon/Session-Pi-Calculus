package com.sharon.sessionPiCalculus.reduction.dao;

import com.sharon.sessionPiCalculus.reduction.ReductionStep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ScopeNode {
    private List<Session> channels = new ArrayList<>();
    private List<String> channelStrings = new ArrayList<>();
    List<ProcessNode> processNodeList = new LinkedList<>();
    private ProcessNode parentProcessNode;
    private boolean isRoot;
    private boolean signalToStop;
    List<ReductionStep> steps = new ArrayList<>();

    public ScopeNode() {

    }

    public ScopeNode(Session channels) {
        this.addChannels(channels);
        this.channelStrings = channels.getChannels();
    }

    public boolean isSignalToStop() {
        return signalToStop;
    }

    public void setSignalToStop(boolean signalToStop) {
        this.signalToStop = signalToStop;
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

    public List<Session> getChannels() {
        return channels;
    }

    public void setChannels(List<Session> channels) {
        this.channels = channels;
    }

    public void addChannels(Session session) {
        channels.add(session);
    }

    public void setProcessNodeList(List<ProcessNode> processNodeList) {
        this.processNodeList = processNodeList;
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
        for (int i = 0; i < channels.size(); i++) {
            List<String> channelStrings = channels.get(i).getChannels();
            str.append("new ").append(channelStrings.get(0)).append(" "+channelStrings.get(1)+" " );
        }
        str.append("(");
        List<ProcessNode> processNodes = getProcessNodeList();
        for (int i = 0; i < processNodes.size(); i++) {
            ProcessNode pn = processNodes.get(i);
            if (pn.getScopeNode() == null) {
                str.append(pn.getString(pn.getEndpoint()));
            }
            else{
                str.append(pn.getScopeNode().getString());
            }
            if(i != processNodes.size()-1)
                str.append(" | ");
        }
//        str.deleteCharAt(str.length()-2);
        str.append(")");
        return str.toString();
    }

    public String removeChannelString() {
        String s = "";
        if(!(channelStrings.isEmpty())) {
            s = channelStrings.remove(0);
        }
        return s;
    }

    public String getCounterpart(String endpoint){
        String counterpart = null;
        for (Session s: channels) {
            if(s.getChannels().contains(endpoint)) {
                counterpart = s.getCounterpart(endpoint);
                break;
            }
        }
        return counterpart;
    }

    public void addStep(ReductionStep step){
        steps.add(step);
    }

    public List<ReductionStep> getSteps() {
        return steps;
    }
}

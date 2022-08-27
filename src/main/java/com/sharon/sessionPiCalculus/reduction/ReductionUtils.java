package com.sharon.sessionPiCalculus.reduction;

import com.sharon.sessionPiCalculus.reduction.dao.*;
import com.sharon.sessionPiCalculus.typing.dao.Types;

import java.util.*;

public class ReductionUtils {
    // TODO Add channel to communication
    // TODO replication
    // TODO now only processes inside a scope restriction considered
    // TODO Sending channel and removing from typing context

    /* Method */
    /* First try scope expansion
    /* Inaction
    /* */
    public static ScopeNode semantics(ScopeNode sn, Map<String, List<String>> processVariableMap) {
        List<ReductionStep> steps = new ArrayList<>();
        sn.addStep(new ReductionStep(null, null, null, sn.getString()));
        sn = inactionCongruence(sn);
        sn = scopeExpansion(sn, steps);
//        System.out.println(sn.getString());
        while (sn.getProcessNodeList().size() > 1 && sn.isSignalToStop() == false) // Until there is a single inaction left
            sn = communicate(sn);
        return sn;
    }

    private static ScopeNode communicate(ScopeNode sn) {
        sn = commutativity(sn);
//        System.out.println(sn.getString());
        ProcessNode start = sn.getProcessNodeList().get(0);
        ProcessNode end = sn.getProcessNodeList().get(1);
        if (start.getSubProcesses().get(0).type == Types.SELECT && end.getSubProcesses().get(0).type == Types.BRANCH) {
            Choice c = (Choice) start.getSubProcesses().get(0);
            String label = c.getProcess().keySet().iterator().next();
            start.setSubProcesses(communicateChoice(start, c, label));
            end.setSubProcesses(communicateChoice(end, (Choice) end.getSubProcesses().get(0), label));
            sn.addStep(new ReductionStep(null, SemanticsRule.CASE, null, sn.getString()));
        }
//        System.out.println(sn.getString());
        sn = commutativity(sn);
        start = sn.getProcessNodeList().get(0);
        end = sn.getProcessNodeList().get(1);
        if (start.getSubProcesses().get(0).type == Types.SEND && end.getSubProcesses().get(0).type == Types.RECEIVE) {
            start.getSubProcesses().remove(0);
            end.getSubProcesses().remove(0);
            sn.addStep(new ReductionStep(null, SemanticsRule.COMM, null, sn.getString()));
        }
        if (start.getSubProcesses().get(0).type == Types.END || end.getSubProcesses().get(0).type == Types.END)
            sn = inactionCongruence(sn);
//        System.out.println(sn.getString());
        return sn;
    }

    private static List<SubProcess> communicateChoice(ProcessNode pn, Choice c, String label) {
        List<SubProcess> newList = new LinkedList<>();
        List<Communication> commList = c.getProcess().get(label);
        newList.addAll(commList);
        List<SubProcess> subProcesses = pn.getSubProcesses();
        subProcesses.remove(0);
        newList.addAll(subProcesses);
        return newList;
    }

    private static ScopeNode commutativity(ScopeNode sn) {
        String otherEnd = "";
        boolean isSignalToStop = true;
        List<ProcessNode> processNodes = sn.getProcessNodeList();
        ProcessNode starter = processNodes.get(0);
        List<ProcessNode> processNodesToCheck = processNodes.subList(1, processNodes.size());
        if (Arrays.asList(Types.SELECT, Types.SEND).contains(starter.getSubProcesses().get(0).type) == false) {
            otherEnd = sn.getCounterpart(starter.getEndpoint());

            for (ProcessNode pn : processNodesToCheck) {
                if (pn.getEndpoint().equals(otherEnd) && pn.getSubProcesses().size() != 0 && pn.getSubProcesses().get(0)
                        .getString("") != "zero") {
                    processNodes.remove(pn);
                    processNodes.add(0, pn);
                    sn.setProcessNodeList(processNodes);
                    isSignalToStop = false;
                    sn.addStep(new ReductionStep(null, SemanticsRule.STRUCT, SemanticsRule.Commutativity, sn.getString()));
                    break;
                }
            }
            if(isSignalToStop)
                sn.setSignalToStop(true);
            else
                sn.setSignalToStop(false);
        }
        return sn;
    }

    private static ScopeNode inactionCongruence(ScopeNode sn) {
        List<ProcessNode> processNodes = sn.getProcessNodeList();
        String prevNode;
        for (int i = 0; i < processNodes.size(); i++) {
            ProcessNode pn = processNodes.get(i);
            if (pn.getScopeNode() != null) {
                ScopeNode scopeNode = inactionCongruence(pn.getScopeNode());
                pn.setScopeNode(scopeNode);
            }
            if (pn.getScopeNode() == null) {
                if (pn.getSubProcesses().size() == 1 & pn.getSubProcesses().get(0).type == Types.END) {
                    if (i == 0)
                        prevNode = processNodes.get(1).getName();
                    else
                        prevNode = processNodes.get(i - 1).getName();
                    processNodes.remove(pn);
                    sn.setProcessNodeList(processNodes);
                    pn = null;
                    sn.addStep(new ReductionStep(Collections.singletonList(prevNode + "|zero ->" + prevNode),
                            SemanticsRule.STRUCT, SemanticsRule.Inaction, sn.getString()));
                }
            }
        }
        return sn;
    }

    /* Only one level of scope expansion considered */
    private static ScopeNode scopeExpansion(ScopeNode sn, List<ReductionStep> steps) {
        String judgement = "";
        List<ProcessNode> processNodes = sn.getProcessNodeList();
        List<ProcessNode> restructureList = new LinkedList<>();
        for (ProcessNode process : processNodes) {
            if (process.getScopeNode() != null) {
                // Scope restriction inside a process
                // Expanding scope will only have one session object
                List<String> channels = process.getScopeNode().getChannels().get(0).getChannels();
                process.setUnderCheck(true);
                if (!ifInFreeVariables(channels, processNodes)) {
                    judgement = channels.get(0) + "," + channels.get(1) + " not in fv(" + processNodes.get(0).getName();
                    // channels note in free variables
                    List<Session> presentChannels = sn.getChannels();
                    presentChannels.addAll(process.getScopeNode().getChannels());
                    sn.setChannels(presentChannels);
                    restructureList.addAll(process.getScopeNode().getProcessNodeList());
                }
            }
        }
        List<ProcessNode> list = new LinkedList<>();
        for (ProcessNode pn : sn.getProcessNodeList()) {
            if (pn.isUnderCheck()) {
                list.addAll(restructureList);
                pn = null; // Trying to deallocate memory
            } else
                list.add(pn);
        }
        sn.setProcessNodeList(list);
        if(judgement != "")
            sn.addStep(new ReductionStep(Collections.singletonList(judgement), SemanticsRule.STRUCT,
                SemanticsRule.ScopeExpansion, sn.getString()));
        return sn;
    }

    private static boolean ifInFreeVariables(List<String> channels, List<ProcessNode> processNodes) {
        List<String> freeVariables = getFreeVariables(processNodes);
        if (freeVariables.containsAll(channels))
            return true;
        else
            return false;
    }

    private static List<String> getFreeVariables(List<ProcessNode> processNodes) {
        List<String> freeVariables = new ArrayList<>();
        for (ProcessNode process : processNodes) {
            if (process.isUnderCheck() == false) {
                //Subprocesses and scopeNode
                // When checking free variables only considering single parameter scenario
                for (SubProcess p : process.getSubProcesses()) {
                    if (Arrays.asList(Types.SELECT, Types.BRANCH).contains(p.type)) {
                        Choice subProcess = (Choice) p;
                        Map<String, List<Communication>> map = subProcess.getProcess();
                        for (String key : map.keySet()) {
                            for (Communication c : ((Choice) p).getProcess().get(key)) {
                                if (isFreeVariable(c))
                                    freeVariables.add(c.getName());
                            }
                        }
                    } else {
                        if(p.type != Types.END) {
                            Communication c = (Communication) p;
                            if (isFreeVariable(c))
                                freeVariables.add(c.getName());
                        }
                    }
                    ScopeNode scopeNode = process.getScopeNode();
                    if (scopeNode != null) {
                        getFreeVariables(scopeNode.getProcessNodeList());
                    }
                }
            }
        }
        return freeVariables;
    }

    private static boolean isFreeVariable(Communication c) {
        if (c.getName() != null && c.type != Types.RECEIVE)
            return true;
        else
            return false;
    }

}

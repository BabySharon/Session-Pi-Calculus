package com.sharon.sessionPiCalculus.reduction;

import com.sharon.sessionPiCalculus.reduction.dao.*;
import com.sharon.sessionPiCalculus.typing.dao.Types;

import java.util.*;

public class ReductionUtils {
    // TODO Add channel to communication
    // TODO now only processes inside a scope restriction considered
    // TODO Sending channel and removing from typing context

    /* Method */
    /* First try scope expansion

    /* */
    public static void semantics(ScopeNode sn, Map<String, List<String>> processVariableMap) {
        List<ReductionStep> steps = new ArrayList<>();
        String otherEnd = "";
        sn = inactionCongruence(sn, steps);
        sn = scopeExpansion(sn, steps);
        System.out.println(sn.getString());
        List<ProcessNode> processNodes = sn.getProcessNodeList();
        ProcessNode starter = processNodes.get(0);
        List<ProcessNode> processNodesToCheck = processNodes.subList(1, processNodes.size());
        if (Arrays.asList(Types.SELECT, Types.SEND).contains(starter.getSubProcesses().get(0).type) == false) {
            otherEnd = sn.getCounterpart(starter.getEndpoint());
        }
        for (ProcessNode pn : processNodesToCheck) {
            if (pn.getEndpoint().equals(otherEnd) && pn.getSubProcesses().size() != 0 && pn.getSubProcesses().get(0)
                    .getString("") != "zero") {
                processNodes.remove(pn);
                processNodes.add(0, pn);
                sn.setProcessNodeList(processNodes);
                break;
            }
        }
        steps.add(new ReductionStep(null, SemanticsRule.STRUCT, SemanticsRule.Commutativity, sn.getString()));
        System.out.println(sn.getString());
    }

    private static ScopeNode inactionCongruence(ScopeNode sn, List<ReductionStep> steps) {
        List<ProcessNode> processNodes = sn.getProcessNodeList();
        String prevNode;
        for (int i = 0; i < processNodes.size(); i++) {
            ProcessNode pn = processNodes.get(i);
            if (pn.getScopeNode() != null) {
                ScopeNode scopeNode = inactionCongruence(pn.getScopeNode(), steps);
                pn.setScopeNode(scopeNode);
            }
            if (pn.getSubProcesses().size() == 1 & pn.getSubProcesses().get(0).type == Types.END) {
                if (i == 0)
                    prevNode = processNodes.get(1).getName();
                else
                    prevNode = processNodes.get(i - 1).getName();
                processNodes.remove(pn);
                sn.setProcessNodeList(processNodes);
                pn = null;
                steps.add(new ReductionStep(Collections.singletonList(prevNode + "|zero ->" + prevNode),
                        SemanticsRule.STRUCT, SemanticsRule.Inaction, sn.getString()));
            }
        }
        return sn;
    }

    /* Only one level of scope expansion considered */
    private static ScopeNode scopeExpansion(ScopeNode sn, List<ReductionStep> steps) {
        List<ProcessNode> processNodes = sn.getProcessNodeList();
        List<ProcessNode> restructureList = new LinkedList<>();
        for (ProcessNode process : processNodes) {
            if (process.getScopeNode() != null) {
                // Scope restriction inside a process
                // Expanding scope will only have one session object
                List<String> channels = process.getScopeNode().getChannels().get(0).getChannels();
                process.setUnderCheck(true);
                if (!ifInFreeVariables(channels, processNodes)) {
                    String judgement = channels.get(0) + "," + channels.get(1) + " not in fv(" + processNodes.get(0).getName();
                    steps.add(new ReductionStep(Collections.singletonList(judgement), SemanticsRule.STRUCT,
                            SemanticsRule.ScopeExpansion, sn.getString()));
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
                        Communication c = (Communication) p;
                        if (isFreeVariable(c))
                            freeVariables.add(c.getName());
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

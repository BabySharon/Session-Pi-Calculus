package com.sharon.sessionPiCalculus.reduction;

import com.sharon.sessionPiCalculus.reduction.dao.*;
import com.sharon.sessionPiCalculus.typing.dao.Types;

import java.util.*;

public class ReductionUtils {
    ReductionStep steps = new ReductionStep();

    // TODO now only processes inside a scope restriction considered

    /* Method */
    /* First try scope expansion

    /* */
    public static void semantics(ScopeNode sn) {
        sn = scopeExpansion(sn);
        System.out.println(sn.getString());

    }

    /* Only one level of scope expansion considered */
    private static ScopeNode scopeExpansion(ScopeNode sn) {
        List<ProcessNode> processNodes = sn.getProcessNodeList();
        List<ProcessNode> restructureList = new LinkedList<>();
        for (ProcessNode process : processNodes) {
            if (process.getScopeNode() != null) {
                // Scope restriction inside a process
                List<String> channels = process.getScopeNode().getChannels();
                process.setUnderCheck(true);
                if (ifInFreeVariables(channels, processNodes) == false) {
                    // channels note in free variables
                    List<String> presentChannels = sn.getChannels();
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
            }
            else
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

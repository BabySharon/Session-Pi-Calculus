package com.sharon.sessionPiCalculus.typing.antlr;

import com.sharon.sessionPiCalculus.InputDao;
import com.sharon.sessionPiCalculus.reduction.ReductionUtils;
import com.sharon.sessionPiCalculus.reduction.dao.*;
import com.sharon.sessionPiCalculus.typing.dao.BasicType;
import com.sharon.sessionPiCalculus.typing.dao.CompositeType;
import com.sharon.sessionPiCalculus.typing.dao.Message;
import com.sharon.sessionPiCalculus.typing.dao.Types;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.stream.Collectors;
//TODO Check duality - in front-end
// TODO ONLY single parameter in send and receive - no expressions
//TODO Type to token code mapping
//TODO add exceptions and handle them, if process names are not found in map
//TODO parse tree construction error
// TODO Validate types in the typing contexts
// TODO replicate, doargs ?
// TODO front end checking for select wrong type
// TODO COVARIABLE INTERCHANGE
//TODO naming and typing inner processes - zero processes alone, no sequential process context and there will be no name

public class Utils {
    public static Map<String, Map<String, String>> allTypingContexts = new HashMap<>();
    public static Map<String, List<BasicType>> allSessionTypes = new HashMap<>();
    public static Map<String, List<String>> processVariableMap = new HashMap<>();

    public static ParseTree createVisitor(String input, InputDao inputDao, String name, boolean red) throws Exception {
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        sessionPiLexer lexer = new sessionPiLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        sessionPiParser parser = new sessionPiParser(tokens);
        ParseTree tree = parser.process();
        System.out.println("-----------------Typing Rules-----------------");
        allTypingContexts = inputDao.getAllTypingContexts();
        allSessionTypes = inputDao.getAllSessionTypes();
        Pointers point = typeCheckManager(tree, null, new Pointers(), red);
        allSessionTypes.clear();
        allTypingContexts.clear();
        if (red)
            ReductionUtils.semantics(point.sn, processVariableMap);
        processVariableMap.clear();
        return tree;
    }


    public static String getStringFromSet(Collection<String> values) {
        StringBuilder s = new StringBuilder("");
        for (String str : values) {
            s.append(" " + str);
        }
        return String.valueOf(s);
    }

    public static Pointers typeCheckManager(ParseTree c, String name, Pointers p, boolean red) throws
            Exception {
        switch (c.toString()) {
            case "ScopeSessionLabelContext": {
                sessionPiParser.ScopeSessionLabelContext sslc = ((sessionPiParser.ScopeSessionLabelContext) c);
                List<String> coVariables = sslc.scopeSession().VAR().stream().map(s -> s.getText())
                        .collect(Collectors.toList());
                List<String> processes = ((sessionPiParser.ParallelContext) sslc.process()).process().stream()
                        .map(spc -> ((sessionPiParser.SequentialProcessContext) spc).CAPS().getText())
                        .collect(Collectors.toList());
                if (coVariables.size() == processes.size()) {
                    for (int i = 0; i < processes.size(); i++) {
                        putToProcessVariableMap(processes.get(i), Arrays.asList(coVariables.get(i)));
                    }
                } else
                    System.out.println("Error in defining session variables");
                iterateChildren(c, null, p, red);
            }
            break;

            case "ScopeSessionContext": {
                System.out.println("Rule: RuleT-Res");
                if (red) {
                    /* For Reduction */
                    sessionPiParser.ScopeSessionContext ssc = ((sessionPiParser.ScopeSessionContext) c);
                    List<String> channels = ssc.VAR().stream().map(s -> s.getText()).collect(Collectors.toList());
                    if (p.currentScopeNode == null) {
                        p.currentScopeNode = new ScopeNode(new Session(channels.get(0), channels.get(1)));
                        p.sn = p.currentScopeNode;
                        p.currentScopeNode.setRoot(true);
                    } else {
                        sessionPiParser.SequentialProcessContext parent = (sessionPiParser.SequentialProcessContext) ((sessionPiParser.ScopeSessionContext)c)
                                .getParent().getParent();
                        List<String> parentChannels = processVariableMap.get(parent.CAPS().getText());
                        putToProcessVariableMap(name, parentChannels);
                        ScopeNode newNode = new ScopeNode(new Session(channels.get(0), channels.get(1)));
                        p.currentProcessNode.setScopeNode(newNode);
                        p.currentScopeNode.addProcessNode(p.currentProcessNode);
                        p.currentProcessNode.setParentScopeNode(p.currentScopeNode);
                        newNode.setParentProcessNode(p.currentProcessNode);
                        p.currentScopeNode = newNode;
                        p.currentScopeNode.setRoot(false);
                    }
                }
                /* */
                //                for (TerminalNode node : coVariables) {
//                    if (!InputDao.sessionVariableObjects.keySet().contains(node.getText())) {
//                        throw new Exception("Covariables in the input and the process input cannot be matched");
//                    }
//                }

                // To check the duality - Only two co variables assumed
//                if (!(Utils.checkDuality(InputDao.sessionVariableObjects)))
//                    System.out.println("Non dual types: " + Utils.getStringFromSet(InputDao.sessionVariableObjects.values()));
            }
            break;

            case "ParallelContext": {
                System.out.println("Rule: T-Par");
                /* From all the typing contexts, get the required ones according to constituent processes */
//                List<String> processNames = ((sessionPiParser.ParallelContext) c).getProcessNames();
//                for (String k : processNames) {
//                    typeCheckManager(c, allTypingContexts);
//                }
                iterateChildren(c, null, p, red);
            }
            break;

            case "SequentialProcessContext": {
                String processName = ((sessionPiParser.SequentialProcessContext) c).CAPS().getText();
                if (red) {
                    /* For Reduction */
                    p.currentProcessNode = new ProcessNode();
                    p.currentProcessNode.setName(processName);
                    p.currentProcessNode.addEndPoint(p.currentScopeNode.removeChannelString());
                    p.currentProcessNode.setParentScopeNode(p.currentScopeNode);
                    /* */
                }
                iterateChildren(c, processName, p, red);
            }
            break;

            case "SendProcessContext": {
                Communication comm = new Communication();
                boolean res = true;
                BasicType sendType = null;
                sessionPiParser.SendContext s = ((sessionPiParser.SendProcessContext) c).send();
                Map<String, String> typingContext = allTypingContexts.get(name);
                List<BasicType> sessionType = allSessionTypes.get(name);
                System.out.println("Rule: T-Out   Process: " + name);
                if (!sessionType.isEmpty()) {
                    sendType = sessionType.remove(0);
                }
                if (checkChannel(name, s.VAR()) == false) {
                    res = false;
                    System.out.println("Unrecognised channel");
                }
                /* Validating if channel type is send type */
                if (!(sendType.getType().equals(Types.SEND))) {
                    res = false;
                }
                /* Validating the parameter */
                Message m = checkBaseType(sendType, s.payload(), typingContext, comm);
                if (!m.isRes())
                    res = false;

                if (!res) {
                    String t = m.getReceivedType();
                    if (m.isAdd())
                        System.out.println("Error: " + sendType.getTypeString() + " expected. Got " + "!" + t);
                    else
                        System.out.println("Error: " + sendType.getTypeString() + " expected. Got " + t);

                }
                if (red) {
                    /* For Reduction */
                    comm = m.getComm();
                    comm.type = Types.SEND;
                    p.addCommunicationNode(comm);
                    /* */
                }
            }
            break;

            case "ReceiveProcessContext": {
                Communication comm = new Communication();
                boolean res = true;
                BasicType receiveType = null;
                sessionPiParser.ReceiveContext r = ((sessionPiParser.ReceiveProcessContext) c).receive();
                Map<String, String> typingContext = allTypingContexts.get(name);
                List<BasicType> sessionType = allSessionTypes.get(name);
                System.out.println("Rule: T-In \t  Process: " + name);
                if (!sessionType.isEmpty()) {
                    receiveType = sessionType.remove(0);
                }
                if (checkChannel(name, r.VAR()) == false) {
                    res = false;
                    System.out.println("Unrecognised channel");
                }
                /* Validating if channel type is send type */
                if (!(receiveType.getType().equals(Types.RECEIVE))) {
                    res = false;
                }

                /* Validating the parameter */
                Message m = checkBaseType(receiveType, r.payload(), typingContext, comm);
                if (!m.isRes())
                    res = false;

                if (!res) {
                    String t = m.getReceivedType();
                    if (m.isAdd())
                        System.out.println("Error: " + receiveType.getTypeString() + " expected. Got " + "?" + t);
                    else
                        System.out.println("Error: " + receiveType.getTypeString() + " expected. Got " + t);

                }
                if (red) {
                    /* Reduction */
                    comm = m.getComm();
                    comm.type = Types.RECEIVE;
                    p.addCommunicationNode(comm);
                    /* */
                }
            }
            break;

            case "SelectProcessContext": {
                BasicType st = null;
                System.out.println("Rule: T-Select \t  Process: " + name);
                sessionPiParser.SelectProcessContext spc = (sessionPiParser.SelectProcessContext) c;
                boolean res = true;
                StringBuilder errorMessage = new StringBuilder("");
                List<BasicType> sessionType = allSessionTypes.get(name);
                st = sessionType.remove(0);
                Map<String, List<BasicType>> selectMap = ((CompositeType) st).getSelect();
                if (checkChannel(name, spc.VAR()) == false) {
                    res = false;
                    errorMessage.append("Unrecognised channel");
                }
                /*
                 * 1. Check if select type
                 * 2. Label present? */
                if (!(st.getType().equals(Types.SELECT))) {
                    res = false;
                    errorMessage.append(spc.VAR().getText() + " not of select type.\n");
                }
                String label = spc.IDENTIFIER().getText();
                if (!(selectMap.keySet().contains(label))) {
                    res = false;
                    errorMessage.append("Label " + label + " selected");
                }
                if (!res)
                    System.out.println(errorMessage);

                if (red) {
                    /* For Reduction */
                    p.choice = new Choice();
                    p.isChoiceSet = true;
                    p.choice.type = Types.SELECT;
                }

                allSessionTypes.put(name, selectMap.get(label));
                p = iterateChildren(spc, name, p, red);
                allSessionTypes.put(name, sessionType);

                if (red) {
                    p.choice.addProcess(label, p.createListCopy(p.commList));
                    p.currentProcessNode.addSubprocess(p.choice);
                    p.isChoiceSet = false;
                    p.commList.clear();
                    /* */
                }
            }
            break;

            case "BranchProcessContext": {
                BasicType bt = null;
                System.out.println("Rule: T-Branch \t  Process: " + name);
                boolean res = true;
                sessionPiParser.BranchProcessContext bpc = (sessionPiParser.BranchProcessContext) c;
                StringBuilder errorMessage = new StringBuilder("");
                if (checkChannel(name, bpc.VAR()) == false) {
                    res = false;
                    errorMessage.append("Unrecognised channel");
                }
                List<sessionPiParser.BranchContext> bc = new ArrayList<>();
                int labelCount = 0;
                List<BasicType> sessionType = allSessionTypes.get(name);
                bt = sessionType.remove(0);
                Map<String, List<BasicType>> branchMap = ((CompositeType) bt).getBranch();
                /* Validate
                 * 1. If the type is branch
                 * 2. If the number of branches match
                 * 3. Check if the labels match */ //TODO in front end restrict only the specified labels in the output or generate the branch
                if (!(bt.getType().equals(Types.BRANCH))) {
                    res = false;
                    errorMessage.append(bpc.VAR().getText() + " not of branch type.\n");
                }
                labelCount = bpc.branch().size();
                int labelCountType = branchMap.keySet().size();
                if (labelCountType != labelCount) {
                    res = false;
                    errorMessage.append(bpc.VAR().getText() + " has wrong label count");
                }
                bc = bpc.branch();
                if (res == false)
                    System.out.println(errorMessage);
                if (red) {
                    /* For Reduction */
                    p.choice = new Choice();
                    p.choice.type = Types.BRANCH;
                    p.isChoiceSet = true;
                }

                for (sessionPiParser.BranchContext pb : bc) {
                    if (!sessionType.isEmpty()) {
                        allSessionTypes.put(name, branchMap.get(pb.IDENTIFIER().getText()));
                        p = iterateChildren(pb, name, p, red);
                        if (red) {
                            if (p.isChoiceSet) {
                                p.choice.addProcess(pb.IDENTIFIER().getText(), p.createListCopy(p.commList));
                                p.commList.clear();
                            }
                        }

                    }
                }
                allSessionTypes.put(name, sessionType);
                if (red) {
                    p.currentProcessNode.addSubprocess(p.choice);
                    p.isChoiceSet = false;
                    /* */
                }
            }
            break;

            case "InactionContext": {
                if (red) {
                    p.currentProcessNode.addSubprocess(new Inaction());
                    p.currentScopeNode.addProcessNode(p.currentProcessNode);
                }
            }
            break;
        }
        if(p.currentScopeNode.getProcessNodeList().size() == 2 && p.currentScopeNode.isRoot() == false)
            p.currentScopeNode = p.currentScopeNode.getParentProcessNode().getParentScopeNode();
        return p;
    }

    private static void putToProcessVariableMap(String name, List<String> channel) {
        if (processVariableMap.get(name) == null) {
            processVariableMap.put(name, new ArrayList<>(channel));
        } else {
            List<String> channels = processVariableMap.get(name);
            channels.addAll(channel);
            processVariableMap.put(name, channels);
        }
    }

    private static Message checkBaseType(BasicType type, sessionPiParser.PayloadContext payload, Map<String,
            String> typingContext, Communication comm) {
        boolean res = true;
        String t = null;
        Message mssg = new Message();
        switch (payload.getClass().getName().split("\\$")[1]) {
            case "ExprPayloadContext": {
                /* Single exp context can be bool or INT */
                List<ParseTree> exprContexts = ((sessionPiParser.ExprPayloadContext) payload).expr().children;
                if (exprContexts.size() == 1) {
                    if (!exprContexts.get(0).toString().equals("BoolContext")) {
                        t = "Int";
                        comm.setValue(((sessionPiParser.ExprPayloadContext) payload).expr().getText());
                        comm.setStdType(StdType.INT);
                    } else {
                        t = "Bool";
                        comm.setValue(((sessionPiParser.ExprPayloadContext) payload).expr().bool().getText());
                        comm.setStdType(StdType.BOOLEAN);
                    }
                    if (!t.equalsIgnoreCase(type.getTypeString().substring(1)))
                        res = false;
                }
                mssg.setAdd(true);
            }
            break;

            case "VarPayloadContext": {
                t = typingContext.get(((sessionPiParser.VarPayloadContext) payload).VAR().getText());
                if (t == null) {
                    System.out.println("Provide type for " + ((sessionPiParser.VarPayloadContext) payload).VAR().getText()
                            + " in the input");
                }
                if (!t.equalsIgnoreCase(type.getTypeString().substring(1)))
                    res = false;
                mssg.setAdd(false);
                comm.setName(((sessionPiParser.VarPayloadContext) payload).VAR().getText());
                comm.setStdType(StdType.getStdType(t));
            }
        }
        mssg.setRes(res);
        mssg.setComm(comm);
        mssg.setReceivedType(t);
        return mssg;
    }

    private static Pointers iterateChildren(ParseTree c, String name, Pointers p, boolean red) throws Exception {
        int childCount = c.getChildCount();
        int i = 0;
        Pointers newP = null;
        while (i < childCount) {
            newP = typeCheckManager(c.getChild(i), name, p, red);
            i++;
        }
        return newP;
    }

    private static boolean checkChannel(String name, TerminalNode node) {
        if (processVariableMap.containsKey(name))
            return processVariableMap.get(name).contains(node.getText());
        else
            System.out.println("Invalid process name");
        return false;
    }

}

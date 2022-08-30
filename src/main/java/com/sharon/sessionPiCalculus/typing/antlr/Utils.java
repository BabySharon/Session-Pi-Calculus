package com.sharon.sessionPiCalculus.typing.antlr;

import com.sharon.sessionPiCalculus.InputDao;
import com.sharon.sessionPiCalculus.Wrapper;
import com.sharon.sessionPiCalculus.reduction.ReductionUtils;
import com.sharon.sessionPiCalculus.reduction.dao.*;
import com.sharon.sessionPiCalculus.typing.TypingStep;
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
//TODO When sending channels in the example of scope expansion, how will the session type be affected
//TODO Check duality - in front-end
// IF TYPE ERROR -  don't do reduction and show errors
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
    public static boolean error = false;

    public static Wrapper createVisitor(String input, InputDao inputDao, String name, boolean red) throws Exception {
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        sessionPiLexer lexer = new sessionPiLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        sessionPiParser parser = new sessionPiParser(tokens);
        ParseTree tree = parser.process();
        System.out.println("-----------------Typing Rules-----------------");
        allTypingContexts = inputDao.getAllTypingContexts();
        allSessionTypes = inputDao.getAllSessionTypes();
        TypingStep ts = null;
        Pointers point = null;
        Wrapper w = new Wrapper();
        try {
             point = typeCheckManager(tree, null, new Pointers(), red);
        }catch (Exception e) {
            w.ts = point.ts;
        }
        allSessionTypes.clear();
        allTypingContexts.clear();
        ScopeNode sn = null;
        if (red) {
            sn = ReductionUtils.semantics(point.sn, processVariableMap);
        }
        processVariableMap.clear();
        w.steps = sn.getSteps();
        return w;
    }


    public static String stringSessionType(String processName) {
        List<BasicType> sessionType = allSessionTypes.get(processName);
        StringBuilder str = new StringBuilder("");
        for (BasicType bt : sessionType) {
            str.append(bt.getTypeString());
        }
        return str.toString();
    }

    public static String processNameFromChannel(String channel) {
        String process = "";
        for (Map.Entry<String, List<String>> entry : processVariableMap.entrySet()) {
            if (entry.getValue().contains(channel)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static Pointers typeCheckManager(ParseTree c, String name, Pointers p, boolean red) throws
            Exception {

            TypingStep ts = new TypingStep();
//        else {
//            TypingStep newTs = new TypingStep();
//            p.currentTs.addStep(newTs);
//            p.currentTs = newTs;
//        }
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
                    ts.setRule("T-Res");
                    System.out.println("Rule: RuleT-Res");
                    if (red) {
                        /* For Reduction */
                        sessionPiParser.ScopeSessionContext ssc = ((sessionPiParser.ScopeSessionContext) c);
                        List<String> channels = ssc.VAR().stream().map(s -> s.getText()).collect(Collectors.toList());
                        if (p.currentScopeNode == null) {
                            p.currentScopeNode = new ScopeNode(new Session(channels.get(0), channels.get(1)));
                            ts.setText("new ".concat(channels.get(0)) + " " + channels.get(1));
                            p.sn = p.currentScopeNode;
                            p.currentScopeNode.setRoot(true);
                            Map<String, String> newMap = new HashMap<>();
                            String process1 = processNameFromChannel(channels.get(0));
                            String process2 = processNameFromChannel(channels.get(1));
                            newMap.put(process1, stringSessionType(process1));
                            newMap.put(process2, stringSessionType(process2));
                            ts.setTypingContexts(newMap);
                            error = isDual(allSessionTypes.get(process1), allSessionTypes.get(process2));
                            p.ts.add(ts);
                            if (!error)
                                ts.setErrorMessage("Not dual types");

                        } else {
                            sessionPiParser.SequentialProcessContext parent = (sessionPiParser.SequentialProcessContext) ((sessionPiParser.ScopeSessionContext) c)
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
                            ts.setText("new ".concat(channels.get(0)) + " " + channels.get(1));
                            Map<String, String> newMap = new HashMap<>();
                            String process1 = processNameFromChannel(channels.get(0));
                            String process2 = processNameFromChannel(channels.get(1));
                            newMap.put(process1, stringSessionType(process1));
                            newMap.put(process2, stringSessionType(process2));
                            ts.setTypingContexts(newMap);
                            error = isDual(allSessionTypes.get(process1), allSessionTypes.get(process2));
                            p.ts.add(ts);
                            if (!error)
                               ts.setErrorMessage("Not dual types");

                        }
                    }
                    /* */
                    //                for (TerminalNode node : coVariables) {
//                    if (!InputDao.sessionVariableObjects.keySet().contains(node.getText())) {
//                        throw new Exception("Covariables in the input and the process input cannot be matched");
//                    }
//                }

                }
                break;

                case "ParallelContext": {
                    ts.setRule("T-Par");
                    System.out.println("Rule: T-Par");
                    List<String> processNames = ((sessionPiParser.ParallelContext)c).process().stream().map(elem ->
                            ((sessionPiParser.SequentialProcessContext)elem).CAPS().getText()).collect(Collectors.toList());
                    ts.setText(processNames.get(0)+" | "+processNames.get(1));
                    ts = setAllTypingContext(processNames.get(0), ts);
                    ts = setAllTypingContext(processNames.get(1), ts);
                    p.ts.add(ts);
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
                    ts.setRule("T-Out");
                    ts.setText("Send in" + name);
                    Communication comm = new Communication();
                    boolean res = true;
                    StringBuilder str = new StringBuilder("");
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
                        str.append("Unrecognised channel").append("::");
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
                        error = false;
                        String t = m.getReceivedType();
                        if (m.isAdd()) {
                            System.out.println("Error: " + sendType.getTypeString() + " expected. Got " + "!" + t);
                            str.append("Error: " + sendType.getTypeString() + " expected. Got " + "!" + t).append("::");
                        }
                        else {
                            System.out.println("Error: " + sendType.getTypeString() + " expected. Got " + t);
                            str.append("Error: " + sendType.getTypeString() + " expected. Got " + t).append("::");
                        }

                    }
                    if (red) {
                        /* For Reduction */
                        comm = m.getComm();
                        comm.type = Types.SEND;
                        p.addCommunicationNode(comm);
                        /* */
                    }
                    ts = setAllTypingContext(name, ts);
                    ts.setErrorMessage(str.toString());
                    p.ts.add(ts);
                }
                break;

                case "ReceiveProcessContext": {
                    ts.setRule("T-In");
                    ts.setText("Receive in" + name);
                    StringBuilder str = new StringBuilder("");
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
                        str.append("Unrecognised channel").append("::");
                    } else {
                        /* Validating if channel type is send type */
                        if (!(receiveType.getType().equals(Types.RECEIVE))) {
                            res = false;
                        }

                        /* Validating the parameter */
                        Message m = checkBaseType(receiveType, r.payload(), typingContext, comm);
                        if (!m.isRes())
                            res = false;

                        if (!res) {
                            error = false;
                            String t = m.getReceivedType();
                            if (m.isAdd()) {
                                System.out.println("Error: " + receiveType.getTypeString() + " expected. Got " + "?" + t);
                                str.append("Error: " + receiveType.getTypeString() + " expected. Got " + "?" + t);
                            }
                            else {
                                System.out.println("Error: " + receiveType.getTypeString() + " expected. Got " + t);
                                str.append("Error: " + receiveType.getTypeString() + " expected. Got " + t);
                            }

                        }
                        if (red) {
                            /* Reduction */
                            comm = m.getComm();
                            comm.type = Types.RECEIVE;
                            p.addCommunicationNode(comm);
                            /* */
                        }
                    }
                    ts = setAllTypingContext(name, ts);
                    ts.setErrorMessage(str.toString());
                    p.ts.add(ts);                }
                break;

                case "SelectProcessContext": {
                    ts.setRule("T-Sel");
                    ts.setText("Select in" + name);
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
                        errorMessage.append("Unrecognised channel::");
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
                        errorMessage.append("Wrong Label " + label + " selected");
                    }
                    if (!res) {
                        error = false;
                        System.out.println(errorMessage);
                        ts.setErrorMessage(errorMessage.toString());
                    }

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
                    ts.addTypingContext(processVariableMap.get(name).get(0), stringSessionType(name));
                    p.ts.add(ts);
                }
                break;

                case "BranchProcessContext": {
                    ts.setRule("T-Branch");
                    ts.setText("Branch in" + name);
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
                    if (res == false) {
                        error = false;
                        ts.setErrorMessage(errorMessage.toString());
                        System.out.println(errorMessage);
                    }
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
                    ts.addTypingContext(processVariableMap.get(name).get(0), stringSessionType(name));
                    p.ts.add(ts);
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
            if (!error) {
                error = true;
                throw new Exception("Type Error");
            }

            if (p.currentScopeNode.getProcessNodeList().size() == 2 && p.currentScopeNode.isRoot() == false)
                p.currentScopeNode = p.currentScopeNode.getParentProcessNode().getParentScopeNode();

            return p;

    }

    private static TypingStep setAllTypingContext(String s, TypingStep ts) {
        ts.addTypingContext(processVariableMap.get(s).get(0), stringSessionType(s));
        Map<String, String> variables = allTypingContexts.get(s);
        for (String k: variables.keySet()) {
            ts.addTypingContext(k, variables.get(k));
        }
        return ts;
    }

    private static boolean isDual(List<BasicType> type1, List<BasicType> type2) {
        boolean flag = true;
        if (type1.size() != type2.size())
            return false;
        else {
            for (int i = 0; i < type1.size(); i++) {
                if (!(getDual(type1.get(i).getType()) == type2.get(i).getType())) {
                    flag = false;
                    break;
                }
                if (Arrays.asList(Types.SELECT, Types.BRANCH).contains(type1.get(i).getType())) {
                    CompositeType ct1 = ((CompositeType) (type1.get(i)));
                    CompositeType ct2 = ((CompositeType) (type2.get(i)));
                    if (ct1.getComplexPart().size() != ct2.getComplexPart().size())
                        return false;
                    for (String label : ct1.getComplexPart().keySet()) {
                        if (!ct2.getComplexPart().keySet().contains(label))
                            return false;
                        else {
                            if (!isDual(ct1.getComplexPart().get(label), ct2.getComplexPart().get(label)))
                                return false;
                        }
                    }
                }
                else{
                   if(! type1.get(i).typeString.substring(1).equals(type2.get(i).typeString.substring(1)))
                       return false;
                }


            }
        }
        return flag;
    }

    private static Types getDual(Types type) {
        Types t = null;
        switch (type) {
            case END:
                t = Types.END;
                break;

            case SEND:
                t = Types.RECEIVE;
                break;

            case BRANCH:
                t = Types.SELECT;
                break;

            case RECEIVE:
                t = Types.SEND;
                break;

            case SELECT:
                t = Types.BRANCH;
                break;
        }
        return t;

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
            System.out.println("Channel not identified");
        return false;
    }

}

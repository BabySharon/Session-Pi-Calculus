package com.sharon.sessionPiCalculus.antlr;

import com.sharon.sessionPiCalculus.dao.*;
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

public class Utils {
    public static Map<String, Map<String, String>> allTypingContexts = new HashMap<>();
    public static Map<String, List<BasicType>> allSessionTypes = new HashMap<>();
    public static Map<String, String> processVariableMap = new HashMap<>();


    public static ParseTree createVisitor(String input, InputDao inputDao, String name) throws Exception {
        ANTLRInputStream inputStream = new ANTLRInputStream(input);
        sessionPiLexer lexer = new sessionPiLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        sessionPiParser parser = new sessionPiParser(tokens);
        ParseTree tree = parser.process();
        System.out.println("-----------------Typing Rules-----------------");
        allTypingContexts = inputDao.getAllTypingContexts();
        allSessionTypes = inputDao.getAllSessionTypes();
        typeCheckManager(tree, null);
        return tree;
    }

    public static String getStringFromSet(Collection<String> values) {
        StringBuilder s = new StringBuilder("");
        for (String str : values) {
            s.append(" " + str);
        }
        return String.valueOf(s);
    }

    public static void typeCheckManager(ParseTree c, String name) throws
            Exception {
        switch (c.toString()) {
            case "ScopeSessionLabelContext": {
                sessionPiParser.ScopeSessionLabelContext sslc = ((sessionPiParser.ScopeSessionLabelContext)c);
                List<String> coVariables = sslc.scopeSession().VAR().stream().map(s -> s.getText())
                        .collect(Collectors.toList());
                List<String> processes = ((sessionPiParser.ParallelContext)sslc.process()).process().stream()
                        .map(spc -> ((sessionPiParser.SequentialProcessContext)spc).CAPS().getText())
                                .collect(Collectors.toList());
                if(coVariables.size() == processes.size())
                {
                    for (int i = 0; i < processes.size(); i++) {
                        processVariableMap.put(processes.get(i), coVariables.get(i));
                    }
                }
                else
                    System.out.println("Error in defining session variables");
                iterateChildren(c, null);
            }
            break;

            case "ScopeSessionContext": {
                System.out.println("Rule: RuleT-Res");
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
                iterateChildren(c, null);
            }

            case "SequentialProcessContext": {
                String processName = ((sessionPiParser.SequentialProcessContext) c).CAPS().getText();
                iterateChildren(c, processName);
            }
            break;

            case "SendProcessContext": {
                boolean res = true;
                BasicType sendType = null;
                sessionPiParser.SendContext s = ((sessionPiParser.SendProcessContext) c).send();
                Map<String, String> typingContext = allTypingContexts.get(name);
                List<BasicType> sessionType = allSessionTypes.get(name);
                System.out.println("Rule: T-Out   Process: " + name);
                if(!sessionType.isEmpty()) {
                    sendType = sessionType.remove(0);
                }
                if(checkChannel(name, s.VAR()) == false) {
                    res = false;
                    System.out.println("Unrecognised channel");
                }
                /* Validating if channel type is send type */
                if (!(sendType.getType().equals(Types.SEND))) {
                    res = false;
                }
                /* Validating the parameter */
                Message m = checkBaseType(sendType, s.payload(), typingContext);
                if (!m.isRes())
                    res = false;

                if (!res) {
                    String t = m.getReceivedType();
                    if(m.isAdd())
                        System.out.println("Error: " + sendType.getTypeString() + " expected. Got "+ "!"+t);
                    else
                        System.out.println("Error: " + sendType.getTypeString() + " expected. Got "+t);

                }
            }
            break;

            case "ReceiveProcessContext": {
                boolean res = true;
                BasicType receiveType = null;
                sessionPiParser.ReceiveContext r = ((sessionPiParser.ReceiveProcessContext) c).receive();
                Map<String, String> typingContext = allTypingContexts.get(name);
                List<BasicType> sessionType = allSessionTypes.get(name);
                System.out.println("Rule: T-In \t  Process: " + name);
                if(!sessionType.isEmpty()) {
                    receiveType = sessionType.remove(0);
                }
                if(checkChannel(name, r.VAR()) == false) {
                    res = false;
                    System.out.println("Unrecognised channel");
                }
                /* Validating if channel type is send type */
                if (!(receiveType.getType().equals(Types.RECEIVE))) {
                    res = false;
                }

                /* Validating the parameter */
                Message m = checkBaseType(receiveType, r.payload(), typingContext);
                if (!m.isRes())
                    res = false;

                if (!res) {
                    String t = m.getReceivedType();
                    if(m.isAdd())
                        System.out.println("Error: " + receiveType.getTypeString() + " expected. Got "+ "?"+t);
                    else
                        System.out.println("Error: " + receiveType.getTypeString() + " expected. Got "+t);

                }

            }
            break;

            case "SelectProcessContext":{
                BasicType st = null;
                System.out.println("Rule: T-Select \t  Process: " + name);
                sessionPiParser.SelectProcessContext spc = (sessionPiParser.SelectProcessContext) c;
                boolean res = true;
                StringBuilder errorMessage = new StringBuilder("");
                List<BasicType> sessionType = allSessionTypes.get(name);
                st = sessionType.remove(0);
                Map<String, List<BasicType>> selectMap = ((CompositeType)st).getSelect();
                if(checkChannel(name, spc.VAR()) == false) {
                    res = false;
                    errorMessage.append("Unrecognised channel");
                }
                /*
                * 1. Check if select type
                * 2. Label present? */
                if(!(st.getType().equals(Types.SELECT))) {
                    res = false;
                    errorMessage.append(spc.VAR().getText()+" not of select type.\n");
                }
                String label = spc.IDENTIFIER().getText();
                if(!(selectMap.keySet().contains(label))){
                    res = false;
                    errorMessage.append("Label "+ label+" selected");
                }
                allSessionTypes.put(name, selectMap.get(label));
                typeCheckManager(spc.process(), name);
                allSessionTypes.put(name, sessionType);

            }
            break;

            case "BranchProcessContext": {
                BasicType bt = null;
                System.out.println("Rule: T-Branch \t  Process: " + name);
                boolean res = true;
                sessionPiParser.BranchProcessContext bpc = (sessionPiParser.BranchProcessContext) c;
                StringBuilder errorMessage = new StringBuilder("");
                if(checkChannel(name, bpc.VAR()) == false) {
                    res = false;
                    errorMessage.append("Unrecognised channel");
                }
                List<sessionPiParser.BranchContext> bc = new ArrayList<>();
                int labelCount = 0;
                List<BasicType> sessionType = allSessionTypes.get(name);
                bt = sessionType.remove(0);
                Map<String, List<BasicType>> branchMap = ((CompositeType)bt).getBranch();
                /* Validate
                * 1. If the type is branch
                * 2. If the number of branches match
                * 3. Check if the labels match */ //TODO in front end restrict only the specified labels in the output or generate the branch
                if(!(bt.getType().equals(Types.BRANCH))) {
                    res = false;
                    errorMessage.append(bpc.VAR().getText()+" not of branch type.\n");
                }
                labelCount = bpc.branch().size();
               int labelCountType =  branchMap.keySet().size();
                if(labelCountType != labelCount) {
                    res = false;
                    errorMessage.append(bpc.VAR().getText()+" has wrong label count");
                }
                bc = bpc.branch();
                if(res == false)
                    System.out.println(errorMessage);
                for (sessionPiParser.BranchContext p: bc) {
                    if(!sessionType.isEmpty()){
                        allSessionTypes.put(name, branchMap.get(p.IDENTIFIER().getText()));
                        iterateChildren(p, name);
                    }
                }
                allSessionTypes.put(name, sessionType);
            }
            break;
        }
    }

    private static Message checkBaseType(BasicType type, sessionPiParser.PayloadContext payload, Map<String, String> typingContext) {
        boolean res = true;
        Message mssg = new Message();
        switch (payload.getClass().getName().split("\\$")[1]) {
            case "ExprPayloadContext": {
                /* Single exp context can be bool or INT */
                String t = null;
                List<ParseTree> exprContexts = ((sessionPiParser.ExprPayloadContext) payload).expr().children;
                if (exprContexts.size() == 1) {
                    if (!exprContexts.get(0).toString().equals("BoolContext{}"))
                        t = "Int";
                    else
                        t = "Bool";
                    if (!t.equalsIgnoreCase(type.getTypeString().substring(1)))
                        res = false;
                }
                mssg.setReceivedType(t);
                mssg.setRes(res);
                mssg.setAdd(true);
            }
            break;

            case "VarPayloadContext": {
                String t = typingContext.get(((sessionPiParser.VarPayloadContext) payload).VAR().getText());
                if (t == null) {
                    System.out.println("Provide type for " + ((sessionPiParser.VarPayloadContext) payload).VAR().getText()
                            + " in the input");
                }
                if (!t.equalsIgnoreCase(type.getTypeString().substring(1)))
                    res = false;
                mssg.setRes(res);
                mssg.setReceivedType(t);
                mssg.setAdd(false);
            }
        }
        return mssg;
    }

    private static void iterateChildren(ParseTree c, String name) throws Exception {
        int childCount = c.getChildCount();
        int i = 0;
        while (i < childCount) {
            typeCheckManager(c.getChild(i), name);
            i++;
        }
    }

    private static boolean checkChannel(String name, TerminalNode node){
        if(processVariableMap.containsKey(name))
            return processVariableMap.get(name).equals(node.getText());
        else
            System.out.println("Invalid process name");
        return false;
    }
}

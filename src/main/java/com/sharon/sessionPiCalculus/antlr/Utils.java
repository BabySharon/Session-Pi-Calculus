package com.sharon.sessionPiCalculus.antlr;

import com.sharon.sessionPiCalculus.dao.Message;
import com.sharon.sessionPiCalculus.dao.InputDao;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
//TODO Check duality - in front-end
// TODO ONLY single parameter in send and receive - no expressions
//TODO Type to token code mapping
//TODO add exceptions and handle them, if process names are not found in map
//TODO parse tree construction error
 // TODO Validate types in the typing contexts
// TODO replicate, doargs ?

public class Utils {
    public static Map<String, Map<String, String>> allTypingContexts = new HashMap<>();
    public static Map<String, List<String>> allSessionTypes = new HashMap<>();


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
                iterateChildren(c, null);
            }
            break;

            case "ScopeSessionContext": {
//                System.out.println("Rule: T-Res");
//                List<TerminalNode> coVariables = ((sessionPiParser.ScopeSessionContext) c).VAR();
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
                String sendType = "";
                sessionPiParser.SendContext s = ((sessionPiParser.SendProcessContext) c).send();
                Map<String, String> typingContext = allTypingContexts.get(name);
                List<String> sessionType = allSessionTypes.get(name);
                System.out.println("Rule: T-Out   Process: " + name);
                if(!sessionType.isEmpty()) {
                    sendType = sessionType.remove(0);
                }
                /* Validating if channel type is send type */
                if (!(sendType.charAt(0) == '!')) {
                    res = false;
                }
                /* Validating the parameter */
                Message m = checkBaseType(sendType, s.payload(), typingContext);
                if (!m.isRes())
                    res = false;

                if (!res) {
                    String t = m.getReceivedType();
                    if(m.isAdd())
                        System.out.println("Error: " + sendType + " expected. Got "+ "!"+t);
                    else
                        System.out.println("Error: " + sendType + " expected. Got "+t);

                }
            }
            break;

            case "ReceiveProcessContext": {
                boolean res = true;
                String receiveType = ";";
                sessionPiParser.ReceiveContext r = ((sessionPiParser.ReceiveProcessContext) c).receive();
                Map<String, String> typingContext = allTypingContexts.get(name);
                List<String> sessionType = allSessionTypes.get(name);
                System.out.println("Rule: T-In \t  Process: " + name);
                if(!sessionType.isEmpty()) {
                    receiveType = sessionType.remove(0);
                }
                /* Validating if channel type is send type */
                if (!(receiveType.charAt(0) == '?')) {
                    res = false;
                }

                /* Validating the parameter */
                Message m = checkBaseType(receiveType, r.payload(), typingContext);
                if (!m.isRes())
                    res = false;

                if (!res) {
                    String t = m.getReceivedType();
                    if(m.isAdd())
                        System.out.println("Error: " + receiveType + " expected. Got "+ "?"+t);
                    else
                        System.out.println("Error: " + receiveType + " expected. Got "+t);

                }

            }
            break;

            case "BranchProcessContext": {
                boolean res = true;
                int childCount= ((sessionPiParser.BranchProcessContext) c).getChildCount();
                List<String> sessionType = allSessionTypes.get(name);
                /* Validate
                * 1. If the type is branch
                * 2. If the number of branches match
                * 3. Check if the labels match */
                if(!(sessionType.get(0).charAt(0) == '&'))
                    res = false;
                for (int i = 0; i < childCount; i++) {
                    ((sessionPiParser.BranchProcessContext) c).getChild(i).toString()
                }

            }
            break;
        }
    }

    private static Message checkBaseType(String type, sessionPiParser.PayloadContext payload, Map<String, String> typingContext) {
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
                    if (!t.equalsIgnoreCase(type.substring(1)))
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
                if (!t.equalsIgnoreCase(type.substring(1)))
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
}

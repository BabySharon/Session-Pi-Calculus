package com.sharon.sessionPiCalculus.antlr;

import com.sharon.sessionPiCalculus.dao.InputDao;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// TODO How to send errors to frontend
// TODO Why the visitors are executed twice
public class TreeVisitor extends sessionPiBaseVisitor<Map<String, Map<String, String>>> {
    private Map<String, Map<String, String>> allTypingContexts;

    public TreeVisitor(Map<String, Map<String, String>> allTypingContexts) {
        this.allTypingContexts = allTypingContexts;
    }

    /* Assumption - scope session rules will always be the top of the parse tree for session pi processes
             So typing contexts are initialised/get from here */
    @Override
    public Map<String, Map<String, String>> visitScopeSessionLabel(sessionPiParser.ScopeSessionLabelContext ctx) {
        visit(ctx.process());
        return new HashMap<>();
    }

    @Override
    public Map<String, Map<String, String>> visitSequentialProcess(sessionPiParser.SequentialProcessContext ctx) {
        System.out.println("inside");
        return super.visitSequentialProcess(ctx);
    }

    @Override
    public Map<String, Map<String, String>> visitScopeSession(sessionPiParser.ScopeSessionContext ctx) throws Exception {
        System.out.println("howw");
        // To check if the covariables in input text are present in the input variables list or global typing context
        List<TerminalNode> coVariables = ctx.VAR();
        for (TerminalNode node : coVariables) {
            if (!InputDao.sessionVariableObjects.keySet().contains(node.getText())) {
                throw new Exception("Covariables in the input and the process input cannot be matched");
            }
        }

        // To check the duality - Only two co variables assumed
//        if(!(Utils.checkDuality(InputDao.sessionVariableObjects)))
//            System.out.println("Non dual types: "+ Utils.getStringFromSet(InputDao.sessionVariableObjects.values()));
        return super.visitScopeSession(ctx);
    }


}


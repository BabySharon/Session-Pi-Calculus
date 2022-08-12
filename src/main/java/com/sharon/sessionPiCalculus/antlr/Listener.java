package com.sharon.sessionPiCalculus.antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Listener extends sessionPiBaseListener {

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
//        Utils.parseHistory.add(ctx);
    }
}

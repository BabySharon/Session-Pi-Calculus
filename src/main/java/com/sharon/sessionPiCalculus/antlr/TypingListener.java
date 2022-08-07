package com.sharon.sessionPiCalculus.antlr;

import com.sharon.sessionPiCalculus.DropwizardApplication;

import java.util.Map;

public class TypingListener extends sessionPiBaseListener{
    sessionPiParser parser;
    private Map<String, String> typingContext = DropwizardApplication.tc1;
    private Map<String, String> sessionType = DropwizardApplication.sessionType;

    public TypingListener(sessionPiParser parser) {
        this.parser = parser;
    }

    @Override
    public void enterScopeSessionLabel(sessionPiParser.ScopeSessionLabelContext ctx) {
        super.enterScopeSessionLabel(ctx);
    }

    @Override
    public void enterScopeSession(sessionPiParser.ScopeSessionContext ctx) {
        super.enterScopeSession(ctx);
//        typeChecking(typingContext, ctx.CHANNEL());

    }

//    public static Map typeChecking(Map<String, String> tContext, )
}

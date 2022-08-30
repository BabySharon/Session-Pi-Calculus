package com.sharon.sessionPiCalculus.typing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypingStep {
    Map<String, String> typingContexts = new HashMap<>();
    String text;
    Map<String, TypingStep> children = new HashMap<>();
    String rule;
    public TypingStep child;

    public TypingStep getChild() {
        return child;
    }

    String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setTypingContexts(Map<String, String> typingContexts) {
        this.typingContexts = typingContexts;
    }

    public void addTypingContext(String k, String v){
        typingContexts.put(k, v);

    }

    public void setText(String text) {
        this.text = text;
    }


    public void setRule(String rule) {
        this.rule = rule;
    }

    public Map<String, String> getTypingContexts() {
        return typingContexts;
    }

    public String getText() {
        return text;
    }

    public Map<String, TypingStep> getChildren() {
        return children;
    }

    public String getRule() {
        return rule;
    }

    public void addStep(String name, TypingStep ts){
        children.put(name, ts);
    }
}

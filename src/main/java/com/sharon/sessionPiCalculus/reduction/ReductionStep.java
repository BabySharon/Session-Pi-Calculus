package com.sharon.sessionPiCalculus.reduction;

import java.util.List;

public class ReductionStep {
    private List<String> judgements;
    private SemanticsRule redRule;
    private SemanticsRule ruleDescription;
    private String result;
    public String inputString;

    public ReductionStep(List<String> judgements, SemanticsRule redRule, SemanticsRule ruleDescription, String result) {
        this.judgements = judgements;
        this.redRule = redRule;
        this.ruleDescription = ruleDescription;
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public List<String> getJudgements() {
        return judgements;
    }

    public SemanticsRule getRedRule() {
        return redRule;
    }

    public void setJudgements(List<String> judgements) {
        this.judgements = judgements;
    }

    public SemanticsRule getRuleDescription() {
        return ruleDescription;
    }
}

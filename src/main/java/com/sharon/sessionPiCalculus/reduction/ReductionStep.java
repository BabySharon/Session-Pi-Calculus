package com.sharon.sessionPiCalculus.reduction;

import java.util.List;

public class ReductionStep {
    private List<String> judgements;
    private SemanticsRule redRule;
    private SemanticsRule ruleDescription;
    private String result;

    public ReductionStep(List<String> judgements, SemanticsRule redRule, SemanticsRule ruleDescription, String result) {
        this.judgements = judgements;
        this.redRule = redRule;
        this.ruleDescription = ruleDescription;
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}

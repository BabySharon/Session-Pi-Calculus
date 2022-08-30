package com.sharon.sessionPiCalculus;

import com.sharon.sessionPiCalculus.reduction.ReductionStep;
import com.sharon.sessionPiCalculus.typing.TypingStep;

import java.util.List;

public class Wrapper {
    public List<ReductionStep> steps;
    public List<TypingStep> ts;

    public List<ReductionStep> getSteps() {
        return steps;
    }

    public List<TypingStep> getTs() {
        return ts;
    }
}

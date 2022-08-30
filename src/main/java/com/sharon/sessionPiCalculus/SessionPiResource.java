package com.sharon.sessionPiCalculus;

import com.sharon.sessionPiCalculus.reduction.ReductionStep;
import com.sharon.sessionPiCalculus.typing.antlr.Utils;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/type-check")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SessionPiResource {

    @POST
    public Wrapper postInputTypeCheck(InputDao input, @QueryParam("red")boolean red) {
        Wrapper result = null;
        try {
            System.out.println(input.getInput());
            System.out.println(input.getProcessList().get(0).getName());
//            System.out.println(input.getInput());
//            System.out.println(input.getProcessList().get(0).getTypingContextList().get("y"));
//            InputDao.sessionVariableObjects = input.getSessionVariables();
            result = Utils.createVisitor(input.getInput(), input, null, red);
            for (ReductionStep step : result.getSteps()) {
                System.out.println(step.getResult());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    }

//TODO Give proper response object
package com.sharon.sessionPiCalculus;

import com.sharon.sessionPiCalculus.reduction.ReductionStep;
import com.sharon.sessionPiCalculus.typing.antlr.Utils;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/type-check")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SessionPiResource {

    @POST
    public String postInputTypeCheck(InputDao input, @QueryParam("red")boolean red) {
        List<ReductionStep> tree = null;
        try {
            System.out.println(input.getInput());
            System.out.println(input.getProcessList().get(0).getName());
//            System.out.println(input.getInput());
//            System.out.println(input.getProcessList().get(0).getTypingContextList().get("y"));
//            InputDao.sessionVariableObjects = input.getSessionVariables();
            tree = Utils.createVisitor(input.getInput(), input, null, red);
            for (ReductionStep step : tree) {
                System.out.println(step.getResult());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "tree";
    }

    }

//TODO Give proper response object
package com.sharon.sessionPiCalculus;

import com.sharon.sessionPiCalculus.typing.antlr.Utils;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/type-check")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SessionPiResource {

    @POST
    public String postInputTypeCheck(InputDao input, @QueryParam("red")boolean red){
        try {
            System.out.println(input.getInput());
            System.out.println(input.getProcessList().get(0).getName());
//            System.out.println(input.getInput());
//            System.out.println(input.getProcessList().get(0).getTypingContextList().get("y"));
//            InputDao.sessionVariableObjects = input.getSessionVariables();
            ParseTree tree = Utils.createVisitor(input.getInput(), input, null, red);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "success";
    }

}

//TODO Give proper response object
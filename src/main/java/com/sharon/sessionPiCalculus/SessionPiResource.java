package com.sharon.sessionPiCalculus;

import com.sharon.sessionPiCalculus.antlr.Utils;
import com.sharon.sessionPiCalculus.dao.InputDao;
import com.sharon.sessionPiCalculus.dao.ProcessDao;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//TODO  catch token recognition error

@Path("/type-check")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SessionPiResource {

    @POST
    public String postInputTypeCheck(InputDao input){
        try {
//            System.out.println(input.getInput());
//            System.out.println(input.getProcessList().get(0).getTypingContextList().get("y"));
            InputDao.sessionVariableObjects = input.getSessionVariables();
            ParseTree tree = Utils.createVisitor(input.getInput(), input, null);

        }
        catch (Exception e){
            return e.getLocalizedMessage();
        }
        return "success";
    }

}

//TODO Give proper response object
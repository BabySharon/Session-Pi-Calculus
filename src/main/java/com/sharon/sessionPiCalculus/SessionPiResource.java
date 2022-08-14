package com.sharon.sessionPiCalculus;

import com.sharon.sessionPiCalculus.dao.InputDao;
import com.sharon.sessionPiCalculus.dao.ProcessDao;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/type-check")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SessionPiResource {

    @POST
    public String postInputTypeCheck(InputDao input){
        try {
            System.out.println(input.getInput());
            System.out.println(input.getProcessList().get(0).getName());
            System.out.println(input.getProcessList().get(0).getTypingContext().getType());
        }
        catch (Exception e){

        }
        return "success";
    }

}

//TODO Give proper response object
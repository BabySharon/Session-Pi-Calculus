package com.sharon.sessionPiCalculus;

import com.sharon.sessionPiCalculus.antlr.*;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.util.*;

//TODO visiting twice why
public class DropwizardApplication extends Application<AppConfiguration> {
    public static Map<String, String> tc1 = new HashMap();
    public static Map<String, String> tc2 = new HashMap();


    public static void main(String[] args) throws Exception {
        new DropwizardApplication().run(args);
//        File file = new File("/home/sharon/Glasgow/project/Session-Pi-Calculus/src/main/java/com/sharon/sessionPiCalculus/input.txt");
//        Scanner sc = new Scanner(file);
//        String data = sc.nextLine();
//        tc1.put("x","!Int.end");
//        tc2.put("y","?Int.end");
//        tc2.put("a","Int");


    }

    @Override
    public void run(AppConfiguration appConfiguration, Environment environment) throws Exception {
        final SessionPiResource resource = new SessionPiResource();
        environment.jersey().register(resource);
    }


}
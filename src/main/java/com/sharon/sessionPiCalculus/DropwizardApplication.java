package com.sharon.sessionPiCalculus;

import com.sharon.sessionPiCalculus.antlr.*;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.util.*;

public class DropwizardApplication extends Application<AppConfiguration> {
    public static Map<String, String> tc1 = new HashMap();
    public static Map<String, String> sessionType = new HashMap<>();


    public static void main(String[] args) throws Exception {
//        new DropwizardApplication().run(args);
        File file = new File("/home/sharon/Glasgow/project/Session-Pi-Calculus/src/main/java/com/sharon/sessionPiCalculus/input.txt");
        Scanner sc = new Scanner(file);
        String data = sc.nextLine();
        tc1.put("x","!Int.end");
        tc1.put("y","?Int.end");
        tc1.put("a","Int");
        Map<String, String> tc2 = new HashMap();
        sessionType.put("x","!Int.end");
        ANTLRInputStream inputStream = new ANTLRInputStream(data);
        sessionPiLexer lexer = new sessionPiLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        sessionPiParser parser = new sessionPiParser(tokens);
        ParseTree tree = parser.process();
        ParseTreeWalker walker = new ParseTreeWalker();
        TypingListener extractor = new TypingListener(parser);
        walker.walk(extractor, tree);
    }

    @Override
    public void run(AppConfiguration appConfiguration, Environment environment) throws Exception {

    }
}
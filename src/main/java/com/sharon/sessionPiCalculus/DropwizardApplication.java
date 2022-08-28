package com.sharon.sessionPiCalculus;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

import java.util.*;

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
//        ANTLRInputStream inputStream = new ANTLRInputStream(data);
//        sessionPiLexer lexer = new sessionPiLexer(inputStream);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        sessionPiParser parser = new sessionPiParser(tokens);
//        ParseTree tree = parser.process();
//        ParseTreeWalker walker = new ParseTreeWalker();
//        TypingListener extractor = new TypingListener(parser);
//        walker.walk(extractor, tree);
    }

    @Override
    public void run(AppConfiguration appConfiguration, Environment environment) throws Exception {
        final SessionPiResource resource = new SessionPiResource();
        environment.jersey().register(resource);
        Cors.insecure(environment);
    }
}
package com.sharon.sessionPiCalculus;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class DropwizardApplication extends Application<AppConfiguration> {

    public static void main(String[] args) throws Exception {
        new DropwizardApplication().run(args);
    }
    @Override
    public void run(AppConfiguration appConfiguration, Environment environment) throws Exception {

    }
}

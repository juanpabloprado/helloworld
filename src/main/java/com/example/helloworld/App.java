package com.example.helloworld;

import com.example.helloworld.resources.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Hello world!
 *
 */
public class App extends Application<Configuration>
{
    public static void main( String[] args ) throws Exception {
        new App().run(args);
    }

    @Override
    public void initialize(Bootstrap<Configuration> configurationBootstrap) {

    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        final HelloWorldResource resource = new HelloWorldResource();
        environment.jersey().register(resource);
    }
}

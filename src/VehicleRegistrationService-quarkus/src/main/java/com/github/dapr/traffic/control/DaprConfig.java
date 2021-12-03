package com.github.dapr.traffic.control;

import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;
import io.quarkus.arc.DefaultBean;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

@Dependent
public class DaprConfig {

    // This class will be called at boot time

    private static final DaprClientBuilder BUILDER = new DaprClientBuilder();

    @Produces
    @DefaultBean
    public DaprClient buildDaprClient(){
        final DaprClient build = BUILDER.build();
        return build;
    }
}

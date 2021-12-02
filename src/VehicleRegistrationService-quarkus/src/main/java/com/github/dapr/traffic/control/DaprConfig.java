package com.github.dapr.traffic.control;

import io.dapr.client.DaprClient;
import io.dapr.client.DaprClientBuilder;
import io.quarkus.runtime.Startup;
import javax.enterprise.context.ApplicationScoped;

@Startup
@ApplicationScoped
public class DaprConfig {

    private static final DaprClientBuilder BUILDER = new DaprClientBuilder();

    public DaprClient buildDaprClient(){
        final DaprClient build = BUILDER.build();
        return build;
    }
}

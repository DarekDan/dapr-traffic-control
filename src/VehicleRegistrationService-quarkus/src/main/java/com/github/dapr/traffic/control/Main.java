package com.github.dapr.traffic.control;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {

    public static void main(String ... args){
        Quarkus.run(VehicleRegistrationServiceApp.class, args);
    }

    public static class VehicleRegistrationServiceApp implements QuarkusApplication{

        @Override
        public int run(String... args) throws Exception {
            Quarkus.waitForExit();
            return 0;
        }
    }
}

package com.robsonp.restjse.api;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

public class Services extends Application {

    private static Set services = new HashSet();

    public Services() {
        // initialize restful services   
        services.add(new GreetingResource());
    }

    @Override
    public Set getSingletons() {
        return services;
    }

    public static Set getServices() {
        return services;
    }
}

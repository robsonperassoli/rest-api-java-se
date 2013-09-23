package com.robsonp.restjse.api;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class Greeting {

    private String name;
    private String greeting;

    public Greeting() {
    }

    public Greeting(String name, String greeting) {
        this.name = name;
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    
}

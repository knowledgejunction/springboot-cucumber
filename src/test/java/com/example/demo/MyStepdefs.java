package com.example.demo;

import cucumber.api.java8.En;

public class MyStepdefs extends AbstractDefs implements En {
    public MyStepdefs() {

        Then("^the client receives status code of (\\d+)$", (Integer arg0) -> {
            System.out.println("In mock"+mockMvc);
            
        });
        And("^the client receives server version poop$", () -> {
        	 System.out.println("In And");
        });
        
        When("^the client calls /poop$", () -> {
        	 System.out.println("In When");
        });
    }
}

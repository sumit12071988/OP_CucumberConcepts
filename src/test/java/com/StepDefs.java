package com;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {
    @Given("I'm in Page #{int}")
    public void i_m_in_page(Integer pageNo) {
        System.out.println("I'm in Page #: "+pageNo);
    }
    @When("I perform Action #{int}")
    public void i_perform_action(Integer actionNo) {
        System.out.println("I perform Action #: "+actionNo);
    }
    @Then("I get Output #{int}")
    public void i_get_output(Integer outputNo) {
        System.out.println("I get Output #: "+outputNo);
    }

    @Given("I'm dummy")
    public void iMDummy() {
        
    }

    @When("I do dummy things")
    public void iDoDummyThings() {
        
    }

    @Then("dummy things happen")
    public void dummyThingsHappen() {
    }
}

package basics.hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class CucumberHooks {
    // @BeforeAll ==> Runs before ANY Scenarios/ Class files are executed
    @BeforeAll
    public static void beforeAll() {
        System.out.println("---- BEFORE ALL INVOKED -----");
    }

    // @AfterAll ==> Runs after ALL Scenarios/ Class files are executed
    @AfterAll
    public static void afterAll() {
        System.out.println("---- AFTER ALL INVOKED -----");
    }
}

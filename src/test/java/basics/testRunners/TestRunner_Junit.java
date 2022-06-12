package basics.testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


/**
 * NOTE: Comment out JUnit TestRunner when running TestNG TestRunner and vice versa
 */
@RunWith(Cucumber.class)
@CucumberOptions(
                    features    = "src/test/resources/features",                   // Used to specify Folder path in which feature files resides
                    glue        = {"basics.stepDefinitions", "basics.hooks"},      // Used to specify Step Definitions & Hooks Folder path (after src/test/java or src/test/resources etc..) where those resides
                    plugin      = {
                                    "pretty",                                      // Generates the Scenario info in Console along with the location of Step Definitions
                                    "html:target/cucumber.html",                   // Generates an HTML report with all Scenarios
                                    "summary"                                      // Used as prerequisite in order to use Cucumber Option "snippets"
                                    },
                    snippets    = CAMELCASE,                                      // Used to specify the format in which the undefined methods will be auto generated. Options: CAMELCASE, UNDERSCORE
                    dryRun      = false,                                           // Used to check Feature files with missing Step Definitions without executing Step Definitions
                    monochrome  = false,                                            // If set as true, it is used to display Console O/p in Black-N-White
                    tags        = "@Feature1"                                      // Executes scenarios with @scenario1 tag
//                    tags        = "not @scenario1"                                  // Executes all scenarios EXCEPT the one with @scenario1 tag
//                    tags        = "@scenario1 or @scenario2"                        // Executes all those scenarios who have either @scenario1 OR @scenario2 tag
//                    tags        = "@scenario1 and @scenario2"                       // Executes all those scenarios who have BOTH @scenario1 AND @scenario2 tag
//                    tags        = "@scenario1 and not @scenario2"                   // Executes all those scenarios who have only @scenario1 AND NO @scenario2 tag
)
// Note: Cucumber options passed in Command line mode will ALWAYS OVERRIDE the Cucumber options in TestRunner file

public class TestRunner_Junit {

    //    @BeforeClass in JUnit   ==> Executes once BEFORE any method in current class file are executed
    @BeforeClass
    public static void setup() {                // Methods with @BeforeClass of Junit should be static
        System.out.println("---- BEFORE JUNIT CLASS INVOKED -----");
    }

    //    @AfterClass in JUnit    ==> Executes once AFTER all methods in current class file are executed
    @AfterClass
    public static void tearDown() {
        System.out.println("---- AFTER JUNIT CLASS INVOKED -----");
    }
}

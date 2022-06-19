package basics.testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static io.cucumber.testng.CucumberOptions.SnippetType.UNDERSCORE;

/**
 * NOTE: Comment out JUnit TestRunner when running TestNG TestRunner and vice versa
 */
@CucumberOptions(
                    features    = "src/test/resources/features",                   // Used to specify Folder path in which feature files resides
                    glue        = {                                                // Used to specify Step Definitions & Hooks Folder path
                                    "basics.stepDefinitions",                      //   (after src/test/java or src/test/resources etc..) where those resides
                                    "basics.hooks",
                                    "basics.customParameterTypes"
                                  },
                    plugin      = {
//                                    "pretty",                                      // Generates the Scenario info in Console along with the location of Step Definitions
                                    "html:target/cucumber.html",                   // Generates an HTML report with all Scenarios
                                    "summary"                                      // Used as prerequisite in order to use Cucumber Option "snippets"
                                  },
                    snippets    = UNDERSCORE,                                      // Used to specify the format in which the undefined methods will be auto generated. Options: CAMELCASE, UNDERSCORE
//                    dryRun      = true,                                            // Used to check Feature files with missing Step Definitions without executing Step Definitions
//                    monochrome  = true,                                            // If set as true, it is used to display Console O/p in Black-N-White
                    tags        = "@featureTag1"                               // Executes scenarios with @scenario1 tag
//                    tags        = "not @scenario1"                                 // Executes all scenarios EXCEPT the one with @scenario1 tag
//                    tags        = "@scenario1 or @scenario2"                       // Executes all those scenarios who have either @scenario1 OR @scenario2 tag
//                    tags        = "@scenario1 and @scenario2"                      // Executes all those scenarios who have BOTH @scenario1 AND @scenario2 tag
//                    tags        = "@scenario1 and not @scenario2"                  // Executes all those scenarios who have only @scenario1 AND NO @scenario2 tag
                )
// Note: Cucumber options passed in Command line mode will ALWAYS OVERRIDE the Cucumber options in TestRunner file

public class TestRunner_TestNG extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void setup() {
        System.out.println("---- @BeforeClass -----");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("---- @AfterClass -----");
    }
}

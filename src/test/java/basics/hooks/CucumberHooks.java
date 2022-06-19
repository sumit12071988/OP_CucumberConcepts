package basics.hooks;


public class CucumberHooks {

    //    // @BeforeAll ==> Runs before ANY Scenarios/ Class files are executed
//    @BeforeAll
//    public static void beforeAllB() {
//        System.out.println("---- @BeforeAll -----");
//    }
//
//    @AfterAll(order = 1)
//    public static void afterAllC() {
//        System.out.println("---- @AfterAll -----");
//    }
//
//    @Before
//    public void beforeA(Scenario scenario){
//        System.out.println("---- @Before -----");
//        System.out.println("SCENARIO NAME: "+scenario.getName());
//        System.out.println("SCENARIO LINE: "+scenario.getLine());
//        System.out.println("SCENARIO TAGS: "+scenario.getSourceTagNames());
//        System.out.println("SCENARIO STATUS: "+scenario.getStatus());
//        System.out.println("SCENARIO URI: "+scenario.getUri());
//        System.out.println("SCENARIO isFailed: "+scenario.isFailed());
//    }
//
//    @After
//    public void afterA(Scenario scenario){
//        System.out.println("---- @After -----");
//        System.out.println("SCENARIO NAME: "+scenario.getName());
//        System.out.println("SCENARIO LINE: "+scenario.getLine());
//        System.out.println("SCENARIO TAGS: "+scenario.getSourceTagNames());
//        System.out.println("SCENARIO STATUS: "+scenario.getStatus());
//        System.out.println("SCENARIO URI: "+scenario.getUri());
//        System.out.println("SCENARIO isFailed: "+scenario.isFailed());
//    }

    // -------------------------------------- ORDERED HOOKS ----------------------------------------------------------------------------------------
//    @BeforeAll(order = -1)
//    public static void beforeAllA() {
//        System.out.println("---- Order -1 | @BeforeAll -----");
//    }
//
//    @BeforeAll(order = 0)
//    public static void beforeAllB() {
//        System.out.println("---- Order 0 | @BeforeAll -----");
//    }
//
//    @BeforeAll(order = 1)
//    public static void beforeAllC() {
//        System.out.println("---- Order 1 | @BeforeAll -----");
//    }
//
//    @AfterAll(order = -1)
//    public static void afterAllA() {
//        System.out.println("---- Order -1 | @AfterAll -----");
//    }
//
//    @AfterAll(order = 0)
//    public static void afterAllB() {
//        System.out.println("---- Order 0 | @AfterAll -----");
//    }
//
//    @AfterAll(order = 1)
//    public static void afterAllC() {
//        System.out.println("---- Order 1 | @AfterAll -----");
//    }
//
//    @Before(order = -1)
//    public void beforeA(Scenario scenario) {
//        System.out.println("----- Order -1 | @Before ----");
//    }
//
//    @Before(order = 0)
//    public void beforeB() {
//        System.out.println("---- Order 0 | @Before -----");
//    }
//
//    @Before(order = 0)
//    public void beforeC() {
//        System.out.println("---- Order 1 | @Before -----");
//    }
//
//    @After(order = -1)
//    public void afterA(Scenario scenario) {
//        System.out.println("---- Order -1 | @After -----");
//    }
//
//    @After(order = 0)
//    public void afterB() {
//        System.out.println("---- Order 0 | @After -----");
//    }
//
//    @After(order = 1)
//    public void afterC() {
//        System.out.println("---- Order 1 | @After -----");
//    }

    // -------------------------------------- TAGGED HOOKS -----------------------------------------------------------------------------------------
//    @BeforeAll
//    public static void beforeAll() {
//        System.out.println("----- @BeforeAll -----");
//    }
//
//    @AfterAll
//    public static void afterAll() {
//        System.out.println("----- @AfterAll -----");
//    }
//
//
//    @Before("@Feature1Scenario1")
//    public void beforeScenario1() {
//        System.out.println("----- @Before for Scenario1 -----");
//    }
//
//    @Before("@Feature1Scenario2")
//    public void beforeScenario2() {
//        System.out.println("----- @Before for Scenario2 -----");
//    }
//
//    @After("@Feature1Scenario1")
//    public void afterScenario1() {
//        System.out.println("----- @After for Scenario1 -----");
//    }
//
//    @After("@Feature1Scenario2")
//    public void afterScenario2() {
//        System.out.println("----- @After for Scenario2 -----");
//    }
// -------------------------------------- TAGGING CONCEPT WITH HOOKS -----------------------------------------------------------------------------------------
//    @BeforeAll
//    public static void beforeAllB() {
//        System.out.println("---- @BeforeAll -----");
//    }
//
//    @AfterAll(order = 1)
//    public static void afterAllC() {
//        System.out.println("---- @AfterAll -----");
//    }
//
//    @Before
//    public void beforeA(Scenario scenario) {
//        System.out.println("---- @Before -----");
//    }
//
//    @After
//    public void afterA(Scenario scenario) {
//        System.out.println("---- @After -----");
//    }
//
//    @BeforeStep
//    public void beforeStep() {
//        System.out.println("----  @BeforeStep ----");
//    }
//
//    @AfterStep
//    public void afterStep() {
//        System.out.println("----  @AfterStep ----");
//    }
}

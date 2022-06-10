package basics;

import io.cucumber.java.en.*;

public class StepDefs {
    @Given("I'm in Page #{int}")
    public void i_m_in_page(Integer pageNo) {
        System.out.println("I'm in Page #: " + pageNo);
    }

    @When("I perform Action #{int}")
    public void i_perform_action(Integer actionNo) {
        System.out.println("I perform Action #: " + actionNo);
    }

    @Then("I get Output #{int}")
    public void i_get_output(Integer outputNo) {
        System.out.println("I get Output #: " + outputNo);
    }

    @Given("I'm dummy")
    public void iMDummy() {
        System.out.println("iMDummy");
    }

    @When("I do dummy things")
    public void iDoDummyThings() {
        System.out.println("iDoDummyThings");
    }

    @Then("dummy things happen")
    public void dummyThingsHappen() {
        System.out.println("dummyThingsHappen");
    }

    @Given("I have a current account")
    public void iHaveACurrentAccount() {
        System.out.println("iHaveACurrentAccount");
    }

    @But("I forgot to bring my debit card")
    public void iForgotToBringMyDebitCard() {
        System.out.println("iForgotToBringMyDebitCard");
    }


    @And("receipt should be sent via email")
    public void receiptShouldBeSentViaEmail() {
        System.out.println("receiptShouldBeSentViaEmail");
    }

    @But("the receipt should NOT be sent via SMS")
    public void theReceiptShouldNOTBeSentViaSMS() {
        System.out.println("theReceiptShouldNOTBeSentViaSMS");
    }

    @And("the customer should sent back an acknowledgement notification via email")
    public void customerAcknowledgement() {
        System.out.println("customerAcknowledgement");
    }

    @Given("I'm an existing customer of XYZ app")
    public void i_m_an_existing_customer_of_xyz_app() {
        System.out.println("i_m_an_existing_customer_of_xyz_app");
    }

    @When("I enter username")
    public void i_enter_username() {
        System.out.println("i_enter_username");
    }

    @When("I enter password")
    public void i_enter_password() {
        System.out.println("i_enter_password");
    }

    @When("I enter the OTP received")
    public void i_enter_the_otp_received() {
        System.out.println("i_enter_the_otp_received");
    }

    @When("I solve the CAPTCHA puzzle")
    public void i_solve_the_captcha_puzzle() {
        System.out.println("i_solve_the_captcha_puzzle");
    }

    @When("I click on Login Btn")
    public void i_click_on_login_btn() {
        System.out.println("i_click_on_login_btn");
    }

    @Then("I've logged in to the application")
    public void i_ve_logged_in_to_the_application() {
        System.out.println("i_ve_logged_in_to_the_application");
    }

    @Then("url title becomes {string}")
    public void url_title_becomes(String string) {
        System.out.println("url_title_becomes");
    }

    @Then("footer grid has Facebook icon")
    public void footer_grid_has_facebook_icon() {
        System.out.println("footer_grid_has_facebook_icon");
    }

    @Then("footer grid has LinkedIn icon")
    public void footer_grid_has_linked_in_icon() {
        System.out.println("footer_grid_has_linked_in_icon");
    }

    @Then("footer grid has Twitter icon")
    public void footer_grid_has_twitter_icon() {
        System.out.println("footer_grid_has_twitter_icon");
    }

    @Then("the login record should be created in Database")
    public void the_login_record_should_be_created_in_database() {
        System.out.println("the_login_record_should_be_created_in_database");
    }

    @When("I login using user credentials")
    public void i_login_using_user_credentials() {
        System.out.println("i_login_using_user_credentials");
    }

    @Then("I logged In")
    public void i_logged_in() {
        System.out.println("i_logged_in");
    }

    @Given("my Account balance is ${int}")
    public void myAccountBalanceIs$(int arg0) {
        System.out.println("myAccountBalanceIs$");
    }

    @When("I withdraw ${int}")
    public void iWithdraw$(int arg0) {
        System.out.println("iWithdraw$");
    }

    @Then("account balance should become ${int}")
    public void accountBalanceShouldBecome$(int arg0) {
        System.out.println("accountBalanceShouldBecome$");
    }

    @Then("the account balance should become ${int}")
    public void theAccountBalanceShouldBecome$ClosingBalance(int closingBalance) {
        System.out.println("theAccountBalanceShouldBecome$ClosingBalance");
    }

    @Given("I'm Bill")
    public void iMBill() {
        System.out.println("iMBill");
    }

    @And("I'm logged in")
    public void iMLoggedIn() {
        System.out.println("iMLoggedIn");
    }

    @When("I do x thing")
    public void iDoXThing() {
        System.out.println("iDoXThing");
    }

    @Then("x thing should happen")
    public void xThingShouldHappen() {
        System.out.println("xThingShouldHappen");
    }

    @Given("I'm exploring something")
    public void iMExploringSomething() {
        System.out.println("iMExploringSomething");
    }

    @When("I do y thing")
    public void iDoYThing() {
        System.out.println("iDoYThing");
    }

    @Then("y thing should happen")
    public void yThingShouldHappen() {
        System.out.println("yThingShouldHappen");
    }

    @And("{string} link is shown")
    public void linkIsShown(String arg0) {
        System.out.println("linkIsShown");
    }

    @When("I click on {string} link")
    public void iClickOnLink(String arg0) {
        System.out.println("iClickOnLink");
    }

    @Then("I'm navigate to the Cart page")
    public void iMNavigateToTheCartPage() {
        System.out.println("iMNavigateToTheCartPage");
    }

    @When("I check product name and quantity")
    public void iCheckProductNameAndQuantity() {
        System.out.println("iCheckProductNameAndQuantity");
    }

    @Then("the product name is {string}")
    public void theProductNameIs(String arg0) {
        System.out.println("theProductNameIs");
    }

    @And("the product quantity is {int}")
    public void theProductQuantityIs(int arg0) {
        System.out.println("theProductQuantityIs");
    }

    @Given("I'm on the Home page")
    public void iMOnTheHomePage() {
        System.out.println("iMOnTheHomePage");
    }

    @And("I navigate to the Store page by pressing {string} menu option")
    public void iNavigateToTheStorePageByPressingMenuOption(String arg0) {
        System.out.println("iNavigateToTheStorePageByPressingMenuOption");
    }

    @When("I locate the product {string}")
    public void iLocateTheProduct(String arg0) {
        System.out.println("iLocateTheProduct");
    }

    @And("click on {string} button")
    public void clickOnButton(String arg0) {
        System.out.println("clickOnButton");
    }

    @Then("the {string} button changes")
    public void theButtonChanges(String arg0) {
        System.out.println("theButtonChanges");
    }

    @And("a tick mark is shown inside it")
    public void aTickMarkIsShownInsideIt() {
        System.out.println("aTickMarkIsShownInsideIt");
    }

    @Given("I'm on the Home page and I navigate to the Store page by pressing {string} menu option")
    public void iMOnTheHomePageAndINavigateToTheStorePageByPressingMenuOption(String arg0) {
        System.out.println("iMOnTheHomePageAndINavigateToTheStorePageByPressingMenuOption");
    }

    @When("I locate the product {string} and click on {string} button")
    public void iLocateTheProductAndClickOnButton(String arg0, String arg1) {
        System.out.println("iLocateTheProductAndClickOnButton");
    }

    @Then("the {string} button changes and a tick mark is shown inside it")
    public void theButtonChangesAndATickMarkIsShownInsideIt(String arg0) {
        System.out.println("theButtonChangesAndATickMarkIsShownInsideIt");
    }

    @Given("I'm on Store page")
    public void iMOnStorePage() {
        System.out.println("iMOnStorePage");
    }

    @When("I add {string} to the Cart")
    public void iAddToTheCart(String arg0) {
        System.out.println("iAddToTheCart");
    }

    @Then("I see {int} {string} in the Cart")
    public void iSeeInTheCart(int arg0, String arg1) {
        System.out.println("iSeeInTheCart");
    }
}



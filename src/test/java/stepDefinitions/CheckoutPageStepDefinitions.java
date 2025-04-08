package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinitions {

    private TestContextSetup testContextSetup;
    public CheckoutPage checkoutPage;

    public CheckoutPageStepDefinitions(TestContextSetup testContextSetup) {

        this.testContextSetup = testContextSetup;
        this.checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
    }

    @Then("verify user has ability to enter promo code and place the order")
    public void verify_User_Has_Ability_To_Enter_Promo_Code_And_Place_The_Order() {

        Assert.assertTrue(checkoutPage.VerifyPromoBtn());
        Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
    }

    @Then("^User proceed to checkout and vaidate the (.+) items in checkout page$")
    public void User_proceed_to_checkout_and_vaidate_the_items_in_checkout_page(String name){
        checkoutPage.CheckoutItems();
        //Assignment implement assertion to extract name from screen and compare with name
    }

}

package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {

    private TestContextSetup testContextSetup;
    public LandingPage landingPage;

    public LandingPageStepDefinitions(TestContextSetup testContextSetup) {

        this.testContextSetup = testContextSetup;
        this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
    }

    /*public WebDriver driver;
    public String landingPageProductName;
    public String offerPageProductName;*/

    @Given("User is on GreenCart Landing Page")
    public void user_is_on_green_cart_landing_page() {
       // System.setProperty("webdriver.chrome.driver","C:/QAF/chromedriver-win64/chromedriver.exe");
       // textContextSetup.driver = new ChromeDriver();
       // textContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
    }
    @When("^User searched with shortname (.+) and extracted actual name of product$")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
        //LandingPage landingPage = new LandingPage(textContextSetup.driver);

        landingPage.searchItem(shortName);
        Thread.sleep(2000);
        testContextSetup.landingPageProductName=landingPage.getProductName().split("-")[0].trim();
        System.out.println(testContextSetup.landingPageProductName + "is extracted from the Home Page");
    }

    @When("Added {string} items of the selected product to cart")
    public void added_items_of_selected_product_to_cart(String quantity) throws InterruptedException {
        //Assignment inplement increamint item by pressing the + icon two time
    }
}

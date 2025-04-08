package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {

    private TestContextSetup testContextSetup;

    public LandingPageStepDefinitions(TestContextSetup testContextSetup) {
            this.testContextSetup = testContextSetup;
    }

    /*public WebDriver driver;
    public String landingPageProductName;
    public String offerPageProductName;*/

    @Given("User is on GreenCart Landing Page")
    public void user_is_on_green_cart_landing_page() {
       // System.setProperty("webdriver.chrome.driver","C:/QAF/chromedriver-win64/chromedriver.exe");
       // textContextSetup.driver = new ChromeDriver();
       // textContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

    }
    @When("^User searched with shortname (.+) and extracted actual name of product$")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
        //LandingPage landingPage = new LandingPage(textContextSetup.driver);
        LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
        landingPage.searchItem(shortName);
        Thread.sleep(2000);
        testContextSetup.landingPageProductName=landingPage.getProductName().split("-")[0].trim();
        System.out.println(testContextSetup.landingPageProductName + "is extracted from the Home Page");
    }
}

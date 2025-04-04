package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LandingPage;
import utils.TextContextSetup;

public class LandingPageStepDefinitions {

    private  TextContextSetup textContextSetup;

    public LandingPageStepDefinitions(TextContextSetup textContextSetup) {
            this.textContextSetup=textContextSetup;
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
    @When("User searched with shortname {string} and extracted actual name of product")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
        //LandingPage landingPage = new LandingPage(textContextSetup.driver);
        LandingPage landingPage = textContextSetup.pageObjectManager.getLandingPage();
        landingPage.searchItem(shortName);
        Thread.sleep(2000);
        textContextSetup.landingPageProductName=landingPage.getProductName().split("-")[0].trim();
        System.out.println(textContextSetup.landingPageProductName + "is extracted from the Home Page");
    }
}

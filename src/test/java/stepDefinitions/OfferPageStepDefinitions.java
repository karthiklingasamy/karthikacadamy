package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import utils.TextContextSetup;

import java.util.Iterator;
import java.util.Set;

public class OfferPageStepDefinitions {

    private  TextContextSetup textContextSetup;
    public String offerPageProductName;

    public OfferPageStepDefinitions(TextContextSetup textContextSetup) {

        this.textContextSetup=textContextSetup;
    }

    public void switchToOfferPage(){

        //textContextSetup.driver.findElement(By.linkText("Top Deals")).click();
        LandingPage landingPage=new LandingPage(textContextSetup.driver);
        landingPage.selectTopDealsPage();
        Set<String> s1=textContextSetup.driver.getWindowHandles();
        Iterator<String> it=s1.iterator();
        String parentWindow=it.next();
        String childWindow=it.next();
        textContextSetup.driver.switchTo().window(childWindow);

    }

    @Then("User searched for {string} Shortname in offers page")
    public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException {
        switchToOfferPage();
        OfferPage offerPage=new OfferPage(textContextSetup.driver);
        offerPage.searchItem(shortName);
        //textContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
        Thread.sleep(2000);
        //offerPageProductName=textContextSetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText().trim();
        offerPageProductName=offerPage.getSearchText();

    }

    @And("validate product name in offer page matches with Landing Page")
    public void validate_product_name_in_offer_page_matches_with_Landing_Page() {
        Assert.assertEquals(offerPageProductName,textContextSetup.landingPageProductName);
    }
}

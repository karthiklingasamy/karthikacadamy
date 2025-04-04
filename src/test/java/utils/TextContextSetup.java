package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

public class TextContextSetup {

    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public String landingPageProductName;
    public TestBase testBase;
    public GenericUtils genericUtils;

    public TextContextSetup(){
        testBase=new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
        genericUtils=new GenericUtils(testBase.WebDriverManager());
    }
}

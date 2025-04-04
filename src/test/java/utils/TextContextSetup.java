package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;

import java.io.IOException;

public class TextContextSetup {

    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public String landingPageProductName;
    public TestBase testBase;
    public GenericUtils genericUtils;

    public TextContextSetup() throws IOException {
        testBase=new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
        genericUtils=new GenericUtils(testBase.WebDriverManager());
    }
}

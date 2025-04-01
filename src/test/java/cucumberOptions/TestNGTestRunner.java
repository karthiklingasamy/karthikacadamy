package cucumberOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

@CucumberOptions(features = "src/test/java/features/",glue = "stepDefinitions",
monochrome = true,dryRun = false)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {




}

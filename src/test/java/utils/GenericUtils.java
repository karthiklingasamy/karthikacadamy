package utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;


public class GenericUtils {

    public WebDriver driver;

    public GenericUtils(WebDriver driver) {
        this.driver=driver;

    }

    public void SwitchWindowToChild()
    {
         Set<String> s1=driver.getWindowHandles();
        Iterator<String> it=s1.iterator();
        String parentWindow=it.next();
        String childWindow=it.next();
        driver.switchTo().window(childWindow);

    }
}

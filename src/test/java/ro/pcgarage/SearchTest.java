package ro.pcgarage;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SearchTest {

    @Test
    public void searchOneKeyWord(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().window().setPosition(new Point(0,0));
        driver.get("https://www.pcgarage.ro");
        driver.findElement(By.id("searchac")).sendKeys("3070" + Keys.ENTER);
    }
}

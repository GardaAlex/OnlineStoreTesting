package ro.pcgarage.register;

//import org.apache.http.Header;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import ro.pcgarage.AppConfig;
import ro.pcgarage.TestBase;
import ro.pcgarage.webpages.Header;


import java.util.concurrent.TimeUnit;
public class RegisterTest extends TestBase{
    @Test
    public void registerNewUser() {
        Header header = PageFactory.initElements(driver, Header.class);
        openHomepage();
        header.login();
        driver.findElement(By.id("newfirstname")).sendKeys("Ion");
        driver.findElement(By.name("newlastname")).sendKeys("ION");
        driver.findElement(By.name("telephone")).sendKeys("0755555555");
        driver.findElement(By.xpath("//*[@id=\"newemail\"]")).sendKeys("testfast@mailinator.com");
        driver.findElement(By.id("newpassword")).sendKeys("test123test");
        driver.findElement(By.id("newpasswordretype")).sendKeys("test123test");
        driver.findElement(By.id("newsletter")).sendKeys(Keys.SPACE);
        driver.findElement(By.id("confidentialitate")).sendKeys(Keys.SPACE);
        driver.findElement(By.xpath("//button[text()='Creeaza cont']")).click();

    }
}
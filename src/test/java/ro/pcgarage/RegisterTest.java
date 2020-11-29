package ro.pcgarage;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    @Test
    public void registerNewUser() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().window().setPosition(new Point(0, 0));

        driver.get("https://www.pcgarage.ro");
        driver.findElement(By.id("h_account_top")).click();
        driver.findElement(By.id("newfirstname")).sendKeys("Ion");
        driver.findElement(By.name("newlastname")).sendKeys("ION");
        driver.findElement(By.name("telephone")).sendKeys("0755555555");
        driver.findElement(By.xpath("//*[@id=\"newemail\"]")).sendKeys("mail@testware.ro");
        driver.findElement(By.id("newpassword")).sendKeys("test123test");
        driver.findElement(By.id("newpasswordretype")).sendKeys("test123test");
        driver.findElement(By.id("newsletter")).sendKeys(Keys.SPACE);
        driver.findElement(By.id("confidentialitate")).sendKeys(Keys.SPACE);
        //driver.findElement(By.linkText("Creeaza cont")).click();


    }
}
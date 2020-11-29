package ro.pcgarage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WishListTest {

    @Test
    public void addToWishList() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.pcgarage.ro/cauta/3080");

        driver.findElement(By.className("my-0")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(By.id("addto_plus")).click();
        driver.findElement(By.xpath("//*[@id=\"addto_content\"]/p[1]/a/text()")).click();



    }
}

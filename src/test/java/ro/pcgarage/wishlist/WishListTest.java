package ro.pcgarage.wishlist;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ro.pcgarage.AppConfig;
import ro.pcgarage.TestBase;

import java.util.concurrent.TimeUnit;

public class WishListTest extends TestBase {
    @Test
    public void addToWishList() throws InterruptedException {
        openHomepage();
        driver.findElement(By.className("menu_col")).click();
        driver.findElement(By.className("my-0")).click();
        driver.findElement(By.id("addto_plus")).click();
        driver.findElement(By.xpath("//*[@id=\"addto_content\"]/p[1]/a/text()")).click();



    }

}

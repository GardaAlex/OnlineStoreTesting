package ro.pcgarage.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import ro.pcgarage.AppConfig;
import ro.pcgarage.TestBase;
import ro.pcgarage.webpages.Header;
import ro.pcgarage.webpages.ProductsList;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class SearchTest extends TestBase{

    private String searchKeyword;

    public SearchTest(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }
    @Parameterized.Parameters
    public static List<String> data(){
        return Arrays.asList("Placi video 3070", "laptop", "sursa");
    }

    @Test
    public void searchKeyWords(){

        openHomepage();

        Header header = PageFactory.initElements(driver, Header.class);

        header.search(searchKeyword);

        ProductsList productsList = PageFactory.initElements(driver, ProductsList.class);

        System.out.println("Numar de produse: " + productsList.getProductNames().size());

        for (WebElement productName : productsList.getProductNames()) {
            assertThat("Some products does not contain searched keywords.",
            productName.getText(), containsString(searchKeyword));
        }
    }

}

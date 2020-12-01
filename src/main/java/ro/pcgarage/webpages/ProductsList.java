package ro.pcgarage.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsList {

    @FindBy(css = "h2.my-0 a")
    private List<WebElement> productNames;

    public List<WebElement> getProductNames() {
        return productNames;
    }
}

package ro.pcgarage.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header {

    @FindBy(id = "searchac")
    private WebElement searchField;


    public WebElement getSearchField() {
        return searchField;
    }

    public void search(String keyword) {
        searchField.sendKeys(keyword + Keys.ENTER);
    }

    @FindBy(id = "h_account_top")
    private WebElement loginLink;
    public WebElement getLoginLink() {
        return loginLink;
    }
    public void loginPage() {
        loginLink.click();
    }
}

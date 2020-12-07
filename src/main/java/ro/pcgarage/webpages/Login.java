package ro.pcgarage.webpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
    @FindBy(id = "email")
    private WebElement loginField;

    public WebElement getLoginField() {
        return loginField;
    }

    public void loginAccount() {
        loginField.sendKeys("test@yahoo.com");
    }

    @FindBy(id = "password")
    private WebElement passwordField;

    public WebElement getPasswordField() {
        return passwordField;
    }

    public void password() {
        passwordField.sendKeys("1234" + Keys.ENTER);
    }

}

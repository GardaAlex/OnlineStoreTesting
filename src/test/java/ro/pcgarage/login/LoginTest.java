package ro.pcgarage.login;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import ro.pcgarage.TestBase;
import ro.pcgarage.webpages.Header;
import ro.pcgarage.webpages.Login;

public class LoginTest extends TestBase {

    @Test
    public void loginNewUser(){
        Login login = PageFactory.initElements(driver, Login.class);
        Header header = PageFactory.initElements(driver, Header.class);
        openHomepage();
        header.loginPage();
        login.loginAccount();
        login.password();
    }
}

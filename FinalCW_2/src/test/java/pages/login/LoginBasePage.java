package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tests.login.BaseTest;

public abstract class LoginBasePage {
    protected WebDriver driver;

    public LoginBasePage() {
        driver = BaseTest.getDriver();
        PageFactory.initElements(driver, this);
    }
}

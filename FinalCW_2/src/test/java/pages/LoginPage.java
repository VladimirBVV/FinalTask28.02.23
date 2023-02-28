package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"userName\"]")
    WebElement loginField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"login\"]")
    WebElement button;

    public void fillLoginField(String text) {
        loginField.clear();
        loginField.sendKeys(text);
    }

    public void fillPasswordField(String text) {
        passwordField.clear();
        passwordField.sendKeys(text);
    }

    public void clickButton() throws InterruptedException {
        button.click();
        Thread.sleep(500);
    }
}

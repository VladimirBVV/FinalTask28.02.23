package pages.login;

import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends LoginBasePage {

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

    @SneakyThrows
    public void clickButton() {
        button.click();
        Thread.sleep(5000);
    }
}

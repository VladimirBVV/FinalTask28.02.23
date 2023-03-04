package pages.textbox;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;
public class TextBoxPage extends TextBoxBasePage {

    @FindBy(xpath = "//*[@id=\"userName\"]")
    WebElement userName;

    @FindBy(xpath = "//*[@id=\"userEmail\"]")
    WebElement userEmail;

    @FindBy(xpath = "//*[@id=\"currentAddress\"]")
    WebElement currentAddress;

    @FindBy(xpath = "//*[@id=\"permanentAddress\"]")
    WebElement permanentAddress;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    WebElement submit;

    public void fillUserName(String text) {
        userName.clear();
        userName.sendKeys(text);
    }

    public void fillUserEmail(String text) {
        userEmail.clear();
        userEmail.sendKeys(text);
    }

    public void fillCurrentAddress(String text) {
        currentAddress.clear();
        currentAddress.sendKeys(text);
    }

    public void fillPermanentAddress(String text) {
        permanentAddress.clear();
        permanentAddress.sendKeys(text);
    }

    @SneakyThrows
    public void clickSubmit() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement submitBtn = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].scrollIntoView();", submitBtn);
        submit.click();
    }
}
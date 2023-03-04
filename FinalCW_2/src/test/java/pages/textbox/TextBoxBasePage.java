package pages.textbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tests.textbox.TextBoxTest;

public abstract class TextBoxBasePage {
    protected static WebDriver driver;
    public TextBoxBasePage() {
        driver = TextBoxTest.getDriver();
        PageFactory.initElements(driver, this);
    }
}
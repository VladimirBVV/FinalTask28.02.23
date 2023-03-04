package pages.textbox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.fail;

public class TextBoxFailedPage extends TextBoxBasePage {
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement outputEmail;

    public void assertThatOutputEmailAbsent() {
        try {
            outputEmail.isEnabled();
            fail("Output email element should not be present");
        } catch (Exception ignored){}
    }
}

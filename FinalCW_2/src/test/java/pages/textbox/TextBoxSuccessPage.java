package pages.textbox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class TextBoxSuccessPage extends TextBoxBasePage {
    @FindBy(xpath = "//*[@id=\"output\"]/div")
    WebElement output;

    public void assertThatOutputPresent() {
        assertThat(output.isDisplayed()).isTrue();
    }
}

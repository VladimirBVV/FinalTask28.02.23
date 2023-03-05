package pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.fail;

public class LoginFailedPage extends LoginBasePage {

    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement InvalidName;

    @FindBy(xpath = "//*[@id=\"userName-value\"]")
    WebElement userName;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div")
    WebElement headerLogin;

    @FindBy(xpath = "//*[@id=\"newUser\"]")
    WebElement newUser;

    public void assertInvalidNameMessege() {
        assertThat(InvalidName.getText()).isEqualTo("Invalid username or password!");
    }

    public void assertThatUserNameAbsent() {
        try {
            userName.isEnabled();
            fail();
        } catch (Exception ignored) {}
    }

    public void assertThatHeaderContainsText(String text) {
        assertThat(headerLogin.getText()).contains(text);
    }

    public void assertNewUsersButton() {
        assertThat(newUser.isDisplayed()).isTrue();
    }
}
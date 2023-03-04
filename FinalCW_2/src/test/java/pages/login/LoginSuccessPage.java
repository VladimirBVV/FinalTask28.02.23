package pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginSuccessPage extends LoginBasePage {

    @FindBy(xpath = "//*[@id=\"userName-value\"]")
    WebElement userName;

    public void assertThatUserNamePresent() {
        assertThat(userName.isDisplayed()).isTrue();
    }

    public static class ProfilePage extends LoginBasePage {
        @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div")
        WebElement headerProfile;

        public void assertThatHeaderContainsText(String text) {
            assertThat(headerProfile.getText()).contains(text);
        }
    }
}



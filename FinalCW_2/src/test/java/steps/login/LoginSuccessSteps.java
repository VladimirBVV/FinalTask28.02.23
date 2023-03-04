package steps.login;

import pages.login.LoginSuccessPage;

public class LoginSuccessSteps {

    LoginSuccessPage page = new LoginSuccessPage();

    public void verifyThatOk() {
        page.assertThatUserNamePresent();
    }

    LoginSuccessPage.ProfilePage profilePage = new LoginSuccessPage.ProfilePage();

    public void verifyThatProfileIsOpen() {
        profilePage.assertThatHeaderContainsText("Profile");
    }
}

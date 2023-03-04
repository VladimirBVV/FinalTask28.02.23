package steps.login;

import pages.login.LoginFailedPage;

public class LoginFailedSteps {

    LoginFailedPage page = new LoginFailedPage();
    public void verifyThatFailedPageVisible() {
        page.assertThatUserNameAbsent();
        page.assertInvalidNameMessege();
        page.assertThatHeaderContainsText("Login");
    }
    public void assertThatNewUsersButtonPresent() {
        page.assertNewUsersButton();
    }
}

package steps;

import pages.LoginFailedPage;

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

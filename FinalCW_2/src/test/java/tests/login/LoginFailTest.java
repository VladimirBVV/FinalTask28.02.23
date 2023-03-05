package tests.login;

import org.testng.annotations.Test;
import steps.login.LoginFailedSteps;


public class LoginFailTest extends BaseTest {
    @Test(dataProvider = "loginFailed")
    public void testLoginFailed(String login, String password) {
        LoginFailedSteps steps1 = steps.doIncorrectLogin(login, password);
        steps1.verifyThatFailedPageVisible();
    }

    @Test(dependsOnMethods = {"testLoginFailed"}, dataProvider = "loginFailed")
    public void testLoginFailedAndAssertThatNewUsersButton(String login, String password) {
        LoginFailedSteps steps1 = steps.doIncorrectLogin(login, password);
        steps1.assertThatNewUsersButtonPresent();
    }
}

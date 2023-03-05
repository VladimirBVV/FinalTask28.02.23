package tests.login;

import org.testng.annotations.Test;
import steps.login.LoginSuccessSteps;

public class LoginSuccessTest extends BaseTest {

    @Test(dataProvider = "loginSuccess")
    public void testLoginSuccess(String login, String password) {
        LoginSuccessSteps steps1 = steps.doLogin(login, password);
        steps1.verifyThatOk();
        steps1.verifyThatProfileIsOpen();
    }
}

package tests;

import org.testng.annotations.Test;
import steps.LoginSuccessSteps;
//import utils.PropertyReader;

public class LoginSuccessTest extends BaseTest {

    @Test(dataProvider = "loginSuccess")
    public void testLoginSuccess(String login, String password) {
//        getDriver().navigate().to(PropertyReader.getInstance().getURL());
        LoginSuccessSteps steps1 = steps.doLogin(login, password);
        steps1.verifyThatOk();
        steps1.verifyThatProfileIsOpen();
    }
}

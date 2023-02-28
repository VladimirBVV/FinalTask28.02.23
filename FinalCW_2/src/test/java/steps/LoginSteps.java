package steps;

import lombok.SneakyThrows;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @SneakyThrows
    public LoginSuccessSteps doLogin(String login, String password) {
        inputLoginData(login, password);
        return new LoginSuccessSteps();
    }

    @SneakyThrows
    public LoginFailedSteps doIncorrectLogin(String login, String password) {
        inputLoginData(login, password);
        return new LoginFailedSteps();
    }


    @SneakyThrows
    private void inputLoginData(String login, String password)  {
   //     Thread.sleep(1000);
        loginPage.fillLoginField(login);
        loginPage.fillPasswordField(password);
        loginPage.clickButton();
    }
}

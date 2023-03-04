package steps.login;

import lombok.SneakyThrows;
import pages.login.LoginPage;

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
        loginPage.fillLoginField(login);
        loginPage.fillPasswordField(password);
        loginPage.clickButton();
    }
}

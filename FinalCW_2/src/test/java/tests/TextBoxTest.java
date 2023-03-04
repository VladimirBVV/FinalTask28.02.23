package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import steps.TextBoxSteps;
import utils.Browser;
import utils.DriverFactory;

import java.time.Duration;

public class TextBoxTest {

    static WebDriver driver;

    protected WebDriverWait wait;

    TextBoxSteps textBoxSteps;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void beforeClass() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        textBoxSteps = new TextBoxSteps();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @DataProvider(name = "textBoxSuccess")
    public Object[][] textBoxSuccessData() {
        return new Object[][] {
                {"", "vlad@test.com", "",""},
                {"vlad", "vl@test.com", "",""},
                {"vlad", "vl@test.com", "3496 Holt Street",""},
                {"vlad", "vl@test.com", "3496 Holt Street", "3781 Cooks Mine Road"}
        };
    }

    @DataProvider(name = "textBoxFailed")
    public Object[][] textBoxFailedData() {
        return new Object[][] {
                {"","example@com","",""},
                {"","example.com","",""},
                {"","example@com.","",""},
                {"","example@.com","",""},
                {"","example@com..ua","",""}
        };
    }
}

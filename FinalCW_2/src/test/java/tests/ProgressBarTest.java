package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import utils.Browser;
import utils.DriverFactory;
import java.time.Duration;

public class ProgressBarTest {
    private WebDriver driver;

    protected WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://demoqa.com/progress-bar");
    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test(expectedExceptions = TimeoutException.class)
    public void testProgressBarTimeout() {
        WebElement progressBar = driver.findElement(By.id("progressBar"));
        WebElement startButton = driver.findElement(By.id("startStopButton"));
        startButton.click();

        wait.until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", "100"));
    }
}

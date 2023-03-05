package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Browser;
import utils.DriverFactory;

import java.time.Duration;

public class ButtonsTest {
    static WebDriver driver;

    protected WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://demoqa.com/buttons");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public void testClickButton() {
        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickButton.click();
        String message = driver.findElement(By.id("dynamicClickMessage")).getText();
        Assert.assertEquals(message, "You have done a dynamic click");
    }

    @Test
    public void testDoubleClickButton() {
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton).perform();
        String message = driver.findElement(By.id("doubleClickMessage")).getText();
        Assert.assertEquals(message, "You have done a double click");
    }

    @Test
    public void testRightClickButton() {
        WebElement rightClickButton = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClickButton).perform();
        String message = driver.findElement(By.id("rightClickMessage")).getText();
        Assert.assertEquals(message, "You have done a right click");
    }
}

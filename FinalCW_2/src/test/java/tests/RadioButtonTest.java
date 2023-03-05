package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Browser;
import utils.DriverFactory;

import java.time.Duration;

public class RadioButtonTest {
    private WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = DriverFactory.getDriver(Browser.CHROME);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://demoqa.com/radio-button");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test(priority = 1)
    public void testInitialRadioButtonState() {
        // Check that all radio buttons are initially unchecked
        WebElement yesRadioButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]"));
        WebElement impressiveRadioButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]"));
        WebElement noRadioButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]"));
        Assert.assertFalse(yesRadioButton.isSelected());
        Assert.assertFalse(impressiveRadioButton.isSelected());
        Assert.assertFalse(noRadioButton.isSelected());
    }

    @Test (priority = 2)
    public void testYesRadioButtonSelection() {
        // Select the "Yes" radio button and verify the "YES" text is displayed
        WebElement yesRadioButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
        yesRadioButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p/span"))).isDisplayed();
    }


    @Test(priority = 3)
    public void testImpressiveRadioButtonSelection() {
        // Select the "Impressive" radio button and verify it is selected
        WebElement impressiveRadioButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
        impressiveRadioButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p/span"))).isDisplayed();
    }

//    @Test(priority = 4)
//    public void testNoRadioButtonSelection() {
//        // Select the "No" radio button and verify it is selected
//        WebElement noRadioButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]"));
//        noRadioButton.click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("noRadio"))).isDisplayed();
//    }
}

package Liverpool.AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Commons {

    WebDriver driver;

    public Commons(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "")
    WebElement button1;

    //------------------------- methods -------------------------

    public void waitForElementToBeVisible(By findBy) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }

    public void waitForElementToBeVisible(WebElement findBy) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(findBy));
    }

    public void waitFor(int seconds) throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(seconds).toMillis());
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void enterText(WebElement element, String text) {
        element.sendKeys(text);
    }

}

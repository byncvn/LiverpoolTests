package Liverpool.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtils {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;

    public SeleniumUtils(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    //------------------------- methods -------------------------

    public Boolean isElementDisplayed(WebElement element) {
        System.out.println("Checking if element is displayed: " + element);
        return element.isDisplayed();
    }

    public Boolean isElementDisplayed(Boolean hardCode) {
        return hardCode;
    }

    public void waitForElementToBeVisible(WebElement findBy) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(findBy));
    }

    public void waitFor(int seconds) throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(seconds).toMillis());
    }

    public void clickElement(WebElement element) {
        //TODO: add a waitforElementToBeVisible
        //TODO: add a log
//        System.out.println("Clicking on element: " + element.getAccessibleName());
        System.out.println("Clicking on element: " + element);

        element.click();
    }

    public void hoverOverElement(WebElement element) {
        actions.moveToElement(element).perform();

    }

    public void scrollToElement(WebElement element) {
        actions.scrollToElement(element).perform();
    }

    public void enterText(WebElement element, String text) {
        //TODO: add a waitforElementToBeVisible
        //TODO: add a log
        System.out.println("Entering text: " + text + " in element: " + element);
        element.sendKeys(text);
    }

    public void navigateToSignUp(String url) {
        driver.get(url);
    }


    //TODO: add logic to create email and return credentials
    public String createNewEmail() {
        return "email";
    }

}

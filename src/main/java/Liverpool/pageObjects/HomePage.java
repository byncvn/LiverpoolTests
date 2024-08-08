package Liverpool.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "")
    WebElement button1;

    @FindBy(id = "")
    WebElement button2;

    @FindBy(id = "")
    WebElement button3;

    @FindBy(id = "")
    WebElement button4;

    @FindBy(id = "")
    WebElement button5;

    //------------------------- methods -------------------------

    public void method1() {
    }

    public void method2() {
    }

    public void method3() {
    }

    public void method4() {
    }

    public void method5() {
    }
}

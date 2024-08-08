package Liverpool.pageObjects;

import Liverpool.AbstractComponents.Commons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Commons {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
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

    @FindBy(id = "")
    WebElement button6;

    @FindBy(id = "")
    WebElement button7;

    @FindBy(id = "")
    WebElement button8;

    @FindBy(id = "")
    WebElement button9;

    @FindBy(id = "")
    WebElement button10;

    @FindBy(id = "")
    WebElement button11;

    @FindBy(id = "")
    WebElement button12;

    @FindBy(id = "")
    WebElement button13;

    @FindBy(id = "")
    WebElement button14;

    @FindBy(id = "")
    WebElement button15;

    @FindBy(id = "")
    WebElement button16;

    @FindBy(id = "")
    WebElement button17;

    @FindBy(id = "")
    WebElement button18;

    @FindBy(id = "")
    WebElement button19;

    @FindBy(id = "")
    WebElement button20;

    @FindBy(id = "")
    WebElement button21;

    @FindBy(id = "")
    WebElement button22;

    @FindBy(id = "")
    WebElement button23;

    @FindBy(id = "")
    WebElement button24;

    @FindBy(id = "")
    WebElement button25;


    //------------------------- methods -------------------------

    public void navigateTo() {
        driver.get("https://login.liverpool.com.mx/u/login");
    }

    public void clickButton1() {
        clickElement(button1);
    }

    public void method3() {
        clickElement(button3);
    }

    public void method4() {
        clickElement(button4);
    }

    public void method5() {
        clickElement(button5);
    }

    public void method6() {
        clickElement(button6);
    }

    public void method7() {
        clickElement(button7);
    }

    public void method8() {
        clickElement(button8);
    }

    public void method9() {
        clickElement(button9);
    }

    public void method10() {
        clickElement(button10);
    }

    public void method11() {
        clickElement(button11);
    }

    public void method12() {
        clickElement(button12);
    }

    public void method13() {
        clickElement(button13);
    }

    public void method14() {
        clickElement(button14);
    }

    public void method15() {
        clickElement(button15);
    }

    public void method16() {
        clickElement(button16);
    }

    public void method17() {
        clickElement(button17);
    }

    public void method18() {
        clickElement(button18);
    }

    public void method19() {
        clickElement(button19);
    }

    public void method20() {
        clickElement(button20);
    }

    public void method21() {
        clickElement(button21);
    }

    public void method22() {
        clickElement(button22);
    }

    public void method23() {
        clickElement(button23);
    }

    public void method24() {
        clickElement(button24);
    }

    public void method25() {
        clickElement(button25);
    }



}

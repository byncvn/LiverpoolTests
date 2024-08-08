package Liverpool.pageObjects.authentication;

import Liverpool.AbstractComponents.Commons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseAuthenticationPage extends Commons {

    WebDriver driver;


    public BaseAuthenticationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ------------------------- commons elements -------------------------
    @FindAll({
            @FindBy(id = "email"),
            @FindBy(id = "username")
    })
    WebElement emailTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(xpath = "*//span[text()='Continuar con Apple']")
    public WebElement continueWithAppleButton;

    @FindBy(id = "")
    public WebElement continueWithFacebookButton;

    @FindBy(id = "")
    public WebElement footer;

    @FindBy(id = "")
    public WebElement header;

    @FindBy(id = "")
    public WebElement logo;

    @FindBy(id = "")
    public WebElement informationText;

    //TODO: make this a list
    @FindBy(id = "")
    public WebElement subBrand1;

    // ------------------------- methods -------------------------

    public void navigateTo() {
        driver.get("https://login.liverpool.com.mx/u/login");
    }

    public String getFooterText() {
        return footer.getText();
    }

    public String getHeaderText() {
        return header.getText();
    }

    public String getLogoText() {
        return logo.getText();
    }

    public void clickContinueWithAppleButton() {
        clickElement(continueWithAppleButton);
    }

    public void clickContinueWithFacebookButton() {
        clickElement(continueWithFacebookButton);
    }

    public void setEmail(String email) {
        enterText(emailTextBox, email);
    }

    public void setPassword(String password) {
        enterText(passwordTextBox, password);
    }
}

package Liverpool.pageObjects.authentication;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseAuthenticationPage {

    WebDriver driver;


    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ------------------------- Elements -------------------------

    @FindBy(id = "")
    WebElement forgotPasswordLink;

    @FindBy(xpath = "*//button[text()='Iniciar sesión']")
    WebElement loginButton;

    @FindBy(xpath = "*//a[text()='Crear cuenta']")
    WebElement createAccountButton;

    @FindBy(id = "")
    WebElement iniciaSesionText;

    @FindBy(id = "")
    WebElement dontHaveAccountText;

    @FindBy(id = "error-element-password")
    WebElement wrongCredentialsSpan;

    //------------------------- methods -------------------------

    public void navigateTo() {
        driver.get("https://login.liverpool.com.mx/u/login");
    }

    private void clickLoginButton() {
        clickElement(loginButton);
    }

    public SignUpPage clickCreateAccountButton() {
        clickElement(createAccountButton);
        return new SignUpPage(driver);
    }

    public void clickForgotPasswordLink() {
        clickElement(forgotPasswordLink);
    }

    public void logIn(String email, String password){
        setEmail(email);
        setPassword(password);
        clickLoginButton();
    }

    public Boolean isWrongCredentialsSpanDisplayed() {
        return wrongCredentialsSpan.isDisplayed();
    }

}

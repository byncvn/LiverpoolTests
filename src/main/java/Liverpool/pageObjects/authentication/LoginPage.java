package Liverpool.pageObjects.authentication;

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

    @FindBy(id = "")
    WebElement loginButton;

    @FindBy(xpath = "*//a[text()='Crear cuenta']")
    WebElement createAccountButton;

    @FindBy(id = "")
    WebElement iniciaSesionText;

    @FindBy(id = "")
    WebElement dontHaveAccountText;

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

}

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

    // ------------------------- commons elements -------------------------

    @FindBy(id = "")
    WebElement continueWithAppleButton;

    @FindBy(id = "")
    WebElement continueWithFacebookButton;

    @FindBy(id = "")
    WebElement footer;

    @FindBy(id = "")
    WebElement header;

    @FindBy(id = "")
    WebElement logo;

    @FindBy(id = "")
    WebElement informationText;

    //TODO: make this a list
    @FindBy(id = "")
    WebElement subBrand1;

    // ------------------------- loginPage -------------------------

    @FindBy(id = "")
    WebElement emailTextBox;

    @FindBy(id = "")
    WebElement passwordTextBox;

    @FindBy(id = "")
    WebElement forgotPasswordLink;

    @FindBy(id = "")
    WebElement loginButton;

    @FindBy(id = "")
    WebElement createAccountButton;

    @FindBy(id = "")
    WebElement iniciaSesionText;

    @FindBy(id = "")
    WebElement dontHaveAccountText;

    // ------------------------- signUpPage -------------------------

    @FindBy(id = "")
    WebElement signUpButton;

    @FindBy(id = "")
    WebElement signUpText;

    @FindBy(id = "")
    WebElement loginLink;

    @FindBy(id = "")
    WebElement alreadyHaveAccountText;

    @FindBy(id = "")
    WebElement crearCuentaText;

    //------------------------- methods -------------------------

    public void navigateTo() {
        driver.get("https://login.liverpool.com.mx/u/login");
    }

    private void setEmail(String email) {
        enterText(emailTextBox, email);
    }

    private void setPassword(String password) {
        enterText(passwordTextBox, password);
    }

    private void clickLoginButton() {
        clickElement(loginButton);
    }

    public void clickCreateAccountButton() {
        clickElement(createAccountButton);
    }

    public void clickAppleLoginButton() {
        clickElement(continueWithAppleButton);
    }

    public void clickFacebookLoginButton() {
        clickElement(continueWithFacebookButton);
    }

    public void clickForgotPasswordLink() {
        clickElement(forgotPasswordLink);
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

    private void clickSignUpButton() {
        clickElement(signUpButton);
    }


    public void logIn(String email, String password){
        setEmail(email);
        setPassword(password);
        clickLoginButton();
    }

    public void signUp(String email, String password){
        setEmail(email);
        setPassword(password);
        clickSignUpButton();
    }




}

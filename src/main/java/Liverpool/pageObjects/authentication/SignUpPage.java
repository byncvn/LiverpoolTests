package Liverpool.pageObjects.authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BaseAuthenticationPage{

    WebDriver driver;


    public SignUpPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ------------------------- commons elements -------------------------

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

    @FindBy(id = "input-user__name")
    WebElement nameBox;

    @FindBy(id = "input-user__apaterno")
    WebElement lastNameBox;

    @FindBy(id = "daySelectorLabel")
    WebElement birthDayMenu;

    @FindBy(id = "monthSelectorLabel")
    WebElement birthMonthMenu;

    @FindBy(id = "yearSelectorLabel")
    WebElement birthYearMenu;

    @FindBy(id = "male")
    WebElement maleGenderRadioButton;

    @FindBy(xpath = "*//button[text()='Crear cuenta']")
    WebElement crearCuentaButton;

    @FindBy(id = "phone")
    WebElement phoneNumberField;

    @FindBy(id = "")
    WebElement verificationCodeField;

    // ------------------------- methods -------------------------

    private void clickSignUpButton() {
        clickElement(signUpButton);
    }

    public void signUp(String email, String password) {
        setEmail(email);
        setPassword(password);
        clickSignUpButton();
    }

    public LoginPage clickLoginLink() {
        clickElement(loginLink);
        return new LoginPage(driver);
    }
}

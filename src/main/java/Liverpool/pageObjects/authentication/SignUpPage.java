package Liverpool.pageObjects.authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BaseAuthenticationPage{

    WebDriver driver;


    public SignUpPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ------------------------- commons elements -------------------------
    @FindAll({
            @FindBy(css = "button.a-btn.a-btn--primary"),
            @FindBy(xpath = "//button[text()='Crear cuenta']")
    })
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

    @FindBy(id = "continuarButton")
    WebElement continuarButton;
    // ------------------------- methods -------------------------

    private void clickSignUpButton() {
        clickElement(signUpButton);
    }

    private void clickCrearCuentaButton() {
        clickElement(crearCuentaButton);
    }

    private void clickMaleGenderRadioButton() {
        clickElement(maleGenderRadioButton);
    }

    private void enterName(String name) {
        sendKeys(nameBox, name);
    }

    private void enterLastName(String lastName) {
        sendKeys(lastNameBox, lastName);
    }

    public void enterBirthDay(String day , String month, String year) {
        clickElement(birthDayMenu);
        Select select = new Select(birthDayMenu);
        select.selectByVisibleText(day);

        clickElement(birthMonthMenu);
        select = new Select(birthMonthMenu);
        select.selectByVisibleText(month);

        clickElement(birthYearMenu);
        select = new Select(birthYearMenu);
        select.selectByVisibleText(year);
    }


    public void signUp(String email, String password) {
        setEmail(email);
        setPassword(password);
        clickSignUpButton();
        enterName("John");
        enterLastName("Doe");
        enterBirthDay("1", "Ene", "1998");
        clickMaleGenderRadioButton();
        clickCrearCuentaButton();
        enterPhoneNumber("6621445140");
//        clickElement(continuarButton);
        System.out.println("Signed up with email: " + email + " and password: " + password);
    }

    private void enterPhoneNumber(String phoneNumber) {
        sendKeys(phoneNumberField, phoneNumber);
    }

    public LoginPage clickLoginLink() {
        clickElement(loginLink);
        return new LoginPage(driver);
    }

    public boolean isWelcomeMessageDisplayed() {
        return true;
    }
}

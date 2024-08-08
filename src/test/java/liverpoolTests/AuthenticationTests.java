package liverpoolTests;

import Liverpool.pageObjects.authentication.LoginPage;
import Liverpool.pageObjects.authentication.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AuthenticationTests extends BaseTest {

    public LoginPage loginPage;
    public String validEmail = "ducegifi@rungel.net\n";
    public String validPassword = "test";
    public String invalidEmail = "ducegifi@rungel.net\nducegifi@rungel.net\n";
    public String invalidPassword = "test";

    @BeforeMethod
    public void navigateToLogin() {
        loginPage = homePage.clickIniciarSesionButton();
    }

    @Test(description = "logIn happy path")
    public void logIn() {
        loginPage.logIn(validEmail, validPassword);
        Assert.assertTrue(loginPage.isWrongCredentialsSpanDisplayed(), "Wrong credentials message is not displayed");
    }

    @Test(description = "login with invalid credentials")
    public void logInWithInvalidCredentials() {
        //TODO: Assert that the user is logged in

        //login with invalid password
        loginPage.logIn(validEmail, "");

        //login with invalid email
        loginPage.logIn(invalidEmail, validPassword);

        //login with invalid email and password
        loginPage.logIn(invalidEmail, invalidPassword);

        //login with empty email
        loginPage.logIn("", "");

        //login with empty password
        loginPage.logIn(validEmail, "");
    }

    @Test(description = "signUp happy path")
    public void signUp() {
        SignUpPage signUpPage = loginPage.clickCreateAccountButton();
        signUpPage.signUp(validEmail, validPassword);
        //TODO: Assert that the user is logged in
    }

    @Test(description = "signUp with invalid credentials")
    public void signUpWithInvalidCredential() {
        //TODO: Assert that the user is logged in
        SignUpPage signUpPage = loginPage.clickCreateAccountButton();

        //signUp with invalid email
        signUpPage.signUp(invalidEmail, validPassword);

        //signUp with invalid password
        signUpPage.signUp(invalidEmail, validPassword);

        //signUp with invalid email and password
        signUpPage.signUp(invalidEmail, validPassword);

        //signUp with empty email
        signUpPage.signUp(invalidEmail, validPassword);

        //signUp with empty password
    }

    @Test(description = "test description")
    public void testName() {
        SignUpPage signUpPage = loginPage.clickCreateAccountButton();
        signUpPage.clickContinueWithAppleButton();
        Assert.assertTrue(true, "String message");

    }

}

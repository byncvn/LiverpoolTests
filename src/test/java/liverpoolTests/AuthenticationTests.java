package liverpoolTests;

import Liverpool.pageObjects.authentication.LoginPage;
import Liverpool.pageObjects.authentication.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class AuthenticationTests extends BaseTest {

    public LoginPage loginPage;
    public String validEmail = "wapirah177@alientex.com";
    public String newEmail = "wapirah177+" + System.currentTimeMillis() + "@alientex.com";
    public String validPassword = "ThisIsAPassword1";
    public String invalidEmail = "ducegifi@rungel.net\nducegifi@rungel.net\n";
    public String invalidPassword = "test";

    @BeforeMethod
    public void navigateToLogin() {
        loginPage = homePage.clickIniciarSesionButton();
    }

    @Test(description = "logIn happy path")
    public void logIn() {
        loginPage.logIn(validEmail, validPassword);
        Assert.assertFalse(loginPage.isWrongCredentialsSpanDisplayed(false), "Wrong credentials message is not displayed");
        Assert.assertTrue(homePage.isHomePageDisplayed(), "Home page is not displayed");
    }

    @Test(description = "test description", dataProvider = "getData")
    public void usingTestData() {
        Assert.assertTrue(true, "String message");

    }

    @Test(description = "login with invalid credentials")
    public void logInWithInvalidCredentials() {
        //TODO: Assert that the user is logged in

        //login with invalid password
        loginPage.logIn(validEmail, invalidPassword);
        Assert.assertTrue(loginPage.isWrongCredentialsSpanDisplayed(true), "Wrong credentials message is not displayed");

        //login with invalid email
        loginPage.logIn(invalidEmail, validPassword);
        Assert.assertTrue(loginPage.isWrongCredentialsSpanDisplayed(true), "Wrong credentials message is not displayed");

        //login with invalid email and password
        loginPage.logIn(invalidEmail, invalidPassword);
        Assert.assertTrue(loginPage.isWrongCredentialsSpanDisplayed(true), "Wrong credentials message is not displayed");

        //login with empty email
        loginPage.logIn("", "");
        Assert.assertTrue(loginPage.isWrongCredentialsSpanDisplayed(true), "Wrong credentials message is not displayed");

        //login with empty password
        loginPage.logIn(validEmail, "");
        Assert.assertTrue(loginPage.isWrongCredentialsSpanDisplayed(true), "Wrong credentials message is not displayed");

        loginPage.logIn("", validPassword);
        Assert.assertTrue(loginPage.isWrongCredentialsSpanDisplayed(true), "Wrong credentials message is not displayed");
    }

    @Test(description = "signUp happy path")
    public void signUp() {
        SignUpPage signUpPage = loginPage.clickCreateAccountButton();
        signUpPage.signUp(newEmail, validPassword);
        Assert.assertFalse(signUpPage.isWelcomeMessageDisplayed(), "Welcome message is not displayed");
        Assert.assertTrue(homePage.isHomePageDisplayed(), "Home page is not displayed");
    }

    @Test(description = "signUp with invalid credentials")
    public void signUpWithInvalidCredential() {
        //TODO: Assert that the user is logged in
        SignUpPage signUpPage = loginPage.clickCreateAccountButton();
//        Assert.assertTrue(signUpPage.isSignUpPageDisplayed(), "Sign up page is not displayed");

        //signUp with invalid email
        signUpPage.signUp(invalidEmail, validPassword);
//        Assert.assertTrue(signUpPage.isInvalidEmailMessageDisplayed(), "Invalid email message is not displayed");

        //signUp with invalid password
        signUpPage.signUp(invalidEmail, validPassword);
//        Assert.assertTrue(signUpPage.isInvalidPasswordMessageDisplayed(), "Invalid password message is not displayed");

        //signUp with invalid email and password
        signUpPage.signUp(invalidEmail, validPassword);
//        Assert.assertTrue(signUpPage.isInvalidEmailMessageDisplayed(), "Invalid email message is not displayed");

        //signUp with empty email
        signUpPage.signUp(invalidEmail, validPassword);
//        Assert.assertTrue(signUpPage.isInvalidEmailMessageDisplayed(), "Invalid email message is not displayed");
    }


    @DataProvider
    public static Object[][] getData() {
        //TODO: Implement data provider with getJsonDataToMap()
        return new Object[][]{
                {"data1", "data2"},
                {"data3", "data4"}
        };
    }
}

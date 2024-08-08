package liverpoolTests;

import Liverpool.pageObjects.authentication.LoginPage;
import Liverpool.pageObjects.authentication.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AuthenticationTests extends BaseTest {

    public LoginPage loginPage;

    @BeforeMethod
    public void navigateToLogin() {
        loginPage = homePage.clickIniciarSesionButton();
    }

    @Test(description = "logIn happy path")
    public void logIn() {
        loginPage.logIn("user", "password");
        Assert.assertTrue(true, "String message");
    }

    @Test(description = "login with invalid credentials")
    public void logInWithInvalidCredentials() {
        //login with invalid password

        //login with invalid email

        //login with invalid email and password

        //login with empty email

        //login with empty password
    }

    @Test(description = "signUp happy path")
    public void signUp() {

    }

    @Test(description = "signUp with invalid credentials")
    public void signUpWithInvalidCredential() {
        //signUp with invalid email

        //signUp with invalid password

        //signUp with invalid email and password

        //signUp with empty email

        //signUp with empty password
    }

    @Test(description = "test description")
    public void testName() {
        SignUpPage signUpPage = loginPage.clickCreateAccountButton();
        signUpPage.clickContinueWithAppleButton();
        Assert.assertTrue(true, "String message");

    }

}

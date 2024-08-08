package liverpoolTests;

import Liverpool.pageObjects.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
//    public LandingPage landingPage;

    public WebDriver initializeDriver() {
        //using Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

//TODO: handle multiple browsers

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    @BeforeMethod
    public void launch() {
        driver = initializeDriver();
        HomePage homePage = new HomePage(driver);
        homePage.navigateTo();
    }

    @AfterMethod
    public void tearDown() {

    }

}

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
    public HomePage homePage;

    public WebDriver initializeDriver() {
        //using Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

//TODO: handle multiple browsers

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }

    @BeforeMethod
    public HomePage launch() {
        driver = initializeDriver();
        homePage = new HomePage(driver);
        homePage.navigateTo();
        return homePage;
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}

package liverpoolTests;

import Liverpool.pageObjects.HomePage;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

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

    //TODO: handle multiple data types
    public List<HashMap<String, String>> getJasonDataToMap (String filePath) {
        return null;
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

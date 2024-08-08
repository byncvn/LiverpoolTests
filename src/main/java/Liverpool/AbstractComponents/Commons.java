package Liverpool.AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Commons {

    WebDriver driver;

    public Commons(WebDriver driver) {
        this.driver = driver;
    }
    
}

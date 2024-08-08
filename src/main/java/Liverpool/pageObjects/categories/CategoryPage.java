package Liverpool.pageObjects.categories;

import Liverpool.AbstractComponents.Commons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CategoryPage extends Commons {

    WebDriver driver;

    public CategoryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "")
    WebElement button1;

    @FindBy(id = "")
    WebElement button2;

    @FindBy(id = "")
    WebElement button3;

    @FindBy(id = "")
    WebElement button4;

    @FindBy(xpath = "//*[@id=\"categories-sidebarMenu\"]/div/div")
    List<WebElement> categoriesList;


    //------------------------- methods -------------------------

    public void printCategories() {
        for (WebElement category : categoriesList) {
            System.out.println(category.getText());
        }
    }

    public void method2() {
    }

    public void method3() {
    }

    public void method4() {
    }

    public void method5() {
    }
}

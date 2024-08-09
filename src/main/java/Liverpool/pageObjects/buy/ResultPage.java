package Liverpool.pageObjects.buy;

import Liverpool.pageObjects.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultPage extends BasePage {

    WebDriver driver;

    public ResultPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "brand-HISENSE")
    WebElement hisenseFilter;

    @FindBy(id = "variants.normalizedSize-32 pulgadas")
    WebElement size32Filter;

    @FindBy(id = "variants.prices.sortPrice-2000-5000")
    WebElement price200To500Filter;

    @FindBy(id = "searchBrand")
    WebElement searchBrand;

    @FindBy(xpath = "//*[@id=\"categories-sidebarMenu\"]/div/div")
    List<WebElement> categoriesList;

    @FindBy(css = "card-title a-card-description")
    List<WebElement> results;

    //------------------------- methods -------------------------

    public void printCategories() {
        for (WebElement category : categoriesList) {
            System.out.println(category.getText());
        }
    }

    public void clickHisenseFilter() {
        enterText(searchBrand, "Hisense");
        scrollToElement(hisenseFilter);
        clickElement(hisenseFilter);
        try {
            waitFor(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clicksSize32Filter() {
        scrollToElement(size32Filter);
        clickElement(size32Filter);
        try {
            waitFor(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setPriceFilter2000To5000() {
        scrollToElement(price200To500Filter);
        clickElement(price200To500Filter);
        try {
            waitFor(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void getResults() {
        for (WebElement result : results) {
            System.out.println("--------------- Result -------------------");
            System.out.println(result.getText());
        }
    }
}

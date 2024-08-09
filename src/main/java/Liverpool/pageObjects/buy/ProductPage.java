package Liverpool.pageObjects.buy;

import Liverpool.pageObjects.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //------------------------- elements -------------------------

    @FindBy(id = "opc_pdp_buyNowButton")
    WebElement buyNowButton;

    @FindBy(id = "opc_pdp_addCartButton")
    WebElement addCartButton;

    //------------------------- methods -------------------------

    public void clickBuyNowButton() {
        clickElement(buyNowButton);
    }

    public void clickAddCartButton() {
        clickElement(addCartButton);
    }


}

package Liverpool.pageObjects.commons;

import Liverpool.AbstractComponents.SeleniumUtils;
import Liverpool.pageObjects.authentication.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage extends SeleniumUtils {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // ------------------------- elements -------------------------

    // ------------------------- Header -------------------------
    @FindBy(id = "")
    WebElement logo;

    @FindBy(id = "mainSearchbar")
    WebElement searchBar;

    @FindBy(className = "icon-zoom")
    WebElement searchButton;

    @FindBy(className = "sessionMinWidth")
    WebElement iniciarSesionButton;

    @FindBy(id = "")
    WebElement misComprasButton;

    @FindBy(id = "")
    WebElement bagButton;

    // ------------------------- megaMenu -------------------------

    @FindBy(className = "m-navDesktop__menuList")
    WebElement categoryButton;

    @FindBy(className = "")
    WebElement mesaDeRegalosButton;

    @FindBy(className = "")
    WebElement miCreditoButton;

    @FindBy(className = "")
    WebElement serviciosButton;

    @FindBy(className = "")
    WebElement BYDButton;

    @FindBy(className = "")
    WebElement tiendasButton;

    @FindBy(className = "")
    WebElement ayudaButton;

    @FindBy(className = "")
    WebElement seleccionaTuTiendaButton;

    @FindBy(xpath = "//*[@id=\"categories-sidebarMenu\"]/div/div")
    List<WebElement> categoriesList;

    @FindBy(xpath = "*//a[text()='Pantallas']")
    WebElement pantallasCategory;

    // ------------------------- Footer -------------------------
    //TODO: Add footer elements
    @FindBy(className = "")
    WebElement footerElement1;


    // ------------------------- methods -------------------------
    public void clickLogo() {
        clickElement(logo);
    }

    public void clickSearchBox() {
        clickElement(searchBar);
    }

    public void clickSearchButton() {
        clickElement(searchButton);
    }

    public void clickMisComprasButton() {
        clickElement(misComprasButton);
    }

    public LoginPage clickIniciarSesionButton() {
        clickElement(iniciarSesionButton);
        return new LoginPage(driver);
    }

    public void clickBagButton() {
        clickElement(bagButton);
    }

    public void clickCategoryButton() {
        clickElement(categoryButton);
    }

    public void clickMesaDeRegalosButton() {
        clickElement(mesaDeRegalosButton);
    }

    public void clickMiCreditoButton() {
        clickElement(miCreditoButton);
    }

    public void clickServiciosButton() {
        clickElement(serviciosButton);
    }

    public void clickBYDButton() {
        clickElement(BYDButton);
    }

    public void clickTiendasButton() {
        clickElement(tiendasButton);
    }

    public void clickAyudaButton() {
        clickElement(ayudaButton);
    }

    public void clickSeleccionaTuTiendaButton() {
        clickElement(seleccionaTuTiendaButton);
    }
}

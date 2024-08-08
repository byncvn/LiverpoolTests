package Liverpool.pageObjects;
import Liverpool.pageObjects.commons.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
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

    @FindBy(id = "")
    WebElement button5;


    //------------------------- methods -------------------------

    public void navigateTo() {
        driver.get("https://www.liverpool.com.mx/tienda/home");
    }

/*
    public void printCategories() {
        for (WebElement category : categoriesList) {
            String option = category.getText();
            switch (option){
                case "Mujer":
                    break;
                case "Hombre":
                    break;
                case "Niños y Niñas":
                    break;
                case "Bebés 0 meses a 4 años":
                    break;
                case "Zapatos":
                    break;
                case "Belleza":
                    break;
                case "Relojes, Lentes y Joyería":
                    break;
                case "Deportes":
                    break;
                case "Electrónica":
                    break;
                case "Hogar":
                    break;
                case "Línea Blanca y Electrodomésticos":
                    break;
                case "Muebles":
                    break;
                case "Juguetes":
                    break;
                case "Videojuegos":
                    break;
                case "Autos y Motos":
                    break;
                case "Vinos y Gourmet":
                    break;
                case "Mascotas":
                    break;
                case "Librería y Papelería":
                    break;
                case "Outlet Liverpool":
                    break;
                case "Regreso a Clases":
                    break;

            }
            System.out.println(category.getText());
        }


    }

*/
    public void method1() {
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

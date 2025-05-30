package liverpoolTests;

import Liverpool.pageObjects.buy.Categories;
import Liverpool.pageObjects.buy.ProductPage;
import Liverpool.pageObjects.buy.ResultPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class BuyTest extends BaseTest{

    @Test(description = "test description", dataProvider = "getData")
    public void buyTv() {
        homePage.login("user", "password");
        ResultPage resultPage = homePage.selectCategory(Categories.PANTALLAS);
        resultPage.clickHisenseFilter();
        resultPage.clicksSize32Filter();
        resultPage.setPriceFilter2000To5000();
        resultPage.printResults();
        ProductPage productPage = resultPage.clickResult(1);
        productPage.clickBuyNowButton();

        //implement the rest of the test


        Assert.assertTrue(true, "String message");

    }


}

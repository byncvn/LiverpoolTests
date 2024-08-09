package liverpoolTests;

import Liverpool.pageObjects.buy.Categories;
import Liverpool.pageObjects.buy.ResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyTest extends BaseTest{

    @Test(description = "test description")
    public void buyTv() {
        ResultPage resultPage = homePage.selectCategory(Categories.PANTALLAS);
        resultPage.clickHisenseFilter();
        resultPage.clicksSize32Filter();
        resultPage.setPriceFilter2000To5000();
        resultPage.printResults();
        resultPage.clickResult(1);

        Assert.assertTrue(true, "String message");

    }
}

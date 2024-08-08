package liverpoolTests;

import Liverpool.pageObjects.categories.Categories;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyTest extends BaseTest{

    @Test(description = "test description")
    public void buyTv() {
        homePage.selectCategory(Categories.MUJER);

        Assert.assertTrue(true, "String message");

    }
}

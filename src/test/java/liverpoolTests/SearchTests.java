package liverpoolTests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTests extends BaseTest{

    @BeforeMethod
    public void methodName() {

    }

    @Test(description = "searchSomething")
    public void searchSomething() {
        homePage.search("apple");
        Assert.assertTrue(true);
    }

    @Test(description = "test description")
    public void checkSearchResults() {
        homePage.search("apple", false);
        Assert.assertTrue(true, "String message");

    }
}

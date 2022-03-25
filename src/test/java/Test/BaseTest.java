package Test;

import Framework.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void beforeTest()
    {
        System.out.println("beforeTest");
        Browser.Get();
    }

    @AfterMethod
    public void afterTest()
    {
        System.out.println("afterTest");
        Browser.Close();
    }
}

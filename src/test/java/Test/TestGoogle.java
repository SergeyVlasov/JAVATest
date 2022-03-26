package Test;

import Framework.Browser;
import POM.ResultPage;
import POM.SearchPage;
import Utils.DataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.Iterator;

public class TestGoogle {

    @DataProvider(name="text")
    public static Iterator<Object[]> dbData() throws IOException {
        //return new Object[][] {
        //        {"ololoe"},
        //        {"pololoe"}
        //};
        return DataReader.readCsv();
    }

    @BeforeMethod
    public void beforeTest()
    {
        System.out.println("beforeTest");
        Browser.Get();
    }

    @Test (dataProvider = "text")
    public void test1(String txt)
    {
        Browser.GoToURL("https://google.com");
        SearchPage searchPage = PageFactory.initElements(Browser.Get(), SearchPage.class);
        searchPage.sendText(txt);
        searchPage.clickElement();
        ResultPage resultPage = PageFactory.initElements(Browser.Get(), ResultPage.class);
        Assert.assertTrue(resultPage.allResultsLinkExist(), "result page did not not load");
    }

    @AfterMethod
    public void afterTest()
    {
        System.out.println("afterTest");
        Browser.Close();
    }
}

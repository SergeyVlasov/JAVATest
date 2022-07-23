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

public class TestGoogle extends BaseTest {

    //@DataProvider(name="text", parallel=true)
    @DataProvider(name="text")
    public static Iterator<Object[]> dbData() throws IOException {
        return DataReader.readCsv("TestData.csv");
    }


    @Test (dataProvider = "text")
    public void test1(String txt)
    {
        Browser.GoToURL("https://google.com");
        SearchPage searchPage = new SearchPage();
        searchPage
                .sendText(txt)
                .clickElement();
        ResultPage resultPage = new ResultPage();
        Assert.assertTrue(resultPage.allResultsLinkExist(), "result page did not not load");
    }
}

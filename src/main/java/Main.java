import Framework.Browser;
import POM.ResultPage;
import POM.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Main{
    public static void main(String[] args) {
        try {
            Browser.GoToURL("https://google.com");
            SearchPage searchPage = PageFactory.initElements(Browser.Get(), SearchPage.class);
            searchPage.sendText("ololo");
            searchPage.clickElement();
            ResultPage resultPage = PageFactory.initElements(Browser.Get(), ResultPage.class);
            Assert.assertTrue(resultPage.allResultsLinkExist(), "result page did not not load");
        }
        finally {
            Browser.Close();
        }
    }
}
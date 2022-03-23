import Framework.Browser;
import Framework.BrowserFactory;
import POM.SearchPage;
import org.openqa.selenium.support.PageFactory;

public class Main {
    public static void main(String[] args){
        BrowserFactory.Instance().GetBrowser();
        Browser.GoToURL("https://google.com");
        SearchPage searchPage = PageFactory.initElements(BrowserFactory.Instance().GetBrowser(), SearchPage.class);
        searchPage.sendText("ololo");
        searchPage.clickElement();
        System.out.println(Browser.GetURL());
        BrowserFactory.Instance().CloseBrowser();
    }
}
import org.openqa.selenium.*;
import Driver.Browser;
import Driver.BrowserFactory;
import POM.SearchPage;

import java.util.List;

public class Main {
    public static void main(String[] args){
        BrowserFactory.Instance().GetBrowser();
        Browser.GoToURL("https://google.com");
        SearchPage searchPage = new SearchPage();
        searchPage.SendText("ololo");
        searchPage.ClickSearchButton();
        System.out.println(Browser.GetURL());
        BrowserFactory.Instance().CloseBrowser();
    }
}
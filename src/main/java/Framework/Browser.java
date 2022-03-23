package Framework;

import org.openqa.selenium.WebDriver;

public class Browser {
    public static WebDriver Get(){
        return BrowserFactory.Instance().GetBrowser();
    }
    public static void GoToURL(String url){
        BrowserFactory.Instance().GetBrowser().get(url);
    }
    public static String GetURL(){
        return BrowserFactory.Instance().GetBrowser().getCurrentUrl();
    }
}

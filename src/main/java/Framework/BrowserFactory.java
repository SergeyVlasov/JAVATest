package Framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
    private static BrowserFactory instance = null;
    private WebDriver driver;

    public static BrowserFactory Instance(){
        if (instance == null){
            instance = new BrowserFactory();
        }
        return instance;
    }

    public static synchronized BrowserFactory getInstance() {
        if (instance == null) {
            instance = new BrowserFactory();
        }
        return instance;
    }

    public WebDriver GetBrowser(){
        if (driver == null){
            WebDriver driver;
            WebDriverManager.chromedriver().setup();
            this.driver = new ChromeDriver();
        }
        return driver;
    }

    public void CloseBrowser()
    {
        if (instance == null)
        {
            return;
        }
        driver.quit();
        //_driver.Dispose();
        instance = null;
    }
}

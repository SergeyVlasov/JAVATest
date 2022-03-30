package Framework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactoryThreadSafe {
    private static volatile BrowserFactoryThreadSafe instance;
    private WebDriver driver;

    public static BrowserFactoryThreadSafe Instance() {
        BrowserFactoryThreadSafe localInstance = instance;
        if (localInstance == null) {
            synchronized (BrowserFactoryThreadSafe.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new BrowserFactoryThreadSafe();
                }
            }
        }
        return localInstance;
    }
    public WebDriver GetBrowser(){
        if (driver == null){
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

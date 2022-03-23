package POM;

import Framework.Browser;
import org.openqa.selenium.By;

public class ResultPage {
    String xpathAllResultsLink = "//div[@class='hdtb-mitem hdtb-msel']";

    public boolean allResultsLinkExist() {
        return Browser.Get().findElements(By.xpath(xpathAllResultsLink)).size() > 0;
    }
}

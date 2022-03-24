package POM;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage {
    @FindBy(xpath = "//div[@class='hdtb-mitem hdtb-msel']")
    WebElement allResultsLink;

    public boolean allResultsLinkExist() {
        try {
            allResultsLink.getTagName();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}

package POM;

import Framework.Browser;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {
    public ResultPage(){
        PageFactory.initElements(Browser.Get(), this);
    }

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

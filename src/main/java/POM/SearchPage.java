package POM;

import Framework.Browser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public SearchPage(){
        PageFactory.initElements(Browser.Get(), this);
    }

    @FindBy(xpath = "//input[@spellcheck='false']")
    WebElement inputSearch;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")
    WebElement clickSearch;

    public void clickElement(){
        clickSearch.click();
    }

    public SearchPage sendText(String text){
        inputSearch.sendKeys(text);
        inputSearch.sendKeys(Keys.TAB);
        return this;
    }
}
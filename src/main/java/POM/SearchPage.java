package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
    @FindBy(xpath = "//input[@spellcheck='false']")
    WebElement inputSearch;

    @FindBy(xpath = "/html/body//form//div[3]/center/input[@role='button']")
    WebElement clickSearch;

    public void clickElement(){
        clickSearch.click();
    }

    public void sendText(String text){
        inputSearch.sendKeys(text);
        inputSearch.sendKeys(Keys.TAB);
    }
}
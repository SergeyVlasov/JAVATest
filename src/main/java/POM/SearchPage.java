package POM;

import Driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage {
    WebElement inputSearch = Browser.Get().findElement(By.xpath("//input[@spellcheck='false']"));
    WebElement clickSearch = Browser.Get().findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[@role='button']"));

    public void SendText(String text){
        inputSearch.sendKeys("ololo");
    }

    public void ClickSearchButton() {
        clickSearch.click();
    }
}

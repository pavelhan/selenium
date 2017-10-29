package webui;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BasePage {


    public GooglePage(WebDriver driver) {
        super(driver);
    }

    By firstResult = by(".srg .g:nth-child(1)");


    public void searchMore(String text) {
        $(By.name("q")).sendKeys(text, Keys.ENTER);
    }

    public void visit() {
        open("http://google.com");
    }

    public void followFirstResult(){
        $(firstResult).findElement(by(".r a")).click();
    }
}

package webui;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class GoogleTest extends BaseTest {

    GooglePage page = new GooglePage(driver);


    @Test
    public void googleSearchTest() {

        page.visit();

        page.searchMore("selenium");
        assertThat(textToBePresentInElementLocated(page.firstResult, "What you do with that power is entirely up to you."));

        page.searchMore(" chemichal element");
        assertThat(textToBePresentInElementLocated(page.firstResult, "Селе́н — химический элемент 16-й группы"));


    }


    @Test
    public void testFollowFirstResult(){
        page.visit();
        page.searchMore("selenium");
        page.followFirstResult();
        assertThat(titleIs("Selenium - Web Browser Automation"));
    }

}

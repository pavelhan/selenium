package webui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ConsiseAPI {

    public abstract WebDriver getWebDriver();

    public void assertThat(ExpectedCondition<Boolean> condition){
        (new WebDriverWait(getWebDriver(), 4)).until(condition);
    }

    public void open(String url){
        getWebDriver().get(url);
    }

    public WebElement $(By locator){
        return getWebDriver().findElement(locator);
    }

    public WebElement $(String cssSelector){
        return getWebDriver().findElement(By.cssSelector(cssSelector));
    }

}

package webui;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public abstract class ConsiseAPI {

    public abstract WebDriver getWebDriver();


    public void assertThat(ExpectedCondition<Boolean> condition){
        (new WebDriverWait(getWebDriver(), 4)).until(condition);
    }

    public <V> V assertThat(Function<? super WebDriver, V> condition){
        return (new WebDriverWait(getWebDriver(), 4)).until(condition);
    }

    public void open(String url){
        getWebDriver().get(url);
    }

    public By byCss(String cssSelector){
        return By.cssSelector(cssSelector);
    }

    public By by(String cssSelector){
        return byCss(cssSelector);
    }

    public WebElement $(By locator){
        return assertThat(visibilityOfElementLocated(locator));
    }

    public WebElement $(String cssSelector){
        return $(By.cssSelector(cssSelector));
    }

}

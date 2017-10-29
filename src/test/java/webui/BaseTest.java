package webui;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest extends ConsiseAPI {

    static WebDriver driver;


    public BaseTest(){
        System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // page = new GooglePage(driver);
    }


    public WebElement searchField(){
        return driver.findElement(By.name("q"));
    }

    public WebElement firstResult(){
        return driver.findElement(By.cssSelector(".srg .g:nth-child(1)"));
    }

    @Override
    public WebDriver getWebDriver() {
        return driver;
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}

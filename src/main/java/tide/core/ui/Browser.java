package tide.core.ui;

import org.openqa.selenium.By;
import tide.core.ui.cookie.Cookies;
import org.openqa.selenium.WebDriver;
import tide.core.ui.interaction.Click;
import tide.core.ui.interaction.SendKeys;
import tide.core.ui.interaction.Wait;
import tide.core.ui.interaction.WaitForElement;

public class Browser {
    WebDriver driver;

    Browser(WebDriver driver) {
        this.driver = driver;
    }
    public WebDriver getDriver(){
        return driver;
    }

    public static Browser init(WebDriver driver) {
        return new Browser(driver);
    }

    public Cookies cookie() {
        return new Cookies(driver);
    }

    public void waitABit(int timeInSecond){
        new Wait(driver).aBit(timeInSecond);
    }
    public WaitForElement waitFor(By by){
        return new WaitForElement(driver, by);
    }

    public SendKeys sendKeys(String value){
        return new SendKeys(driver,value);
    }

    public Click click(){
        return new Click(driver);
    }

}

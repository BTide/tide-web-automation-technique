package tide.core;

import org.openqa.selenium.By;
import tide.core.cookie.Cookies;
import org.openqa.selenium.WebDriver;
import tide.core.interaction.Click;
import tide.core.interaction.SendKeys;
import tide.core.interaction.Wait;
import tide.core.interaction.WaitForElement;

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

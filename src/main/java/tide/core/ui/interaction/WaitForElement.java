package tide.core.ui.interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitForElement extends BrowserInteraction {
    WebDriverWait wait;
    By by;

    public WaitForElement(WebDriver driver, By by) {
        super(driver);
        this.by = by;
    }

    public WebElement visible(Duration timeOut) {
        wait = new WebDriverWait(driver,timeOut);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement visible() {
        return visible(timeOut);
    }


    public WebElement clickable(){
        wait = new WebDriverWait(driver, timeOut);

        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement enable(){
        wait = new WebDriverWait(driver, timeOut);

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}

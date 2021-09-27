package tide.core.interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click extends BrowserInteraction {

    public  Click(WebDriver driver) {
        super(driver);
    }

    public WebElement on(By by){
        WebElement element = browser.waitFor(by).clickable();
        element.click();

        return element;
    }
}

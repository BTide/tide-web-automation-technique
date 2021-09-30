package tide.core.ui.interaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendKeys extends BrowserInteraction {
    String textValue;

    public SendKeys(WebDriver driver, String textValue) {
        super(driver);
        this.textValue = textValue;
    }

    public WebElement into(By by) {
        WebElement element = browser.waitFor(by).clickable();
        element.sendKeys(textValue);

        return element;
    }

}

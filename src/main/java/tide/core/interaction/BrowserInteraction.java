package tide.core.interaction;

import org.openqa.selenium.WebDriver;
import tide.core.Browser;

import java.time.Duration;

public class BrowserInteraction {
    protected Duration timeOut = Duration.ofSeconds(60);
    WebDriver driver;
    Browser browser;

    BrowserInteraction(WebDriver driver){
        this.driver = driver;
        browser = Browser.init(driver);
    }
}

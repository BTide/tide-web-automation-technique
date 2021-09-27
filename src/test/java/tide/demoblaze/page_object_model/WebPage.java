package tide.demoblaze.page_object_model;

import org.openqa.selenium.WebDriver;
import tide.core.Browser;

public class WebPage {
    protected WebDriver driver;
    protected Browser browser;

    WebPage(WebDriver driver) {
        this.driver = driver;
        this.browser = Browser.init(driver);
    }
}

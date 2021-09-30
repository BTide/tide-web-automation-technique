package tide.demoblaze.page_object_model;

import org.openqa.selenium.WebDriver;
import tide.core.ui.Browser;

public class WebPage {
    protected Browser browser;
    protected WebDriver driver;

    WebPage(WebDriver driver) {
        this.browser = Browser.init(driver);
        this.driver = driver;
    }
}

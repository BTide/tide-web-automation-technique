package tide.demoblaze.page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BasePage extends WebPage {
    protected By loginBtn = By.id("login2");
    protected LoginPopup loginPopup = new LoginPopup(driver);

    BasePage(WebDriver driver) {
        super(driver);
    }

}

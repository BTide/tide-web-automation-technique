package tide.demoblaze.page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tide.core.ui.Browser;


public class BasePage extends WebPage {
    protected By loginBtn = By.id("login2");
    protected By nameOfUser = By.id("nameofuser");
    protected LoginPopup loginPopup = new LoginPopup(driver);

    BasePage(WebDriver driver) {
        super(driver);
    }

}

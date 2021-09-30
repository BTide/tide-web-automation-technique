package tide.demoblaze.page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tide.core.ui.Browser;

public class LoginPopup extends WebPage {
    public By usernameInput = By.id("loginusername");
    public By passwordInput = By.id("loginpassword");
    public By loginBtn = By.xpath("//button[text()='Log in']");

    LoginPopup(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        browser.sendKeys(username).into(usernameInput);
        browser.sendKeys(password).into(passwordInput);
        browser.click().on(loginBtn);
    }

}

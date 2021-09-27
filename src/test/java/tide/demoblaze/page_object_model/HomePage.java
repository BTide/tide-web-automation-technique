package tide.demoblaze.page_object_model;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage extends BasePage {
    public By slide = By.id("carouselExampleIndicators");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage access() {
        driver.navigate().to("https://www.demoblaze.com/");

        return this;
    }

    public HomePage login(String username, String password) {
        browser.click().on(loginBtn);
        loginPopup.login(username, password);
        return this;
    }

    public HomePage verifyIsDisplayed() {
        Duration shortTimeOut = Duration.ofSeconds(10);
        boolean isDisplayed = browser.waitFor(slide).visible(shortTimeOut).isDisplayed();

        Assertions.assertTrue(isDisplayed);

        return this;
    }
}

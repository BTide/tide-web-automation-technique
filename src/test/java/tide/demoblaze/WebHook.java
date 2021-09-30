package tide.demoblaze;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import tide.core.ui.Browser;
import tide.core.ui.driver.Driver;
import tide.core.ui.driver.DriverInformation;
import tide.demoblaze.page_object_model.HomePage;

public class WebHook {
    protected WebDriver driver;
    protected Browser browser;
    protected HomePage homePage;

    @BeforeAll
    public static void oneTimeSetup() {
    }

    @BeforeEach
    public void SetupEach() {
        driver = Driver.getDriver();
        browser = Browser.init(driver);
        homePage = new HomePage(driver);
    }

    @AfterEach
    public void TearDownEach() {
       driver.quit();
    }
}

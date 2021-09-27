package tide.demoblaze;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import tide.common.DriverHelper;
import tide.core.driver.DriverFactory;
import tide.core.models.driver.DriverInformation;
import tide.demoblaze.page_object_model.HomePage;

public class WebHook {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeAll
    public static void oneTimeSetup() {
        DriverHelper.setPath();
    }

    @BeforeEach
    public void SetupEach() {
        driver = DriverFactory.getDriver(DriverInformation.EDGE_LOCAL);
        homePage = new HomePage(driver);
    }

    @AfterEach
    public void TearDownEach() {
       driver.quit();
    }
}

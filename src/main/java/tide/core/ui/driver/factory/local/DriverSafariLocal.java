package tide.core.ui.driver.factory.local;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import tide.core.ui.driver.DriverInformation;

public class DriverSafariLocal {
    public static WebDriver getDriver(){
        return new SafariDriver();
    }
}

package tide.core.ui.driver.factory.local;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tide.core.ui.driver.DriverInformation;

public class DriverChromeLocal  {
    public static WebDriver getDriver(){
        return new ChromeDriver();
    }
}

package tide.core.driver.local;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import tide.core.models.driver.DriverInformation;

public class DriverEdgeLocal {
    public static WebDriver getDriver(DriverInformation driverInformation){
        return new EdgeDriver();
    }
}

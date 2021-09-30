package tide.core.ui.driver.factory.local;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import tide.core.ui.driver.DriverInformation;

public class DriverEdgeLocal {
    public static WebDriver getDriver(){
        return new EdgeDriver();
    }
}

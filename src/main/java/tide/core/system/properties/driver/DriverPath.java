package tide.core.system.properties.driver;

import org.openqa.selenium.remote.BrowserType;
import tide.core.system.Systems;
import tide.core.system.operating_system.OSType;
import tide.core.ui.driver.Driver;

import static org.openqa.selenium.remote.BrowserType.*;

public class DriverPath {
    private static String driverPath = "src/main/resources/driver/%s/%s/%s";

    public static void set(String browserName){
        OSType osType = Systems.os().getType();
        String driverFileName = DriverFileName.get(browserName);

        if(browserName.equals(BrowserType.SAFARI)){
            //No need driver for safari
            return;
        }

        if(osType.equals(OSType.Windows)){
            driverFileName+=".exe";
        }

        driverPath = String.format(driverPath, osType.getName(),browserName,driverFileName);
        Driver.property().setDriver(browserName, driverPath);
    }

    private void setDriver(String browserType, String path){
         switch (browserType){
             case CHROME:
                 setChromeDriver(path);
                 break;
             case FIREFOX:
                 setFirefoxDriver(path);
                 break;

             case EDGE:
                 setEdgeDriver(path);
                 break;
         }
    }

    private void setChromeDriver(String chromeDriverPath){
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
    }
    private void setFirefoxDriver(String firefoxDriverPath){
        System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
    }
    private void setEdgeDriver(String edgeDriverPath){
        System.setProperty("webdriver.edge.driver", edgeDriverPath);
    }
}

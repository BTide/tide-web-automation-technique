package tide.common;

import org.openqa.selenium.remote.BrowserType;
import tide.core.system.Systems;
import tide.core.system.operating_system.OSType;
import tide.core.system.properties.driver.DriverFileName;

public class DriverHelper {
    private static String driverPath = "src/main/resources/driver/%s/%s/%s";
    public static void setPath(String browserName){
        OSType osType = Systems.os().getType();
        String driverFileName = DriverFileName.get(browserName);

        if(browserName.equals(BrowserType.SAFARI)){
            //No need driver for safari
            return;
        }

        if(osType.equals(OSType.Windows)){
            driverFileName+=".exe";
        }


    }

}

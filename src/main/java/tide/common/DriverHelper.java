package tide.common;

import tide.core.driver.DriverPath;

public class DriverHelper {
    private static String chromeDriverPath = "src/main/resources/driver/chrome/chromedriver.exe";
    private static String firefoxDriverPath = "src/main/resources/driver/firefox/geckodriver.exe";
    private static String edgeDriverPath = "src/main/resources/driver/edge/msedgedriver.exe";
    public static void setPath(){
        DriverPath.setChromeDriver(chromeDriverPath);
        DriverPath.setFirefoxDriver(firefoxDriverPath);
        DriverPath.setEdgeDriver(edgeDriverPath);
    }
}

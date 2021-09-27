package tide.core.driver;

public class DriverPath {
    public static void setChromeDriver(String chromeDriverPath){
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
    }
    public static void setFirefoxDriver(String firefoxDriverPath){
        System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
    }
    public static void setEdgeDriver(String edgeDriverPath){
        System.setProperty("webdriver.edge.driver", edgeDriverPath);
    }
}

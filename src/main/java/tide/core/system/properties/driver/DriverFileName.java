package tide.core.system.properties.driver;

import org.openqa.selenium.remote.BrowserType;

public class DriverFileName {
    static String chrome = "chromedriver";
    static String firefox = "geckodriver";
    static String edge = "msedgedriver";

    public static String get(String browserType){
        switch (browserType){
            case BrowserType.CHROME:
                return chrome;
            case BrowserType.FIREFOX:
                return firefox;
            case BrowserType.EDGE:
                return edge;
        }

        return null;
    }

}

package tide.core.configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

    public static Properties getTideProperties(){
        String filePath = "tide.properties";
        return getProperties(filePath);
    }

    private static Properties getProperties(String filePath){
        Properties prop = new Properties();
        try {
            InputStream inputStream = new FileInputStream(filePath);
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}

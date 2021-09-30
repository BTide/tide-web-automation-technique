package tide.core.system;

import tide.core.system.operating_system.OperatingSystem;
import tide.core.system.properties.Property;

public class Systems {
    public static Property property(){
        return new Property();
    }

    public static OperatingSystem os(){
        return new OperatingSystem();
    }


}

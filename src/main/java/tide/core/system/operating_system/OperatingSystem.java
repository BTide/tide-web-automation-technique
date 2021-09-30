package tide.core.system.operating_system;

import java.util.Locale;

public class OperatingSystem {
    public static OSType detectedOS;

    public OSType getType() {
        OSType detectedOS;
            String OS = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
            if ((OS.contains("mac")) || (OS.contains("darwin"))) {
                detectedOS = OSType.MacOS;
            } else if (OS.contains("win")) {
                detectedOS = OSType.Windows;
            } else if (OS.contains("nux")) {
                detectedOS = OSType.Linux;
            } else {
                detectedOS = OSType.Other;
        }
        return detectedOS;
    }
}

package tide.core.ui.interaction;

import org.openqa.selenium.WebDriver;

public class Wait extends BrowserInteraction{
    public Wait(WebDriver driver) {
        super(driver);
    }

    public void aBit(int timeInSecond){
        long waitTime = timeInSecond* 1000L;
        try {
            driver.wait(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

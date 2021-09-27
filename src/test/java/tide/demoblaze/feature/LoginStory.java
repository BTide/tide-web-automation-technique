package tide.demoblaze.feature;

import org.junit.jupiter.api.Test;
import tide.demoblaze.WebHook;

public class LoginStory extends WebHook {

    @Test
    public void should_able_to_login() {
        homePage.access()
                .login("btide","Abc@123456")
                .verifyIsDisplayed();
    }
}

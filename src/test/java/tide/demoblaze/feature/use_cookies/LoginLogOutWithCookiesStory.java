package tide.demoblaze.feature.use_cookies;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import tide.demoblaze.WebHook;
import tide.demoblaze.model.User;

import java.util.Set;

public class LoginLogOutWithCookiesStory extends WebHook {

    @Test
    public void should_able_to_logout_with_cookies() {
        //login normally
        homePage.access()
                .login(User.VALID.getUsername(),User.VALID.getPassword())
                .verifyIsDisplayed();

        //log out by remove all cookies and refresh
        browser.cookie().deleteAll();
        browser.getDriver().navigate().refresh();

        homePage.verifyIsNotLoggedIn();
    }

    @Test
    public void should_able_to_login_with_cookies() {
        //Login normally
        homePage.access()
                .login(User.VALID.getUsername(),User.VALID.getPassword())
                .verifyIsDisplayed();

        //get cookies that is in logged in state
        Set<Cookie> cookies = browser.cookie().get();

        //remove cookies and refresh to log out
        browser.cookie().deleteAllThenRefreshWeb();
        browser.getDriver().navigate().refresh();

        homePage.verifyIsNotLoggedIn();

        //login by set the cookies that is saved before
        browser.cookie().setThenRefreshWeb(cookies);
        browser.getDriver().navigate().refresh();

        homePage.verifyIsDisplayed();
    }

}

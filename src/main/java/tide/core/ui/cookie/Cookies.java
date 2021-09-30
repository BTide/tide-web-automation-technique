package tide.core.ui.cookie;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Cookies {
    WebDriver driver;

    public Cookies(WebDriver driver) {
        this.driver = driver;
    }

    public Set<Cookie> get() {

        return driver.manage().getCookies();
    }

    public void set(Set<Cookie> cookies) {
        deleteAll();
        for (Cookie cookie : cookies) {
            driver.manage().addCookie(cookie);
        }
    }

    public void setThenRefreshWeb(Set<Cookie> cookies) {
        set(cookies);
        driver.navigate().refresh();
    }

    public void addMoreCookie(Cookie cookie) {
        driver.manage().addCookie(cookie);
    }

    public void deleteAll() {
        driver.manage().deleteAllCookies();
    }

    public void deleteAllThenRefreshWeb(){
        deleteAll();
        driver.navigate().refresh();
    }
}

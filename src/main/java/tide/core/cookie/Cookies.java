package tide.core.cookie;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Cookies {
    WebDriver driver;

    public Cookies(WebDriver driver) {
        this.driver = driver;
    }

    public Set<Cookie> get() {
        Set<Cookie> cookies = driver.manage().getCookies();

        return cookies;
    }

    public void set(Set<Cookie> cookies) {
        deleteAll();
        for (Cookie cookie : cookies) {
            driver.manage().addCookie(cookie);
        }
    }

    public void addMoreCookie(Cookie cookie) {
        driver.manage().addCookie(cookie);
    }

    public void deleteAll() {
        driver.manage().deleteAllCookies();
    }
}

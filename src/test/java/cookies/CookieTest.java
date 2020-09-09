package cookies;

import base.BaseTest;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.CookieManager;

public class CookieTest extends BaseTest {

    @Test
    public void testDeleteCookie() {

        CookieManager cookieManager = getCookieManager();

        Cookie cookie = cookieManager.getCookie("optimizelyBuckets");
        cookieManager.deleteCookie(cookie);
        Assert.assertFalse(cookieManager.isCookiePresent(cookie), "Cookie was not deleted");
    }
}

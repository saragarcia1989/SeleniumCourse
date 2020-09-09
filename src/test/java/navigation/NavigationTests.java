package navigation;

import base.BaseTest;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingExample2Page;
import pages.HomePage;

import java.sql.Driver;

public class NavigationTests extends BaseTest {

    @Test
    public void testNavigator() {
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void TestSwitchTab() {
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");

    }

    @Test
    public void TestSwitchTab2() {
        var buttonPage = homePage.clickDynamicLoading().OpenExample2InNewTab();
        getWindowManager().switchToNewTab("The Internet");
        Assert.assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }
}

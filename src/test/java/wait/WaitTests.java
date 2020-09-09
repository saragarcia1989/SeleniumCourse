package wait;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilHidden() {
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        Assert.assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

    @Test
    public void testWaitUntilTextVisible() {
        var loadingPage2 = homePage.clickDynamicLoading().clickExample2();
        loadingPage2.clickStart();
        Assert.assertEquals(loadingPage2.getLoadedText2(), "Hello World!", "Loaded text incorrect");
    }
}

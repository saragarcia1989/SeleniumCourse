package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class SliderTests extends BaseTest {

    @Test
    public void testSlide() {
        var HorizontalSliderPage = homePage.clickHorizontalSlider();
        HorizontalSliderPage.pressKeys(String.valueOf(Keys.ARROW_RIGHT).repeat(8));
        Assert.assertEquals(HorizontalSliderPage.getSliderNumber(), "4");
    }

}

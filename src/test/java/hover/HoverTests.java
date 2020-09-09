package hover;

import base.BaseTest;
import org.testng.Assert;
import org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTest {
    @Test
    public void testHoverUser1() {
        HoversPage hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        Assert.assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}

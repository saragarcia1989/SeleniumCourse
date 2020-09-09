package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTest {

    @Test
    public void testRightClick() {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickInBox();
        String displayMessage = contextMenuPage.alert_getText();
        contextMenuPage.alert_clickToAccept();
        Assert.assertEquals(displayMessage, "You selected a context menu", "Message is incorrect");
    }

}

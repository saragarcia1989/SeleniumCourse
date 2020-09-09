package frames;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

public class FrameTests extends BaseTest {

    @Test
    public void testWysiwyg() {
        WysiwygEditorPage editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.increaseIndention();
        editorPage.setTextArea(text2);

        Assert.assertEquals(editorPage.getTextFromEditor(), text1 + text2, "Text from editor is incorrect");
    }

    @Test
    public void testNestedFrames() {
        var FramesPage = homePage.clickFrames();
        var NestedFramesPage = FramesPage.clickNestedFramesLink();

        String leftFrameText = NestedFramesPage.getLeftFrameText();

        String bottomFrameText = NestedFramesPage.getBottomFrameText();

        Assert.assertEquals(leftFrameText, "LEFT", "Incorrect message 1");
        Assert.assertEquals(bottomFrameText, "BOTTOM", "Incorrect message 2");
    }
}

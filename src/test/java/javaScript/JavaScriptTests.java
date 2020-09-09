package javaScript;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class JavaScriptTests extends BaseTest {

    @Test
    public void testScrollToTable() {
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph() {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testDropdownMultipleOptions() {
        DropdownPage dropdownPage = homePage.clickDropDown();

        String option1 = "Option 1";
        String option2 = "Option 2";

        dropdownPage.selectAllOptions();
        dropdownPage.selectFromDropDown(option1);
        dropdownPage.selectFromDropDown(option2);
        List<String> SelectedOptions = dropdownPage.getSelectedOptions();

        Assert.assertEquals(SelectedOptions.size(), 2, "Incorrect number of selections");
        Assert.assertTrue(SelectedOptions.contains(option1), "Option 1 not selected");
        Assert.assertTrue(SelectedOptions.contains(option2), "Option 2 not selected");
    }
}

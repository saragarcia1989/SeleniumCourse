package dropdown;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTest {

    @Test
    public void testSelectOption() {
        DropdownPage dropdownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropdownPage.selectFromDropDown(option);
        List<String> SelectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(SelectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(SelectedOptions.contains(option), "Option not selected");
    }
}

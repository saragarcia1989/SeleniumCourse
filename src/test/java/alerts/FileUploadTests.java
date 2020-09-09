package alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTest {
    @Test
    public void testFileUpload() {
        var UploadPage = homePage.clickFileUpload();
        UploadPage.uploadFile("C:\\Users\\sarag\\IdeaProjects\\webdriver_java\\resources\\chromedriver.exe");
        Assert.assertEquals(UploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded failed");
    }
}

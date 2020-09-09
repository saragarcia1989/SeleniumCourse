package forgotPassword;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testRetrievePassword() {

        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        var EmailSentPage = forgotPasswordPage.clickRetrievePasswordBotton();
        EmailSentPage.getEmailSentText();
        Assert.assertEquals(EmailSentPage.getEmailSentText(), "Your e-mail's been sent!", "Message is incorrect");

    }

}

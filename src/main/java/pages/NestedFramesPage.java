package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NestedFramesPage {

    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");


    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLeftFrameText() {
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = getFrameText();
        switchToMainFrame();
        switchToMainFrame();
        return text;
    }

    public String getBottomFrameText() {
        driver.switchTo().frame(bottomFrame);
        String text = getFrameText();
        switchToMainFrame();
        return text;
    }

    private void switchToMainFrame() {
        driver.switchTo().parentFrame();
    }

    private String getFrameText() {
        return driver.findElement(body).getText();
    }

}

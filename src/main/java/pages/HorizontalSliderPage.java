package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {

    private WebDriver driver;

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    private By slider = By.cssSelector(".sliderContainer input");
    private By sliderNumber = By.id("range");

    public void pressKeys(String keys) {
        driver.findElement(slider).sendKeys(keys);
    }

    public String getSliderNumber() {
        return driver.findElement(sliderNumber).getText();
    }
}

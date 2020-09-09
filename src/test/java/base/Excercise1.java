package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Excercise1 {

    private WebDriver driver;

    public void setUp1() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();
        WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1.click();

        List<WebElement> menus = driver.findElements(By.tagName("li"));

        System.out.println("Number of menu items: " + menus.size());

        driver.quit();

    }

    public static void main(String[] args) {
        Excercise1 test = new Excercise1();
        test.setUp1();
    }
}

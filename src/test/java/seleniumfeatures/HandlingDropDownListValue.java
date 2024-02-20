package seleniumfeatures;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownListValue {
    public static void main(String[] args) {
        //Open Browser
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //Get Application Url
        driver.get("https://demoqa.com/select-menu");

        //Scroll Down Page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");

        //Handling Drop Down Value
        WebElement element = driver.findElement(By.id("oldSelectMenu"));
        // Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        Select select = new Select(element);
        select.selectByVisibleText("Yellow");
        select.selectByValue("2");
        select.selectByIndex(1);

        //Quit Browser
        driver.quit();
    }
}

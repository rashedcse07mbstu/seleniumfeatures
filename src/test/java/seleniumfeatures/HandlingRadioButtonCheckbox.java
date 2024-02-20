package seleniumfeatures;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingRadioButtonCheckbox {
    public static void main(String[] args) {
        //Open Browser
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //Get Application Url
        driver.get("https://demo.guru99.com/test/radio.html");

        //Handling Radio Button
        driver.findElement(By.id("vfb-7-2")).isDisplayed();
        boolean isSelectedOrNot = driver.findElement(By.id("vfb-7-2")).isSelected();
        driver.findElement(By.id("vfb-7-2")).click();

        //Handling Checkbox Button
        driver.findElement(By.id("vfb-6-2")).isDisplayed();
        driver.findElement(By.id("vfb-6-2")).isSelected();
        driver.findElement(By.id("vfb-6-2")).click();

        // quit browser
        driver.quit();
    }
}

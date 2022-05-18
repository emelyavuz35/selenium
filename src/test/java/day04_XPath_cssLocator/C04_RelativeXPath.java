package day04_XPath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C04_RelativeXPath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html#");
        WebElement bostonwebElement=driver.findElement(By.id("pid6-thumb"));
        WebElement saılorWebElement=driver.findElement(By.id("pi11-thumb"));

        WebElement mountie=driver.findElement(RelativeLocator.with(By.tagName("img"))
                .below(bostonwebElement).toLeftOf(saılorWebElement));

        System.out.println(mountie.getAttribute("id"));
    }
}

package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.Duration;
import java.util.List;

public class C02_FindElements {
    public static void main(String[] args) {
        //amazon sayfasında kac tane lınk vardır

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        List<WebElement> linkListesi=driver.findElements(By.tagName("a"));

        System.out.println("sayfadakı lınk sayısı"+linkListesi.size());
        driver.close();
    }

}

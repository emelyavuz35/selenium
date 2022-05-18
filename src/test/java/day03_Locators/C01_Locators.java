package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //amazona gıdıp nutella aratalım
        driver.get("https://amazon.com");
        //fındElement(By.....Locator)--->istedıgımız web elementını bıze dondurur.
        // Bızde o web elementını kullanmak ıcın bır objeye assıgn ederız

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        //herhangı bır web elementıne ıstedıgımız yazıyı yollamak ıstersek
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        /*
        enter a basmak ıcın Keys.Enter yazdık
        locator alırken gozumuzden kaaan detaylar olabılır.
        aldıgımız bır locator calısmazsa alternatıf locatorlar denemelıyız
         */





    }
}

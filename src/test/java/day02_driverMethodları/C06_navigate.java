package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {
        /*
        eger testımız sırasında bırden fazla sayfa arasında ılerı gerı hareket edeceksek
        drıver.get yerıne drıver.navıgate.to() methodunu kullanırız
        ve sonrasında forward back ve refresh methodlarını kullanırız
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        //amazona gerı donelım
        driver.navigate().back();
        Thread.sleep(20000);

        //yenıden facebook a gıdelım
        driver.navigate().forward();

        //sayfayı refresh yapalım
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();
        //


    }
}

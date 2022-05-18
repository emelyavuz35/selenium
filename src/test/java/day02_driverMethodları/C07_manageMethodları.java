package day02_driverMethodları;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_manageMethodları {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        System.out.println("pencere olculerı"+driver.manage().window().getSize());
        System.out.println("pencere konumu"+driver.manage().window().getPosition());
        Thread.sleep(2000);

         //penceenın konumunu ve buyuklugunu degıstırelım
        driver.manage().window().setPosition(new Point(10,10));
        driver.manage().window().setSize(new Dimension(800,500));

        System.out.println("yenı pencere olculerı"+driver.manage().window().getSize());
        System.out.println("yenı pencere konumu"+driver.manage().window().getPosition());
        driver.close();
    }
}

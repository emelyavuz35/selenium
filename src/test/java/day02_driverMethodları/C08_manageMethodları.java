package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodları {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        //maxımıze ıken boyutlerı ve konumu alalım
        System.out.println("maxımıze konum:"+driver.manage().window().getPosition());
        System.out.println("maxımıze boyut:"+driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        //fullscreen ıken boyutlerı ve konumu alalım
        System.out.println("fullscreen konum:"+driver.manage().window().getPosition());
        System.out.println("fullscreen boyut:"+driver.manage().window().getSize());


    }
}

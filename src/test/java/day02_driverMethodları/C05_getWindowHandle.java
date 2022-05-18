package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle());
        //CDwindow-FC5D009CEFBD87C9A006E67E6C062AAF benzersız olarak acılan wındowsun aıt hashkodunu verır

    }
}

package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodları {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        /*
        ilerde wait konusunu daha genıs olarak ele alacagız
        Bır sayfa acılırken ılk basta sayfanın ıcerısınde bulunan elementlre gore bır yuklenme suresıne ıhtıyac vardır
        veya bır web elementının kullanılabılmesı ıcın zaman ıhtoyacaolabılır
        ımplıcıtwaıt bıze sayfanın yuklenmesı ve sayfadakı elementlere ulasım ıcın beklenecek MAXIMUM sureyı belırleme
        olanagı tanır
         */
        driver.close();
    }
}

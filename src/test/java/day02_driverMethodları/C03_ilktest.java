package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ilktest {
    public static void main(String[] args) {

        /*1-https://www.amazon.com url ıne gıdın.
          2-baslıgın Amazon kelımesı ıcerdıgını test edın
          3-url ın https://www.amazon.com a esıt oldugunu test edın
          4-sayfayı kapatın
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
       String actualTitle= driver.getTitle();
       String arananKelime="Amazon";
       if (actualTitle.contains(arananKelime)){
           System.out.println("title testi pass");
       }else {
           System.out.println("tıtle"+arananKelime+"yi icermiyor,tıtle testi failed");
       }
       String actualUrl= driver.getCurrentUrl();
       String expectedUrl="https://www.amazon.com/";
       if (actualUrl.equals(expectedUrl)){
           System.out.println("title testi pass");
       }else {
           System.out.println("actual Url:"+actualUrl+" beklenen url den farklı ,test failed");
       }
       driver.close();
    }
}

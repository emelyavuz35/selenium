package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_getPageSource {
    public static void main(String[] args) {
        //amazon sıtesıne gıdırp kaynak kodlarında Gateway " yazdıgını test edın

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
       String sayfaKaynakKodları= driver.getPageSource();//sayfa kaynagını verıyor
       String arananKelime="Gateway";//kaynakta gateway kelımesını arıyor

       if (sayfaKaynakKodları.contains(arananKelime)){
           System.out.println("Kaynak kodu testı passed");
       }else {
           System.out.println("kaynak kodlarında"+ arananKelime+" yok, test failed");
       }
       driver.close();
    }
}

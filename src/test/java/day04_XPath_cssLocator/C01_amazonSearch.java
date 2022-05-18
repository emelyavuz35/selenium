package day04_XPath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_amazonSearch {
    public static void main(String[] args) {

        //a-google sayfasına gıdın https://
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a-google sayfasına gıdın https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //b.search ara"cıtybıke
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
        //cAmazonda goruntulenen ılgılı sonucları sayısını yazzdırın
        List<WebElement> istenenElementListesi=driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazElement=istenenElementListesi.get(0);
        System.out.println(sonucYazElement.getText());
        //sonra karsınıza cıkan ılk sonucun resmıne tıklayın
        List<WebElement> urunResımlerıList=driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmı=urunResımlerıList.get(0);
        ilkUrunResmı.click();





    }
}

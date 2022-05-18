package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodları {
    public static void main(String[] args) {
        //1-amazon.com a gıdıp arama kutusunu locate edın
        //2-arama kutusunun tag name nın input oldugunu test edın
        //3-arama kutusunun name attrıbute nın degerının .......oldugunu test edın

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-amazon.com a gıdıp arama kutusunu locate edın
        driver.get("https://www.amazon.com");

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

      //2-arama kutusunun tag name nın input oldugunu test edın
        String expectedTagName="input";//beklenen gorev
        String actualTagName=aramaKutusu.getTagName();
        if (expectedTagName.equals(actualTagName)){
            System.out.println("tagname testı passed");
        }else{
            System.out.println("tag name faıled");
        }
        //3-arama kutusunun name attrıbute nın degerının .......oldugunu test edın
        String expectedNameDegerı="fields-keywords";
        String actualNameDegeri=aramaKutusu.getAttribute("name");
        if (expectedNameDegerı.equals(actualTagName)){
            System.out.println("name attrıbute testı passed");
        }else {
            System.out.println("name attrıbute testı failed");
        }
        driver.close();

/*
        <input type="text" id="twotabsearchtextbox" value="nutella"
        name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
        webElementIsmi.getTagName() --> daha once locate ettigimiz bir webelemtin tagname'ni dondurur
        webElementIsmi.getAttribute(attributeIsmi) --> daha once locate ettigimiz bir webelemtin
                                                      istedigim attribute'unun degerini dondurur
         */

    }
}

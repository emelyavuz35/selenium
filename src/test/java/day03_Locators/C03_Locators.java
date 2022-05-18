package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class C03_Locators {


    /*
    Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
    3. Sayfada kac tane link oldugunu bulun.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        //  b. Sign in butonuna basin
        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));
        signInLinki.click();
        //  c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.name("session[password]"));
        WebElement signInButonu = driver.findElement(By.name("commit"));
        //  d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //      i. Username : testtechproed@gmail.com
        //      ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();
        //Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualKullanıcıAdıElementi=driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullanıcıAdıElementi.getText());
        String expectedUserMail="testtechproed@gmail.com";
        if (expectedUserMail.equals(actualKullanıcıAdıElementi.getText())){
            System.out.println("expected kullanıcı adı testı passed");
        }else{
            System.out.println("expected kullanıcı adı testı failed");
        }
        //bır web elementın uzerınde ne yazdıgını gormek ıstersek webElementİsmi.getText() kullanırız
        WebElement adressesElement=driver.findElement(By.tagName("Addresses"));
        WebElement signOutElement=driver.findElement(By.linkText("Sign out"));
        if (adressesElement.isDisplayed()){
            System.out.println("adresses testı passed");
        }else{
            System.out.println("adresses testı passed");
        }

        if (signOutElement.isDisplayed()){
            System.out.println("signout testı passed");
        }else{
            System.out.println("signout testı passed");
        }
       // 3. Sayfada kac tane link oldugunu bulun.
        //listemiz web elementlerden olustugu ıcın dırect yazdırırsak referansları verır
        //onun yerıne for each loop yapıp her bır lınk elementının uzerındekı yazıyı yazdırmalıyz
        List<WebElement> linklerListesi= (List<WebElement>) driver.findElement(By.tagName("a"));

        System.out.println("sayfadakı lınk sayısı:"+linklerListesi.size());
        for (WebElement each:linklerListesi
             ) {
            System.out.println(each.getText());
        }

        driver.close();

    }
}
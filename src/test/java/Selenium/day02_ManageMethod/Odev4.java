package Selenium.day02_ManageMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Yeni bir class olusturalim (Homework)
//ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
       String baslık = driver.getTitle();
       String beklenenBaslık= "facebook";
       if (baslık.equals(beklenenBaslık)){
           System.out.println("Test PASSED");
       }else System.out.println("Test FAILED->"+baslık);


//Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
       String actualUrl= driver.getCurrentUrl();
       String beklenenUrl = "facebook";
       if (actualUrl.contains(beklenenUrl)){
           System.out.println("Test PASSED");
       }else System.out.println("Test FAILED->"+actualUrl);
       Thread.sleep(5000);

//https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");
//Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        boolean iceriyormu = driver.getTitle().contains("Walmart.com");
        System.out.println("Var mı :"+iceriyormu);
//Tekrar “facebook” sayfasina donun
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
//Sayfayi yenileyin
        driver.navigate().refresh();
//Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

// 9.Browser’i kapatin
        driver.close();

    }




}

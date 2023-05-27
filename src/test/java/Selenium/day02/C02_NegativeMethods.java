package Selenium.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NegativeMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");//get() methodu ile aynı mantıkda çalışır.
         Thread.sleep(3000);//javada kodlarını bekletmek için kullanılır.3 saniye.exception atar kabule ederiz.
     //Sonra Amazon sayfasına gidelim

        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);
     //Amazon sayfasının başlığını yazdıralım
        System.out.println("Amazon sayfa başlığı : " + driver.getTitle());
        //Techproeducation sayfasına geri dönelim
        driver.navigate().back();//browser bir sayfadayken geri gelir.
        Thread.sleep(3000);
    //Sayfa başlığını yazdıralım
        System.out.println("Title :" +driver.getTitle());
        //Amazon sayfasına tekrar gidip url'i yazdıralım
        driver.navigate().forward();//browser bir sayfadayken ileri gider.
        System.out.println("Url :"+driver.getCurrentUrl());
        Thread.sleep(3000);
        //Amazon sayfasındayken sayfayı yenileyelim
        driver.navigate().refresh();//sayfayı yeniler
        //sayfayı kapatın
        driver.close();




    }
}

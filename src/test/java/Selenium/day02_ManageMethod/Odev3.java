package Selenium.day02_ManageMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    // Yeni bir Class olusturalim.C07_ManageWindowSet
//Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın Boyutu :"+driver.manage().window().getSize());
        System.out.println("Sayfanın Konumu :"+driver.manage().window().getPosition());
//Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
//Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Sayfanın Boyutu 2:"+driver.manage().window().getSize());
        System.out.println("Sayfanın Konumu 2:"+driver.manage().window().getPosition());

//8. Sayfayi kapatin
        driver.close();


    }

}

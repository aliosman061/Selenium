package Selenium.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Yeni bir class olusturun (TekrarTesti)
//Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com/");
        String actualTitle = driver.getTitle();
        String beklenenTitle = "youtube";
        if (actualTitle.equals(beklenenTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED->"+actualTitle);
//Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String beklenenUrl="youtube";
        if (actualUrl.contains(beklenenUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED->"+actualUrl);
        Thread.sleep(5000);
//Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com");
        Thread.sleep(5000);
//Youtube sayfasina geri donun
        driver.navigate().back();
//Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(5000);
//Amazon sayfasina donun
        driver.navigate().forward();
//Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
//Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru başlığı(Actual Title) yazdırın.
        String actualTitle2 = driver.getTitle();
        String beklenenTitle2= "Amazon";
        if (actualTitle2.contains(beklenenTitle2)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED->"+actualTitle2);
//Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String actualUrl2 = driver.getCurrentUrl();
        String beklenenUrl2 = "https://www.amazon.com/";
        if (actualUrl2.equals(beklenenUrl2)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED->"+actualUrl2);
//Sayfayi kapatin
        driver.close();
    }



}

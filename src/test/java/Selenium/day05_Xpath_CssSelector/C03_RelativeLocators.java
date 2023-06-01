package Selenium.day05_Xpath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_RelativeLocators {
    /*
-Bir web elementi direk locate edemediğimiz durumlarda,
o web element,, etrafındaki web elementleri ile tarif etmemizi sağlar.
-Bir web sayfasında benzer özelliklere sahip webelementlerin olduğu durumlarda kulllanılabilir.

-above ==> Belirtilen elementin üstünde olan elementi seçer.
-below==> Belirtilen elementin altında olan elemneti seçer.
-toLeftOf ==> Belirtilen elementin solunda olan elemneti seçer.
-toRightOf ==> Belirtilen elementin sağında olan elemneti seçer.
-near ==> Belirtilen elementin Yanında ya da yakınında olan elemneti seçer.

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //city bike aratalım
        WebElement aramaKutusu =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);
        //Relative Locator kullanarak Hybrid Bikes üstündeki Road Bikes'a tıklayalım
        WebElement hypridKutu = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
       WebElement roadBikes = driver.findElement(with(By.tagName("span")).above(hypridKutu));
       roadBikes.click();
        // sayfayı kapatın
        Thread.sleep(5000);
        driver.close();
    }
}

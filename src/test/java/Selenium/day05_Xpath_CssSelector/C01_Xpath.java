package Selenium.day05_Xpath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // arama kutusuna "city bike"  yazıp aratın
        WebElement aramakutusu = driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']"));
        aramakutusu.sendKeys("city bike"+ Keys.ENTER);

        // Hybrid Bikes bölümüne tıklayın
       WebElement hypridKutu = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));
       hypridKutu.click();
        // sonuc sayısını yazdırın
        WebElement sonucYazısı = driver.findElement(By.xpath("//span[text()='14 results for']"));
        System.out.println("sonucYazısı. : = " + sonucYazısı.getText());

        String sonucSayisi[] = sonucYazısı.getText().split(" ");
        System.out.println(sonucSayisi[0]);
        // ilk ürününe tıklayın
        WebElement ilkUrun = driver.findElement(By.xpath("//img[@class='s-image']"));
        ilkUrun.click();
        //eğer seçilen attribute unique değilse
        // ör: (//span[@class='asd'])[1]
        // bu şekilde paranteze alıp parantez dışına kapalı parantez yapıp bulunduğu indexi yazarak unique hael getiririz.

        //Sayfayı kapatınız
        Thread.sleep(5000);
        driver.close();
    }
}

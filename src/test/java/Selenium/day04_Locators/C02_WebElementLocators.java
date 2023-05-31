package Selenium.day04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C02_WebElementLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // arama kutusuna "city bike" yazıp aratın
      // WebElement aramakutusu = driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']"));
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("city bike"+ Keys.ENTER);
        // sonuc yazısını yazdırın
       List<WebElement> sonucYazıları = driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazısı = sonucYazıları.get(0);//birden fazla sonuc olduğu için liste alıp index 0 ile ilk sonucu aldık ve bi webelemente atadık
        System.out.println(sonucYazısı.getText());//web elementi yazdırırsak hash code vereceği için getText() ile stringe çevirip yazdırdık.
        // sonuc sayısını yazdırın

       String sonucSayısı[] = sonucYazısı.getText().split(" ");
        System.out.println(Arrays.toString(sonucSayısı));
        System.out.println(sonucSayısı[2]);

        // ilk ürünün locatini alın
        List<WebElement> urun =driver.findElements(By.className("s-image"));
        WebElement ilkUrun = urun.get(0);


        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        Boolean gorunurmu = ilkUrun.isDisplayed();
        System.out.println("gorunurmu = " + gorunurmu);
        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        Boolean erisilebilirmi= ilkUrun.isEnabled();
        System.out.println("erisilebilirmi = " + erisilebilirmi);
        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        Boolean secilebilirmi= ilkUrun.isSelected();
        System.out.println("secilebilirmi = " + secilebilirmi);//radio button anda chechbox larda kullanılır.
        // ilk urune tıklayın
        ilkUrun.click();
        Thread.sleep(5000);
        // sayfayı kapatın
        driver.close();
    }
}

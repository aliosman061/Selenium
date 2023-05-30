package Selenium.day03dt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https:www.amazon.com");
        // aramakutusunu locate ediniz ve Nutella aratınız

        WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();


        Thread.sleep(5000);
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER); eğer bir webelementi birden fazla kullanmayacaksak bu şekilde yapabiliriz.

        // sayfayı kapatınız
        driver.close();
    }
}

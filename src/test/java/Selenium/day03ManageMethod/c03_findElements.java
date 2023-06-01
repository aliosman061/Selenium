package Selenium.day03ManageMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class c03_findElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // Amazon sayfasında kac tane link olduğunu konsolda yazdırın
        List<WebElement> linkler = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayısı : "+linkler.size());
       // Linkleri konsolda yazdırın
        for (WebElement each:linkler) {
            System.out.println(each.getText());//getText methodu ile stringe çevirip yazdırdık onu yazmassak hascode ları veriyor.
        }

        //Thread.sleep(5000);
        // sayfayı kapatın
        driver.close();
    }
}

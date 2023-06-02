package sabahcalismalari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // ödev 1:

        // Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com/");

        // Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        // Sayfa basliginin "Amazon" icerdigini test edin
        String expectedTtitle = "Amazon";
        if (driver.getTitle().contains(expectedTtitle)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        // Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        // Sayfa url'inin "amazon" icerdigini test edin.
        String expectedUrl = "amazon";
        if (driver.getCurrentUrl().contains(expectedUrl)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        // Sayfa handle degerini yazdirin
        String windowsHandleDegeri = driver.getWindowHandle();
        System.out.println(windowsHandleDegeri);

        // Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String expectedHtml = "Gateway";
        if (driver.getPageSource().contains(expectedHtml)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        // Sayfayi kapatin.
        driver.close();
    }

}

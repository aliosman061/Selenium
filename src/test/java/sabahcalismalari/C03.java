package sabahcalismalari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//         https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
//        Browseri tam sayfa yapin
        driver.manage().window().maximize();
//        - Sayfayi “refresh” yapin
        driver.navigate().refresh();
//        Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actulTitle = driver.getTitle();
        String beklenenTitle ="Spend less";
        if (actulTitle.contains(beklenenTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        List<WebElement> liste=  driver.findElements(By.xpath("(//*[@class='nav-a  '])[1]  |(//*[@class='nav-a  '])[2]  | (//*[@class='nav-a  '])[3]  | (//*[@class='nav-a  '])[4] | (//*[@class='nav-a  '])[5]  "));
        for (int i = 0; i < liste.size(); i++) {
            liste = driver.findElements(By.xpath("(//*[@class='nav-a  '])[1]  |(//*[@class='nav-a  '])[2]  | (//*[@class='nav-a  '])[3]  | (//*[@class='nav-a  '])[4] | (//*[@class='nav-a  '])[5]"));
            System.out.println(liste.get(i).getText());
            liste.get(i).click();
            Thread.sleep(3000);

            driver.navigate().back();

            Thread.sleep(3000);

        }
//        Gift Cards sekmesine basin
       //WebElement text = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
        //text.click();

//        Birthday butonuna basin
//        Best Seller bolumunden ilk urunu tiklayin
//        9- Gift card details’den 25 $’i secin
//        10-Urun ucretinin 25$ oldugunu test edin
//        10-Sayfayıkapatin
    }
}

package sabahcalismalari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.systeminfo.model.Size;

import javax.swing.text.Position;
import java.time.Duration;

public class C04 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("ttps://www.amazon.com/");
//        Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın Ölcüsü : "+driver.manage().window().getSize());
        System.out.println("Sayfanın Konumu : "+driver.manage().window().getPosition());
//        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
      driver.manage().window().setPosition(new Point(100,100));
      driver.manage().window().setSize(new Dimension(300,300));
//        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin

//        Sayfayi kapatin

    }
}

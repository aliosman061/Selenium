package sabahcalismalari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //ödev : 4
        //ManageWindowSet
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin

        driver.manage().window().setSize(new Dimension(800, 400));
        driver.manage().window().setPosition(new Point(100, 50));

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Dimension x = new Dimension(800, 400);
        Point y =new Point(100, 50);

        if (driver.manage().window().getSize().equals(x)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
        if (driver.manage().window().getPosition().equals(y)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

        //Sayfayi kapatin
        driver.close();
    }

}



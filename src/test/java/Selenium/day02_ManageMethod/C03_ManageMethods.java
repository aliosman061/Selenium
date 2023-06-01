package Selenium.day02_ManageMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*
    Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
 */
        //browserın konumunu yazdıralım
        System.out.println("Sayafnın Konumu :" + driver.manage().window().getPosition());

        //browserın boyutlarını yazdıralım
        System.out.println("Sayfanın Boyutları 1 :" +driver.manage().window().getSize());

        //browserı maximize yapalım
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //techrproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
        //browserın boyutlarını yazdıralım
        System.out.println("Sayfanın Boyutları 2 :" +driver.manage().window().getSize());
        Thread.sleep(3000);
        //sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);
        //sayfayı fullscreen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.close();
    }
}

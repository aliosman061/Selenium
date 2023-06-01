package Selenium.day05_Xpath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/ ");
        //Add Element butonuna basin
        WebElement addelement = driver.findElement(By.cssSelector("button[ onclick='addElement()']"));
        addelement.click();

        //Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteelement = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        System.out.println("Görünür mü : " + deleteelement.isDisplayed());
        //Delete butonuna basin
        deleteelement.click();
        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveElemnts = driver.findElement(By.cssSelector("h3"));
        System.out.println("Görünür mü : "+addRemoveElemnts.isDisplayed());
        //Sayfayı kapatın
        driver.close();


        /*

        Xpath ve cssSelector arasındaki farklar:

        - Xpath text ile calısır.
        - cssSelector text ile calısmaz
        - Xpath index'e göre arama yapabilir.Daha fazla kombinasyona sahiptir.
        - cssSelector index'e göre arama yapamaz. Daha hızlı calısır

         */
    }
}

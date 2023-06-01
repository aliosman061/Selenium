package Selenium.day02_ManageMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //amazon sayfasıba gidelim
        driver.get("https://www.amazon.com");

        //sayfa başlığının Amazon içerdiğini test edelim
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if (actualTitle.contains("Amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //Url'in https://www.amazon.com olduğunu test edelim

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl ="https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
            }else System.out.println("Test FAILED->" + actualUrl);
        //syafayı kapatın
        driver.close();//Browserı kapatır.
        //driver.quit();-> birden fazla browser varsa hepsini kaptır.



    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class S2_Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        WebDriver driver = new ChromeDriver(options);

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.findElement(By.id("alertbtn")).click();
        Thread.sleep(1000);

        //press Ok on the alert
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

       WebElement x = driver.findElement(By.id("confirmbtn"));
       x.click();
        Thread.sleep(1000);

        //press Cancel on the alert
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);

        driver.quit();
    }
}
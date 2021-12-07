import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class S1_Test {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        driver.get("http://automationpractice.com/");
//        driver.get("http://demoqa.com/");

        driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Browsers']"));
        button.click();

        List<WebElement> list = driver.findElements(By.xpath("//div[@id='supported-browsers']//div[@class='card mb-3 border-0']"));
        System.out.println(list.size());

//        Thread.sleep(3000);
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()", button);


//        Thread.sleep(3000);

//        Actions actions = new Actions(driver);
//        actions.moveToElement(button);
//        actions.perform();


//        driver.quit();
    }
}
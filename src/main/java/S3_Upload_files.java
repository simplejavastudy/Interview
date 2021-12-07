import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3_Upload_files {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://html.com/input-type-file/");
        driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\rocee\\Desktop\\Interviews\\3. Old Back Up\\Rahul Shetty\\Java codes\\data.properties");

    }
}
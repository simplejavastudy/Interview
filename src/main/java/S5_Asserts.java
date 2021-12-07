import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class S5_Asserts {
    String browserDriver = "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe";
    public static WebDriver driver;

    @BeforeTest
    void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", browserDriver);
        driver  = new ChromeDriver();
    }

    @AfterTest
    void quitBrowser() {
        driver.quit();
    }

    @AfterMethod
    void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test (groups = "title")
    void a() {
        driver.get("https://www.google.com");
//        driver.manage().window().maximize();

        Assert.assertEquals(driver.getTitle(),"Google");
        System.out.println(driver.getTitle());
    }

    @Test (priority = 0)
    void c() {
        driver.get("https://www.yahoo.com");
        driver.manage().window().maximize();

        Assert.assertEquals(driver.getTitle(), "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos");
        System.out.println(driver.getTitle());
    }

    @Test (priority = 2)
    void b() {
        driver.get("https://www.youtube.com");
//        driver.manage().window().maximize();

        Assert.assertEquals(driver.getTitle(),"YouTube");
        System.out.println(driver.getTitle());
    }
}
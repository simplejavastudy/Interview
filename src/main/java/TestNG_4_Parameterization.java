import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNG_4_Parameterization {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    void checkTitle1(String browser, String url) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.get(url);
            driver.manage().window().maximize();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\FireFoxDriver\\geckodriver.exe");
            driver = new FirefoxDriver();

            driver.get(url);
            driver.manage().window().maximize();
        }
    }

    @AfterTest
    void quit() {
        driver.quit();
    }

    @Test
    void printTitle() {
        System.out.println(driver.getTitle());
    }
}
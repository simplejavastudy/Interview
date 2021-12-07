import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_1_Grouping {

    String browserDriver = "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe";
    public static WebDriver driver;

    @BeforeTest(groups = {"general"})
    void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", browserDriver);
        driver = new ChromeDriver();
    }

    @AfterTest(groups = {"general"})
    void quitBrowser() {
        driver.quit();
    }

    @AfterMethod(groups = {"general"})
    void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test(groups = {"sanity"})
    void title1() {
        driver.get("https://www.google.com");
        System.out.println("Title 1: " + driver.getTitle());
    }

    @Test(groups = {"sanity", "regression"})
    void title2() {
        driver.get("https://www.youtube.com");
        System.out.println("Title 2: " + driver.getTitle());
    }
}
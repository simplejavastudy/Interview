import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_2_ParallelTesting1 {

    @Test
    void checkTitle1() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println("Title 1: " + driver.getTitle());

        driver.quit();

    }

    @Test
    void checkTitle2() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");
        driver.manage().window().maximize();
        System.out.println("Title 2: " + driver.getTitle());

        driver.quit();
    }

    @Test
    void checkTitle3() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        System.out.println("Title 3: " + driver.getTitle());

        driver.quit();
    }


    @Test
    void checkTitle4() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println("Title 1: " + driver.getTitle());

        driver.quit();

    }

    @Test
    void checkTitle5() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");
        driver.manage().window().maximize();
        System.out.println("Title 2: " + driver.getTitle());

        driver.quit();
    }

    @Test
    void checkTitle6() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        System.out.println("Title 3: " + driver.getTitle());

        driver.quit();
    }


    @Test
    void checkTitle7() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println("Title 1: " + driver.getTitle());

        driver.quit();

    }

    @Test
    void checkTitle8() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");
        driver.manage().window().maximize();
        System.out.println("Title 2: " + driver.getTitle());

        driver.quit();
    }

    @Test
    void checkTitle9() {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\Downloads\\Selenium Jars and Drivers\\Drivers\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
        System.out.println("Title 3: " + driver.getTitle());

        driver.quit();
    }


}
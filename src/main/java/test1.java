import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class test1 {


    @BeforeTest
    public static void main(String[] args)
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fleek\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
//        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.get("https://mgm-roar-dev.practicallogix.com/");

    }
}

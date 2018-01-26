package Test;

/**
 * Created by klenova on 25.01.2018.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import javax.security.auth.login.Configuration;

public class BaseTest {
    public  WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public void setup () {
        //Create a Chrome driver. All test and page classes use this driver.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Klenova\\Documents\\chromedriver_win32\\chromedriver.exe");//"C:\\Users\\Katya\\Documents\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");

       // driver = new ChromeDriver();

        //Create a wait. All test and page classes use this wait.
       // wait = new WebDriverWait(driver,15);

        //Maximize Window
       // driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }
}

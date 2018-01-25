package Pages;

import javax.security.auth.login.Configuration;

/**
 * Created by klenova on 25.01.2018.
 */



public class BasePage {

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Klenova\\Documents\\chromedriver_win32\\chromedriver.exe");//"C:\\Users\\Katya\\Documents\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
       // ChromeDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://www.istockphoto.com/");
    }
    public static void main(String[] args) {
        setup();
        LoginPage loginPage = new LoginPage();
        loginPage.userLogin("katyaklenova@gmail.com", "123456qwe");
    }
}

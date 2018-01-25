package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Katya on 23.01.2018.
 */


public class Page {

    private static WebDriver driver;

   /* @BeforeMethod
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Klenova\\Documents\\chromedriver_win32\\chromedriver.exe");//"C:\\Users\\Katya\\Documents\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("selenide.browser", "Chrome");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.istockphoto.com/");
    }*/


    public void removePhotoFromBoard() {
        WebElement openBoardButton = driver.findElement(By.xpath("//a[@title = 'Open']"));
        openBoardButton.click();
        WebElement removeFromBoardIcon = driver.findElement(By.xpath("//span[@title = 'Remove from Board']"));
        removeFromBoardIcon.click();

    }

    public void deleteBoard() {
        WebElement deleteThisBoardButton = driver.findElement(By.xpath("//a[text() = 'Delete this Board']"));
        deleteThisBoardButton.click();
    }



    @Test
    public  void  CreateNewBoard(){

        removePhotoFromBoard();
        //WebElement photoInMyBoard = driver.findElement(By.xpath(("//img[@id = 'asset_478130948']")));
        //Assert.assertFalse(photoInMyBoard.isDisplayed());
         WebDriverWait wait = new WebDriverWait(driver, 20);
         wait.until(
              ExpectedConditions.invisibilityOfElementLocated(By.xpath(("//img[@id = 'asset_478130948']"))));
        //Assert.assertFalse(photoInMyBoard.isDisplayed());

        deleteBoard();
        driver.switchTo().alert().accept();

        WebElement startABoardTest = driver.findElement(By.xpath("//div[text() = 'Start a Board. Simply click or tap ']"));
        wait.until(
                ExpectedConditions.visibilityOf(startABoardTest));
       Assert.assertTrue(startABoardTest.isDisplayed());
    }
}

  
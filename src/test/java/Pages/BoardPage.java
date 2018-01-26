package Pages;

import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by klenova on 25.01.2018.
 */
public class BoardPage extends BasePage {
    public void createBoard(String name) {
        $(By.xpath("//span[text() = 'Your Board ']")).click();
        $(By.name("boardname")).sendKeys(name);
        $(By.xpath("//a[text()='Create']")).click();
    }

    public boolean verifyBoardCreated(String boardName) {
      return   $(By.xpath("//option[text() = boardName]")).exists();
    }

    public void removePhotoFromBoard() {
        $(By.xpath("//a[@title = 'Open']")).click();
        $(By.xpath("//span[@title = 'Remove from Board']")).click();
    }

    public  boolean verifyPhotoRemoved(){
        return $(By.xpath("//span[text() = '1 file']")).exists();
    }

    public void deleteBoard() {
        $(By.xpath("//a[text() = 'Delete this Board']")).click();
       // BaseTest.driver.switchTo().alert().accept();
    }

    /*  public  boolean verifyBoardDeleted(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement startABoardTest = BasePage.driver.findElement(By.xpath("//div[text() = 'Start a Board. Simply click or tap ']"));
        wait.until(
                ExpectedConditions.visibilityOf(startABoardTest));
        Assert.assertTrue(startABoardTest.isDisplayed());
    }*/

    //WebElement photoInMyBoard = driver.findElement(By.xpath(("//img[@id = 'asset_478130948']")));
    //Assert.assertFalse(photoInMyBoard.isDisplayed());
    //WebDriverWait wait = new WebDriverWait(driver, 20);
    //wait.until(
    // ExpectedConditions.invisibilityOfElementLocated(By.xpath(("//img[@id = 'asset_478130948']"))));
    //Assert.assertFalse(photoInMyBoard.isDisplayed());
}

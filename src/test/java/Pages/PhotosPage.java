package Pages;

import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import java.lang.String;

/**
 * Created by klenova on 25.01.2018.
 */
public class PhotosPage {
    public void openPhotosPartitian() {
        $(By.xpath("//a[text()='Photos']")).click();
    }

    public void openConcreatePhoto(String link) {
        open(link);
    }

    public void addPhotoToBoard() {
        BaseTest baseTest = new BaseTest();
        WebElement addToBoardIcon = baseTest.driver.findElement(By.xpath("//div[@class = 'icon']"));
        Actions action = new Actions(baseTest.driver);
        action.moveToElement(addToBoardIcon).build().perform();
        addToBoardIcon.click();
    }

    public boolean verifyPhotoAdded(java.lang.String photosInBoartNumb) {
        String photosInBoardCounterContent = $(By.xpath("//span[@class = 'count ng-binding ng-scope']")).getText();
        return photosInBoardCounterContent == photosInBoartNumb;
    }


}

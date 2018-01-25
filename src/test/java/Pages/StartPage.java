package Pages;

import Test.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by klenova on 25.01.2018.
 */
public class StartPage extends BasePage {
    public void createBoard(String name) {
        $(By.xpath("//span[text() = 'Your Board ']")).click();
        $(By.name("boardname")).sendKeys(name);
        $(By.xpath("//a[text()='Create']")).click();
    }

    public boolean verifyBoardCreated(String boardName) {
      return   $(By.xpath("//option[text() = boardName]")).exists();
    }

}

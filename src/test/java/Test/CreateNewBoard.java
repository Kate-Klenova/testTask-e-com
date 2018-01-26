package Test;

import Pages.BoardPage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**
 * Created by klenova on 25.01.2018.
 */
public class CreateNewBoard extends BaseTest {

        @Test(priority = 0)
        public void createNewBoard() {
                String boardName = "TestBoard_1";
                LoginPage loginPage = new LoginPage();
                loginPage.userLogin("katyaklenova@gmail.com", "123456qwe");

                BoardPage boardPage = new BoardPage();
                boardPage.createBoard(boardName);
                Assert.assertTrue(boardPage.verifyBoardCreated(boardName));
        }

        @AfterTest()
        public void cleanUp(){
                BoardPage boardPage = new BoardPage();
                boardPage.deleteBoard();
        }
}


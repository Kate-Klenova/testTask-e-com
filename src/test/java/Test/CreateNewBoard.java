package Test;

import Pages.StartPage;
import org.testng.annotations.Test;

/**
 * Created by klenova on 25.01.2018.
 */
public class CreateNewBoard extends BaseTest {

        @Test(priority = 0)
        public void createNewBoard() {
                String boardName = "TestBoard_1";

                StartPage startPage = new StartPage();
                startPage.createBoard("boardName");
                startPage.verifyBoardCreated(boardName);
        }
}


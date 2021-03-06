package Test;

import Pages.BoardPage;
import Pages.PhotosPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by klenova on 25.01.2018.
 */
public class AddPhotoToBoard extends  BaseTest {
    @Test(priority = 1)
    public void createNewBoard() {
        String boardName = "TestBoard_2";

        BoardPage boardPage = new BoardPage();
        boardPage.createBoard("boardName");
        boardPage.verifyBoardCreated(boardName);
        PhotosPage photosPage = new PhotosPage();
        photosPage.openPhotosPartitian();
        photosPage.openConcreatePhoto("https://www.istockphoto.com/photo/parisian-selfie-gm478130948-67446427");
        photosPage.addPhotoToBoard();
        photosPage.verifyPhotoAdded("1");
    }

}


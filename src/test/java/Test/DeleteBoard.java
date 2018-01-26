package Test;

import Pages.BoardPage;
import Pages.PhotosPage;
import org.testng.annotations.Test;

/**
 * Created by klenova on 26.01.2018.
 */
public class DeleteBoard extends BaseTest {
    @Test(priority = 0)
    public void deleteBoard() {
        String boardName = "TestBoard_4";

        BoardPage boardPage = new BoardPage();
        boardPage.createBoard("boardName");
        boardPage.verifyBoardCreated(boardName);
        PhotosPage photosPage = new PhotosPage();
        photosPage.openPhotosPartitian();
        photosPage.openConcreatePhoto("https://www.istockphoto.com/photo/parisian-selfie-gm478130948-67446427");
        photosPage.addPhotoToBoard();
        photosPage.verifyPhotoAdded("1");
        boardPage.removePhotoFromBoard();
        boardPage.verifyPhotoRemoved();
        boardPage.deleteBoard();
        //boardPage.verifyBoardDeleted();
    }
}




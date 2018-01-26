package Test;

import Pages.PhotosPage;
import Pages.BoardPage;
import org.testng.annotations.Test;

/**
 * Created by klenova on 26.01.2018.
 */
public class RemovePhotoFromBoard extends  BaseTest{
    @Test(priority = 2)
    public void RemovePhotoFromBoard() {
        String boardName = "TestBoard_3";

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
    }
}

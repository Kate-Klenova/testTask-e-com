package Pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by klenova on 25.01.2018.
 */
public class LoginPage {

    public void userLogin(String login, String password) {
        open("https://www.istockphoto.com/");
        $(By.xpath("//a[text()='Sign in']")).click();
        $(By.id("new_session_username")).sendKeys(login);
        $(By.id("new_session_password")).sendKeys(password);
        $(By.id("sign_in")).click();
    }
}

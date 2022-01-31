package starter.ui.dashboard.login;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.applitools.com/hackathon.html")
public class LoginForm extends PageObject {

    public static By USERNAME_FIELD = By.id("username");
    public static By PASSWORD_FIELD = By.id("password");
    public static By BUTTON_LOGIN = By.id("log-in");

}


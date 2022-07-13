package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {

    public void inputUsername(String username) {
        By element = By.id("user-name");
        typeOn(element, username);
    }

    public void inputPassword(String password) {
        By element = By.id("password");
        typeOn(element, password);
    }

    public void clickButtonLogin() {
        By element = By.id("login-button");
        clickOn(element);
    }

    public boolean isSuccessLogin() {
        By element = By.xpath("//span[contains(text(),'Products')]");
        return isPresent(element);
    }
}

package demo.steps_definition;

import demo.pages.base.page_object.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @When("User input {string} and {string}")
    public void inputUsernameAndPassword(String username, String password) {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
    }

    @Given("User click button login")
    public void clickButtonLogin() {
        loginPage.clickButtonLogin();
    }

    @Given("User success login")
    public void isSuccessLogin() {
        Assert.assertTrue(loginPage.isSuccessLogin());
    }
}

package demo.steps_definition;

import demo.pages.base.page_object.LoginPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class LoginStep {

    LoginPages loginPage = new LoginPages();

    @Given("user input {string} and {string}")
    public void inputUsernameAndPassword(String username, String password) {
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
    }

    @And("user click login button")
    public void clickButtonLogin() {
        loginPage.clickButtonLogin();
    }

    @Then("user success login")
    public void isSuccessLogin() {
        Assert.assertTrue(loginPage.isSuccessLogin());
    }

}

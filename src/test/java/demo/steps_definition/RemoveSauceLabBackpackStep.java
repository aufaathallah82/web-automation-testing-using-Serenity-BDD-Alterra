package demo.steps_definition;


import demo.pages.base.page_object.RemoveSauceLabBackpackBtn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class RemoveSauceLabBackpackStep {

    RemoveSauceLabBackpackBtn  removesaucelabbackpackbtn  = new RemoveSauceLabBackpackBtn();

    @Given("user click the shopping cart")
    public void userClickShoppingCart() { removesaucelabbackpackbtn.clickShoppingCart();}


    @Then("user can see cart list")
    public void isSuccessShoppingCart()
    {Assert.assertTrue( removesaucelabbackpackbtn.isSuccessShoppingCart());}
}

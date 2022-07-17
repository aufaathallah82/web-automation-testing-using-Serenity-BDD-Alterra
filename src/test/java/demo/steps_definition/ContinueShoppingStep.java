package demo.steps_definition;

import demo.pages.base.page_object.ContinueShoppingBtn ;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class ContinueShoppingStep {

    ContinueShoppingBtn  continueshoppingbtn  = new ContinueShoppingBtn ();

    @Given("user click continue shopping button")
    public void userContinueShopping() { continueshoppingbtn.clickContinueShopping();}


    @Then("user can see page wrapper")
    public void isSuccessContinueShopping()
    {Assert.assertTrue( continueshoppingbtn.isSuccessContinueShopping());}
}

package demo.steps_definition;

import demo.pages.base.page_object.AddToCartPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class AddToCartStep {

    AddToCartPages addToCartPages = new AddToCartPages();

    @Given("user click add to cart")
    public void userClickAddToCart() { addToCartPages.clickAddToCart();
    }


    @Then("user can see the shopping cart added")
    public void isSuccessAddToCart()
    {
        Assert.assertTrue(addToCartPages.isSuccessAddToCart());
    }
}

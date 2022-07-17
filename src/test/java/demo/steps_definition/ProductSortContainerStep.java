package demo.steps_definition;

import demo.pages.base.page_object.ProductSortContainer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProductSortContainerStep {
    ProductSortContainer productsortcontainer= new ProductSortContainer();

    @Given("user click Product Sort Container")
    public void userClickProductSortContainerStep() { productsortcontainer. clickProductSortContainer();
    }

    @Then("user can see the list")
    public void isSuccessProductSortContainerStep()
    {Assert.assertTrue(productsortcontainer.isSuccessProductSortContainer());}
}

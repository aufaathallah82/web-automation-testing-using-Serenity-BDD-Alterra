package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class RemoveSauceLabBackpackBtn extends BasePageObject {

    public void clickShoppingCart() {
        By element = By.id("shopping_cart_container");
        clickOn(element);
    }

    public boolean isSuccessShoppingCart() {
        By element = By.id("page_wrapper");
        return isPresent(element);
    }
}


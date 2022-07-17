package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class AddToCartPages extends BasePageObject {

    public void clickAddToCart() {
        By element = By.id("add-to-cart-sauce-labs-backpack");
        clickOn(element);
    }

    public boolean isSuccessAddToCart() {
        By element = By.xpath("//span[contains(text(),'1')]");
        return isPresent(element);
    }
}


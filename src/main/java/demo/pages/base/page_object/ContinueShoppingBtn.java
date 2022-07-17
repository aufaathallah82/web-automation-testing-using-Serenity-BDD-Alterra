package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class ContinueShoppingBtn extends BasePageObject {

    public void clickContinueShopping() {
        By element = By.id("continue-shopping");
        clickOn(element);
    }

    public boolean isSuccessContinueShopping() {
        By element = By.id("page_wrapper");
        return isPresent(element);
    }
}


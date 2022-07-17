package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class ProductSortContainer extends BasePageObject{

    public void clickProductSortContainer() {
        By element = By.className("select_container");
        clickOn(element);
    }
    public boolean isSuccessProductSortContainer() {
        By element = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[1]");
        return isPresent(element);
    }
}

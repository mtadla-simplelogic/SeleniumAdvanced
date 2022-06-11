package pages.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#quantity_wanted")
    private WebElement productQuantity;


    @FindBy(css = ".add-to-cart")
    private WebElement addToCartBtn;

    public ProductDetailsPage setQuantity(int quantity) {
        sendKeysWithClear(productQuantity, String.valueOf(quantity));
        return this;
    }

    public void addToCart() {
        click(addToCartBtn);
    }
}

package pages.products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[data-id_customization='0']")
    private WebElement productName;

    @FindBy(css = ".current-price")
    private WebElement productPrice;

    @FindBy(css = "span.product-price")
    private WebElement totalProductPrice;

    @FindBy(css = ".js-cart-line-product-quantity")
    private WebElement productQuantity;

    @FindBy(css = ".remove-from-cart")
    private WebElement removeFromCartBtn;


    @FindBy(css = ".checkout .btn-primary")
    private WebElement proceedToCheckoutBtn;

    public String getProductName() {
        return productName.getText();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public String getTotalProductPrice() {
        return totalProductPrice.getText();
    }

    public String getProductQuantity() {
        return productQuantity.getAttribute("value");
    }

    public void removeProductFromCart() {
        click(removeFromCartBtn);
    }

    public String getEmptyBasketMsg() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[data-id_customization='0']")));
        return driver.findElement(By.cssSelector(".no-items")).getText();
    }

    public void proceedToCheckout() {
        click(proceedToCheckoutBtn);
    }
}

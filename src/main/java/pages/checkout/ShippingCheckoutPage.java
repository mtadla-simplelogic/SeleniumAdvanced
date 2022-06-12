package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class ShippingCheckoutPage extends BasePage {
    public ShippingCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#checkout-delivery-step [type='radio']")
    private WebElement asd;

    @FindBy(css = "[name='confirmDeliveryOption']")
    private WebElement confirmDeliveryOption;

    public void confirmDeliveryOption() {
        System.out.println("xxxxxxxxxxxxxxx" + asd.isSelected());
        click(confirmDeliveryOption);
    }
}

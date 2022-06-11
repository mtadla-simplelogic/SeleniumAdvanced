package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class CheckoutConfirmationPage extends BasePage {
    public CheckoutConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".h1")
    private WebElement orderConfirmationMsg;

    @FindBy(xpath = "//div[@id='order-details']//li[1]")
    private WebElement orderNumber;

    public String getOrderNumber() {
        return orderNumber.getText().replace("Order reference: ", "");
    }

    public String getOrderConfirmationMsg() {
        return orderConfirmationMsg.getText();
    }


}

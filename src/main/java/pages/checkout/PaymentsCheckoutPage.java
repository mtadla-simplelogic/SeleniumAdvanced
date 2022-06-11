package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class PaymentsCheckoutPage extends BasePage {
    public PaymentsCheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#payment-option-1")
    private WebElement peyByCheck;

    @FindBy(css = "[id='conditions_to_approve[terms-and-conditions]']")
    private WebElement agreeToThermsOfService;

    public PaymentsCheckoutPage peyByCheck(){
        click(peyByCheck);
        return this;
    }

    public void agreeToThermsOfService(){
        click(agreeToThermsOfService);
    }

}

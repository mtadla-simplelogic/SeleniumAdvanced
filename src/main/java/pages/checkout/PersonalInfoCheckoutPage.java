package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.user.RegistrationPage;

public class PersonalInfoCheckoutPage extends RegistrationPage {
    public PersonalInfoCheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#customer-form .continue")
    private WebElement continueBtn;

    public void goToAddressCheckoutStep() {
        click(continueBtn);
    }
}

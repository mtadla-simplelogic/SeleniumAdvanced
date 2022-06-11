package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;

public class AddressCheckoutPage extends BasePage {
    public AddressCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name='address1']")
    private WebElement address;

    @FindBy(css = "[name='city']")
    private WebElement city;

    @FindBy(css = "[name='postcode']")
    private WebElement postcode;
    @FindBy(css = "[name='id_state']")
    private WebElement state;

    @FindBy(css = "[name='confirm-addresses']")
    private WebElement confirmAddresses;

    public AddressCheckoutPage setAddress(String address) {
        sendKeys(this.address, address);
        return this;
    }

    public AddressCheckoutPage setCity(String city) {
        sendKeys(this.city, city);
        return this;
    }

    public AddressCheckoutPage setPostcode(String postcode) {
        sendKeys(this.postcode, postcode);
        return this;

    }

    public AddressCheckoutPage selectState(String state) {
        new Select(this.state).selectByVisibleText(state);
        return this;

    }

    public void confirmAddresses() {
        click(confirmAddresses);
    }
}

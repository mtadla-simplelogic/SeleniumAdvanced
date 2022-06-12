package steps;

import helpers.RandomHelper;
import models.SocialTitle;
import org.openqa.selenium.WebDriver;
import pages.checkout.AddressCheckoutPage;
import pages.checkout.PersonalInfoCheckoutPage;

public class CheckoutSteps {
    private WebDriver driver;

    public CheckoutSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void fillAddressInfo() {
        new AddressCheckoutPage(driver).setAddress("testtest")
                .selectState("Arizona")
                .setPostcode("77777")
                .setCity("xxxx")
                .confirmAddresses();
    }

    public void fillPersonalInfo() {
        new PersonalInfoCheckoutPage(driver)
                .selectSocialTitle(SocialTitle.Mr)
                .setFirstName("Jan")
                .setLastName("Kowalski")
                .setEmail(RandomHelper.getRandomEmail())
                .setPassword("123qwe")
                .acceptPolices();
    }
}

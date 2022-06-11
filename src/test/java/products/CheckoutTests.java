package products;

import base.Pages;
import helpers.RandomHelper;
import models.SocialTitle;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.checkout.PersonalInfoCheckoutPage;

public class CheckoutTests extends Pages {

    @Test
    public void shouldBuyProduct(){
        productsGridPage.openProductWithName("HUMMINGBIRD T-SHIRT");

        productDetailsPage.addToCart();

        cartPopupPage.proceedToCheckout();

        cartPage.proceedToCheckout();

        personalInfoCheckoutPage
                .selectSocialTitle(SocialTitle.Mr)
                .setFirstName("Jan")
                .setLastName("Kowalski")
                .setEmail(RandomHelper.getRandomEmail())
                .setPassword("123qwe")
                .acceptPolices();

        personalInfoCheckoutPage.goToAddressCheckoutStep();

        addressCheckoutPage.setAddress("testtest")
                .selectState("Arizona")
                .setPostcode("77777")
                .setCity("xxxx")
                .confirmAddresses();

        shippingCheckoutPage.confirmDeliveryOption();

        paymentsCheckoutPage.peyByCheck()
                .agreeToThermsOfService()
                .confirmPayment();

        Assertions.assertThat(checkoutConfirmationPage.getOrderConfirmationMsg()).contains("YOUR ORDER IS CONFIRMED");

        String orderNumber = checkoutConfirmationPage.getOrderNumber();

        topMenuPage.goToMyAccount();

        myAccountPage.goToHistoryOfOrders();
        // pkt 5 do zmiennej zapisz wygenerowany numer zamowienia

        // przejdz do 'Your account'
        // przejdz do ORDER HISTORY AND DETAILS
        // sprawdz czy na stronie z historia zamowien znajduje się numer zamowienia z pkt 5

        // otworz zamowienie o numerze z pkt 5
        // sprzeczy czy tekst "Order Reference JBCERFQZQ - placed on 06/11/2022" zawiera numer zamowienia z pkt5
        // ****dla chetnych spr pozostałe szczegoly zamowienia

    }
}

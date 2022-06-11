package products;

import base.Pages;
import helpers.RandomHelper;
import models.SocialTitle;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

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

        assertThat(checkoutConfirmationPage.getOrderConfirmationMsg()).contains("YOUR ORDER IS CONFIRMED");

        String orderNumber = checkoutConfirmationPage.getOrderNumber();
        assertThat(orderNumber).isNotEmpty();

        topMenuPage.goToMyAccount();

        myAccountPage.goToHistoryOfOrders();

        assertThat(historyOfOrdersPage.getOrdersNumbers()).contains(orderNumber);

        historyOfOrdersPage.openOrder(orderNumber);

        assertThat(orderDetailsPage.getOrderInfos()).contains(orderNumber);
    }
}

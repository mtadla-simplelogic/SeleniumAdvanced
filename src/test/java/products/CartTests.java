package products;

import base.Pages;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class CartTests extends Pages {

    @Test
    public void shouldAddProductToCart() {
        productsGridPage.openProductWithName("HUMMINGBIRD T-SHIRT");

        productDetailsPage.setQuantity(3)
                .addToCart();

        cartPopupPage.proceedToCheckout();

        Assertions.assertThat(cartPage.getProductName()).isEqualTo("HUMMINGBIRD T-SHIRT");
        Assertions.assertThat(cartPage.getProductQuantity()).isEqualTo("3");
        Assertions.assertThat(cartPage.getProductPrice()).isEqualTo("$19.12");
        Assertions.assertThat(cartPage.getTotalProductPrice()).isEqualTo("$57.36");

        cartPage.removeProductFromCart();
        Assertions.assertThat(cartPage.getEmptyBasketMsg()).isEqualTo("There are no more items in your cart");
    }
}

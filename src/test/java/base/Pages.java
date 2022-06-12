package base;

import org.testng.annotations.BeforeMethod;
import pages.commons.*;
import pages.products.*;
import pages.checkout.*;
import pages.user.*;

public class Pages extends TestBase {
    public LoginPage loginPage;
    public CategoryPage categoryPage;
    public RegistrationPage registrationPage;
    public TopMenuPage topMenuPage;
    public ProductsGridPage productsGridPage;
    public ProductDetailsPage productDetailsPage;
    public CartPopupPage cartPopupPage;
    public CartPage cartPage;
    public AddressCheckoutPage addressCheckoutPage;
    public CheckoutConfirmationPage checkoutConfirmationPage;
    public PaymentsCheckoutPage paymentsCheckoutPage;
    public PersonalInfoCheckoutPage personalInfoCheckoutPage;
    public ShippingCheckoutPage shippingCheckoutPage;
    public HistoryOfOrdersPage historyOfOrdersPage;
    public OrderDetailsPage orderDetailsPage;
    public MyAccountPage myAccountPage;

    @BeforeMethod
    public void pagesSetup() {
        categoryPage = new CategoryPage(driver);
        addressCheckoutPage = new AddressCheckoutPage(driver);
        paymentsCheckoutPage = new PaymentsCheckoutPage(driver);
        checkoutConfirmationPage = new CheckoutConfirmationPage(driver);
        personalInfoCheckoutPage = new PersonalInfoCheckoutPage(driver);
        shippingCheckoutPage = new ShippingCheckoutPage(driver);
        historyOfOrdersPage = new HistoryOfOrdersPage(driver);
        orderDetailsPage = new OrderDetailsPage(driver);
        myAccountPage = new MyAccountPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        cartPopupPage = new CartPopupPage(driver);
        cartPage = new CartPage(driver);
        productsGridPage = new ProductsGridPage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        topMenuPage = new TopMenuPage(driver);
    }
}

package base;

import org.testng.annotations.BeforeMethod;
import pages.commons.ProductsGridPage;
import pages.commons.TopMenuPage;
import pages.products.CartPage;
import pages.products.CartPopupPage;
import pages.products.ProductDetailsPage;
import pages.user.LoginPage;
import pages.user.RegistrationPage;

public class Pages extends TestBase {
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public TopMenuPage topMenuPage;
    public ProductsGridPage productsGridPage;
    public ProductDetailsPage productDetailsPage;
    public CartPopupPage cartPopupPage;
    public CartPage cartPage;

    @BeforeMethod
    public void pagesSetup() {
        productDetailsPage = new ProductDetailsPage(driver);
        cartPopupPage = new CartPopupPage(driver);
        cartPage = new CartPage(driver);
        productsGridPage = new ProductsGridPage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        topMenuPage = new TopMenuPage(driver);
    }
}

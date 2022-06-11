package base;

import org.testng.annotations.BeforeMethod;
import pages.commons.ProductsGridPage;
import pages.commons.TopMenuPage;
import pages.user.LoginPage;
import pages.user.RegistrationPage;

public class Pages extends TestBase {
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public TopMenuPage topMenuPage;
    public ProductsGridPage productsGridPage;

    @BeforeMethod
    public void pagesSetup() {
        productsGridPage = new ProductsGridPage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        topMenuPage = new TopMenuPage(driver);
    }
}

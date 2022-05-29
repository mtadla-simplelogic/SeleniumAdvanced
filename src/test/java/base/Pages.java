package base;

import org.testng.annotations.BeforeMethod;
import pages.commons.TopMenuPage;
import pages.user.LoginPage;
import pages.user.RegistrationPage;

public class Pages extends TestBase {
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public TopMenuPage topMenuPage;

    @BeforeMethod
    public void pagesSetup() {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        topMenuPage = new TopMenuPage(driver);
    }
}

package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".no-account a")
    private WebElement goToRegistrationBtn;

    public RegistrationPage goToRegistration(){
        click(goToRegistrationBtn);
        return new RegistrationPage(driver);
    }
}

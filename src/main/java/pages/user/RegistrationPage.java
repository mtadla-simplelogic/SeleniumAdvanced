package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "id_gender")
    private List<WebElement> genders;

    @FindBy(name = "firstname")
    private WebElement firstName;

    @FindBy(name = "lastname")
    private WebElement lastName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "customer_privacy")
    private WebElement customerPrivacyCbx;

    @FindBy(name = "psgdpr")
    private WebElement psgdprCbx;

    @FindBy(name = ".form-footer button")
    private WebElement saveBtn;

    public void selectMale() {
        genders.get(0).click();
    }

    public void setFirstName(String firstName) {
        sendKeys(this.firstName, firstName);
    }

    public void setLastName(String lastName) {
        sendKeys(this.lastName, lastName);
    }

    public void setEmail(String email) {
        sendKeys(this.email, email);
    }

    public void setPassword(String password) {
        sendKeys(this.password, password);
    }

    public void acceptPolices() {
        click(customerPrivacyCbx);
        click(psgdprCbx);
    }

    public void submitForm() {
        click(saveBtn);
    }

}

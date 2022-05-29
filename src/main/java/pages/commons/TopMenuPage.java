package pages.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.user.LoginPage;

public class TopMenuPage extends BasePage {
    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".user-info a")
    private WebElement goToSignInBtn;

    @FindBy(css = ".account span")
    private WebElement userName;

    public LoginPage goToSignIn(){
        click(goToSignInBtn);
        return new LoginPage(driver);
    }

    public String getLoggedInUserName(){
        return userName.getText();
    }

}

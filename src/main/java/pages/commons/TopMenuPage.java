package pages.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.user.LoginPage;

import java.util.List;

public class TopMenuPage extends BasePage {
    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name='s']")
    private WebElement searchInput;

    @FindBy(css = "#search_widget .search")
    private WebElement searchBtn;

    @FindBy(css = ".user-info a")
    private WebElement goToSignInBtn;

    @FindBy(css = ".account span")
    private WebElement userName;

    @FindBy(css = "#top-menu > .category")
    private List<WebElement> categories;

    public LoginPage goToSignIn() {
        click(goToSignInBtn);
        return new LoginPage(driver);
    }

    public void goToMyAccount() {
        click(userName);
    }

    public String getLoggedInUserName() {
        return userName.getText();
    }

    public void searchForProduct(String productToSearch) {
        sendKeys(searchInput, productToSearch);
        click(searchBtn);
    }

    public String getNameOfCategory(int categoryNumber) {
        return categories.get(categoryNumber).getText();
    }

    public void openCategory(String categoryName) {
        for (WebElement category : categories) {
            if (category.getText().equals(categoryName)) {
                click(category);
                return;
            }
        }
    }

    public void openCategory(int categoryNumber) {
        click(categories.get(categoryNumber));

    }

    public int getNumerOfCategories() {
        return categories.size();
    }
}

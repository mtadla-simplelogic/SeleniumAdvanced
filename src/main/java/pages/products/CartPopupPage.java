package pages.products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

public class CartPopupPage extends BasePage {
    public CartPopupPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".modal-content .btn-primary")
    private WebElement proceedToCheckoutBtn;

    public void proceedToCheckout() {
        waitForPopup();
        click(proceedToCheckoutBtn);
    }

    private void waitForPopup(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".modal-content .btn-primary")));
    }
}

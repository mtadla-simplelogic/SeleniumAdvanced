package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#history-link")
    private WebElement historyOfOrders;

    public void goToHistoryOfOrders() {
        click(historyOfOrders);
    }
}

package pages.user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.ArrayList;
import java.util.List;

public class HistoryOfOrdersPage extends BasePage {
    public HistoryOfOrdersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[scope='row']")
    private List<WebElement> ordersNumbers;

    @FindBy(css = "tbody tr")
    private List<WebElement> orderRows;

    public List<String> getOrdersNumbers() {
        List<String> ordersNumbers = new ArrayList<>();

        for (WebElement orderNumber : this.ordersNumbers){
            ordersNumbers.add(orderNumber.getText());
        }
        return ordersNumbers;
    }

    public void openOrder(String orderToOpen) {
        for (WebElement row : orderRows){
            if(row.getText().contains(orderToOpen)){
                click(row.findElement(By.cssSelector("[data-link-action='view-order-details']")));
            }
        }
    }
}

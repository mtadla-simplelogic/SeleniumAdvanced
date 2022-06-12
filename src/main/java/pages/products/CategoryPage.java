package pages.products;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class CategoryPage extends BasePage {
    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="h1")
    private WebElement categoryTitle;

    public String getTitle(){
        return categoryTitle.getText();
    }
}

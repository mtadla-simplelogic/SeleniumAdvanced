package pages.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

import java.util.ArrayList;
import java.util.List;

public class ProductsGridPage extends BasePage {
    public ProductsGridPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".total-products")
    private WebElement totalProducts;

    public List<WebElement> getProducts(int expectedAmountOfProducts) {
        return wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".product-title"), expectedAmountOfProducts));
    }


    public String getRandomProductNameFromHomePage() {
        return getRandomElement(getProducts(8)).getText();
    }

    public List<String> getProductNames() {
        List<String> productsNames = new ArrayList<>();

        List<WebElement> products = getProducts(getQuantityOfProducts());

        for (WebElement product : products) {
            productsNames.add(product.getText());
        }
        return productsNames;
    }

    private int getQuantityOfProducts() {
        String quantityOfProducts = totalProducts.getText()
                .replace("There is ", "")
                .replace(" product.", "");

        return Integer.parseInt(quantityOfProducts);
    }

    public void openProductWithName(String productName) {
        for (WebElement element : getProducts(8)){
            if(element.getText().equals(productName)){
                element.click();
                return;
            }
        }
    }
}

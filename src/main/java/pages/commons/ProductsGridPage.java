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

    @FindBy(css = ".product-title")
    private List<WebElement> allProducts;

    public List<WebElement> getProducts(int expectedAmountOfProducts) {
        return wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".product-title"), expectedAmountOfProducts));
    }


    public String getRandomProductNameFromHomePage() {
        return getRandomElement(getProducts(8)).getText();
    }

    public List<String> getProductNames() {
        List<String> productsNames = new ArrayList<>();

        for (WebElement product : getProducts(getQuantityOfProductsFromCategoryHeader())) {
            productsNames.add(product.getText());
        }
        return productsNames;
    }

    public int getQuantityOfProducts() {
        return allProducts.size();
    }

    public int getQuantityOfProductsFromCategoryHeader() {
        String quantityOfProducts = totalProducts.getText()
                .replace("There is ", "")
                .replace(" product.", "")
                .replace("There are ", "")
                .replace(" products.", "");

        return Integer.parseInt(quantityOfProducts);
    }

    public void openProductWithName(String productName) {
        for (WebElement element : getProducts(8)) {
            if (element.getText().equals(productName)) {
                element.click();
                return;
            }
        }
    }
}

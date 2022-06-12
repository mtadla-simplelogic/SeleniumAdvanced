package products;

import base.Pages;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CategoryTest extends Pages {

    @Test
    public void shouldVerifyCategoriesHardcoded() {
        verifyCategory("CLOTHES");
        verifyCategory("ACCESSORIES");
        verifyCategory("ART");
    }

    @Test
    public void shouldVerifyCategoriesDynamic() {








        assertThat(topMenuPage.getNumerOfCategories()).isNotZero();

        for (int i = 0; i < topMenuPage.getNumerOfCategories(); i++) {
            verifyCategory(i);
        }
    }

    private void verifyCategory(int categoryNumber) {
        verifyCategory(topMenuPage.getNameOfCategory(categoryNumber));
    }

    private void verifyCategory(String categoryName) {
        topMenuPage.openCategory(categoryName);
        int expectedProductQuantity = productsGridPage.getQuantityOfProductsFromCategoryHeader();
        assertThat(productsGridPage.getQuantityOfProducts()).isEqualTo(expectedProductQuantity);
        assertThat(categoryPage.getTitle()).isEqualTo(categoryName);
    }
}

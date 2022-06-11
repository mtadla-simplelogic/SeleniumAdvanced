package products;

import base.Pages;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests extends Pages {

    @Test
    public void shouldFindProductWithName() {
        String productToSearch = productsGridPage.getRandomProductNameFromHomePage();

        topMenuPage.searchForProduct(productToSearch);

        List<String> searchResults = productsGridPage.getProductNames();

        Assertions.assertThat(searchResults).isNotEmpty();

        SoftAssertions softAssertions = new SoftAssertions();

        for (String searchResult : searchResults){
            softAssertions.assertThat(searchResult).contains(productToSearch);
        }

        softAssertions.assertAll();
    }
}

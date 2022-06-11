package products;

import base.Pages;
import org.testng.annotations.Test;

public class CheckoutTests extends Pages {

    @Test
    public void shouldBuyProduct(){
        productsGridPage.openProductWithName("HUMMINGBIRD T-SHIRT");

        productDetailsPage.addToCart();

        cartPopupPage.proceedToCheckout();

        // w koszyku clikc -> Proceed to checkout
        // 1 PERSONAL INFORMATION -> wypelnienie wymaganych danych
        // klikamy continue

        // 2 ADDRESSES -> wymagane dane
        // klikamy continue


        // 3 SHIPPING METHOD ->  klikamy continue

        //4 PAYMENT -> zaznacz Pay by Check i checkbox I agree to the terms of service
        // klik Place order

        // sprzawczy czy tekst YOUR ORDER IS CONFIRMED zostal wyswietlony
        // ***dla chętnych: weryfikacja danych kupionego produktu (nazwa, cena, ilosc, cena laczna)

        // pkt 5 do zmiennej zapisz wygenerowany numer zamowienia

        // przejdz do 'Your account'
        // przejdz do ORDER HISTORY AND DETAILS
        // sprawdz czy na stronie z historia zamowien znajduje się numer zamowienia z pkt 5

        // otworz zamowienie o numerze z pkt 5
        // sprzeczy czy tekst "Order Reference JBCERFQZQ - placed on 06/11/2022" zawiera numer zamowienia z pkt5
        // ****dla chetnych spr pozostałe szczegoly zamowienia

    }
}
package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ProductsTest extends BaseTest {

    @Test
    public void buyProduct() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.openCart();
        assertTrue(cartPage.getAddedProductsNames().contains("Sauce Labs Backpack"));
    }
}
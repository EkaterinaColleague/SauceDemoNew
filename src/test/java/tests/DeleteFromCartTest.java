package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DeleteFromCartTest extends BaseTest {
    private static final By CART_CONTAINER = By.id("shopping_cart_container");

    @Test
    public void deleteFromCArtTest() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.openCart();
        cartPage.deleteItem();
        assertEquals(driver.findElement(CART_CONTAINER).getText(), "");
    }
}

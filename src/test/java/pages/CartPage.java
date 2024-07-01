package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.AllureUtils;

import java.util.ArrayList;
import java.util.List;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    private final By ITEM_NAME = By.cssSelector(".inventory_item_name");
    private final By GOODS_NAME = By.id("remove-sauce-labs-backpack");

    @Step("Проверяем наличие товаров в корзине")
    public ArrayList<String> getAddedProductsNames() {
        List<WebElement> allProductsNames = driver.findElements(ITEM_NAME);
        ArrayList<String> names = new ArrayList<>();
        for (WebElement productChosen : allProductsNames)
            names.add(productChosen.getText());
        return names;
    }

    @Step("Удаление товара из корзины")
    public void deleteItem() {

        driver.findElement(GOODS_NAME).click();
        AllureUtils.takeScreenshot(driver);
    }
}
package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AllureUtils;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private final By TITLE = By.xpath("//*[@class= 'title']");
    private final By CART = By.cssSelector(".shopping_cart_link");
    private final String ADD_TO_CART_PATTERN = "//div[text() = '%s']//ancestor:: div[@class = 'inventory_item']//button[text() ='Add to cart']";

    public String getTitle() {
        return driver.findElement(TITLE).getText();
    }

    @Step("Добавляем товар в корзину")
    public void addToCart(String product) {
        By addToCartButton = By.xpath(String.format(ADD_TO_CART_PATTERN, product));
        driver.findElement(addToCartButton).click();
        AllureUtils.takeScreenshot(driver);
    }

    public void openCart() {
        driver.findElement(CART).click();
        AllureUtils.takeScreenshot(driver);
    }
}

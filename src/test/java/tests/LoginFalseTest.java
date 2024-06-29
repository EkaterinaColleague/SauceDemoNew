package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginFalseTest extends BaseTest{
    @Test
    public void LoginFalse() {
        loginPage.open();
        loginPage.login("Katy_user","secret_sauce");
        assertEquals(driver.findElement(By.xpath("//*[@class= 'error-message-container error']")).getText(), "Epic sadface: Username and password do not match any user in this service");
    }
}

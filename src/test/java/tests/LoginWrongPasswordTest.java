package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginWrongPasswordTest extends BaseTest {
    @Test
    public void LoginWrongPassword() {
        loginPage.open();
        loginPage.login("locked_out_user","secret");
        assertEquals(driver.findElement(By.xpath("//*[@class= 'error-message-container error']")).getText(), "Epic sadface: Username and password do not match any user in this service");
    }
}

package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginNoPasswordTest extends BaseTest{
    @Test
    public void LoginNoPassword() {
        loginPage.open();
        loginPage.login("standard_user","");
        assertEquals(driver.findElement(By.xpath("//*[@class= 'error-message-container error']")).getText(), "Epic sadface: Password is required");
    }
}

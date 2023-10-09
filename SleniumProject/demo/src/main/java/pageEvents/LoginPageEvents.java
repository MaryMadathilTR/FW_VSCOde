package pageEvents;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.LoginPageObjects;
import utils.ElementFetch;
import java.util.List;

public class LoginPageEvents {
    ElementFetch elementFetch = new ElementFetch();
    // create method to verify we are on login page

    public void verifyLoginPage() {

        // using object of elementfetch verify login page has login button
        List<WebElement> loginButtons = elementFetch.getWebElements("xpath", LoginPageObjects.loginButtonXpath);
        Assert.assertTrue(loginButtons.size() > 0);
    }

    // create functon to login
    public void login(String email, String password) {
        // using object of elementfetch enter email
        elementFetch.getWebElement("xpath", LoginPageObjects.emailTextBoxId).sendKeys(email);
        // using object of elementfetch enter password
        elementFetch.getWebElement("xpath", LoginPageObjects.passwordTextBoxId).sendKeys(password);
        // using object of elementfetch click on login button
        elementFetch.getWebElement("xpath", LoginPageObjects.loginButtonXpath).click();
    }

}

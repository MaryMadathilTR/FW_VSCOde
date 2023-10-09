package pageEvents;

import pageObjects.HomePageObjects;
import utils.ElementFetch;

public class HomePageEvents {
    ElementFetch elementFetch = new ElementFetch();

    public void signIn() {
        elementFetch.getWebElement("xpath", HomePageObjects.loginLinkXpath).click();
    }

    // create a method to click on link fillout form from HomePAgeObjects class
    public void clickFillOutForms() {
        elementFetch.getWebElement("xpath", HomePageObjects.FillOutFormsinkXpath).click();
    }

}

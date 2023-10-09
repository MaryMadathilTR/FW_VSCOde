package pageEvents;

import utils.ElementFetch;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.CollectionPageObjects;

public class CollectionsPageEvents {
    // create object of FetchElement
    ElementFetch elementFetch = new ElementFetch();

    // verify the presence of all course link using Elementfetch
    public void verifyAllCourseLinksPresence() {
        // verify the presence of 'allcourse' link using Elementfetch
        Assert.assertTrue(elementFetch.getWebElement("xpath", CollectionPageObjects.collectionLinkXpath).isDisplayed());

    }

}

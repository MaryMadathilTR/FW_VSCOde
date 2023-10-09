package pageEvents;

import org.testng.Assert;
import utils.ElementFetch;
import pageObjects.FilloutFormsPageObjects;

public class FilloutFormsEvents {

        // create object of elementfetch
        ElementFetch elementFetch = new ElementFetch();

        // create a method to verify that we are on fillout forms page
        public void verifyFilloutFormsPage() {
                // using object of elementfetch verify that we are on fillout forms page
                Assert.assertTrue(elementFetch
                                .getWebElement("xpath", FilloutFormsPageObjects.filloutFormsNameTextBox1_Xpath)
                                .isDisplayed());
                Assert.assertTrue(elementFetch
                                .getWebElement("xpath",
                                                FilloutFormsPageObjects.filloutFormsNameTextBox2_Xpath)
                                .isDisplayed());
                Assert.assertTrue(elementFetch
                                .getWebElement("xpath",
                                                FilloutFormsPageObjects.filloutFormsMsgTextBox1_Xpath)
                                .isDisplayed());
                Assert.assertTrue(elementFetch
                                .getWebElement("xpath",
                                                FilloutFormsPageObjects.filloutFormsMsgTextBox2_Xpath)
                                .isDisplayed());

        }

}

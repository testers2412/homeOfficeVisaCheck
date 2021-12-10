package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {
    public ResultPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div/div/main[@role='main']/div/div/div[@data-module='track-results']/h2[1]")
    WebElement resultMessage;

        public String getResultMessage(){

            String result = pmGetTextFromElement(resultMessage);

            return result;
        }

    public void verifyResultMessage(String expectedMessage){

            if (getResultMessage().equalsIgnoreCase(expectedMessage)){
                Assert.assertTrue(true);
            } else {
                Assert.fail();
            }
        }
}


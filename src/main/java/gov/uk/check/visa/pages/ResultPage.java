package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    public ResultPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div/div/main[@role='main']/div/div/div[@data-module='track-results']/h2[1]")
    WebElement resultMessage;
    public void verifyResultMessage(String expectedMessage){
        pmVerifyElements(resultMessage,expectedMessage,"Wrong Page");
    }
}

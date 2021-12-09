package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> immigrationStatus;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    public void selectFamilyMembersImmigrationStatus(String reply){
        for(WebElement status : immigrationStatus){
            if(status.getText().equalsIgnoreCase(reply)){
                pmClickOnElement(status);
                Reporter.log("Select family member's immigration status : "+reply+"<br>");
                break;
            }
        }

    }
    public void clickOnContinue(){
        pmClickOnElement(continueButton);
    }

}

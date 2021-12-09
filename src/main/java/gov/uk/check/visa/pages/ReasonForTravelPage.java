package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//main[@role='main']//label")
   List<WebElement> reasonForTravel;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectReasonForTravel(String reason){
        for (WebElement res : reasonForTravel) {
            if (res.getText().equalsIgnoreCase(reason)) {
                pmClickOnElement(res);
                Reporter.log("Select reason for travel : " + reason + "<br>");
                break;
            }
        }
    }
    public void clickOnContinue(){
        Reporter.log("Click on continue : "+ continueButton.toString()+"<br>");
        pmClickOnElement(continueButton);
    }



}

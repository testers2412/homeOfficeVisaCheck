package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@class='govuk-select']")
    WebElement nationalityDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;
    public void selectNationality(String country){
        Reporter.log("Select the country  : "+ nationalityDropDown.toString()+"<br>");
        pmSelectByContainsTextFromDropDown(nationalityDropDown,country);
    }
    public void clickOnContinue(){
        Reporter.log("Click on continue button : "+ continueButton.toString()+"<br>");
        pmClickOnElement(continueButton);
    }


}

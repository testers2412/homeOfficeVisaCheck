package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;
    public StartPage (){
        PageFactory.initElements(driver,this);}
    public void clickStartNow(){
        Reporter.log("Click on start button : "+ startNowButton.toString()+"<br>");
        pmClickOnElement(startNowButton);
    }
}

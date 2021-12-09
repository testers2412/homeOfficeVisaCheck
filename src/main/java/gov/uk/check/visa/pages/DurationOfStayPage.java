package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class DurationOfStayPage extends Utility {
public DurationOfStayPage(){
    PageFactory.initElements(driver,this);
}
@CacheLookup
    @FindBy(xpath = "//main[@role='main']//label")
    List<WebElement> durationTabs;
@CacheLookup
@FindBy(xpath = "//button[normalize-space()='Continue']")
WebElement continueButton;
public void selectDurationOfStay(String duration){
    for(WebElement dur : durationTabs){
        if(dur.getText().equalsIgnoreCase(duration)){
            pmClickOnElement(dur);
            Reporter.log("Select Duration of Stay : "+ duration+"<br>");
            break;
        }
    }

}
public void clickOnContinue(){
    pmClickOnElement(continueButton);
}


}


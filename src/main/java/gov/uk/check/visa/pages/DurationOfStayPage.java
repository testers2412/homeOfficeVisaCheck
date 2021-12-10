package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DurationOfStayPage extends Utility {
public DurationOfStayPage(){
    PageFactory.initElements(driver,this);
}
@CacheLookup
    @FindBy(xpath = "//main[@role='main']//label")
    List<WebElement> durationTabs;
    @CacheLookup
    @FindBy(xpath = "//label[@for='response-1']")
    WebElement longerThen6;
    @FindBy(xpath = "//label[@for='response-0']")
    WebElement lessThen6;

@CacheLookup
@FindBy(xpath = "//button[normalize-space()='Continue']")
WebElement continueButton;
public void selectDurationOfStay(String duration){
    /*for(WebElement dur : durationTabs){
        if(dur.getText().equalsIgnoreCase(duration)){
            pmClickOnElement(dur);
            Reporter.log("Select Duration of Stay : "+ duration+"<br>");
            break;
        }
    }*/
    switch (duration){
        case "longer than 6 months" :
            pmClickOnElement(longerThen6);
            break;
        case "6 months or less" :
            pmClickOnElement(lessThen6);
            break;
    }

}
public void clickOnContinue(){
    pmClickOnElement(continueButton);
}


}


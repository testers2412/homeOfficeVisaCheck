package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {
    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    DurationOfStayPage durationOfStayPage;
    WorkTypePage workTypePage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage= new ReasonForTravelPage();
        resultPage = new ResultPage();
        durationOfStayPage= new DurationOfStayPage();
        workTypePage= new WorkTypePage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
    }

    @Test(priority = 1, groups = {"smoke","sanity","regression"})
    @Parameters({"country1","reason1","resultMessage1"})
    public void anAustralianComingToUKForTourism(String country1,String reason1, String resultMessage1) {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality(country1);
        selectNationalityPage.clickOnContinue();
        reasonForTravelPage.selectReasonForTravel(reason1);
        reasonForTravelPage.clickOnContinue();
        resultPage.verifyResultMessage(resultMessage1);
    }
    @Test(priority = 2, groups = {"regression"})
    @Parameters({"country2","reason2","intentToStay","planningToWorkFor","resultMessage2"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(String country,String reason, String intent, String planning, String resultMessage){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality(country);
        selectNationalityPage.clickOnContinue();
        reasonForTravelPage.selectReasonForTravel(reason);
        reasonForTravelPage.clickOnContinue();
        durationOfStayPage.selectDurationOfStay(intent);
        durationOfStayPage.clickOnContinue();
        workTypePage.selectPlanningToWorkType(planning);
        workTypePage.clickOnContinue();
        resultPage.verifyResultMessage(resultMessage);
    }
    @Test(priority = 3, groups = {"sanity","regression"})
@Parameters({"country3","reason3","immigrationStatus","resultMessage3"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(String country,String reason, String status,String resultMessage){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality(country);
        selectNationalityPage.clickOnContinue();
        reasonForTravelPage.selectReasonForTravel(reason);
        reasonForTravelPage.clickOnContinue();
        familyImmigrationStatusPage.selectFamilyMembersImmigrationStatus(status);
        familyImmigrationStatusPage.clickOnContinue();
        resultPage.verifyResultMessage(resultMessage);
    }



}

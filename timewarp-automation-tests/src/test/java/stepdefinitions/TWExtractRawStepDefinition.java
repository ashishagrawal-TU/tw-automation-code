package stepdefinitions;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import steps.TWExtractRawSteps;

public class TWExtractRawStepDefinition {

    @Steps
    TWExtractRawSteps twExtractRawSteps;

    // Click on the Extract Log Tab

    @And("TL clicks on Extract Logs Page")
    public void TLClicksOnExtractLogsPage() {
        twExtractRawSteps.clickOnExtractLogsPage();
    }

    // Verify Extract Log Tab

    @And("Verify GUI of Extract Log Page")
    public void verifyGUIOfExtractLogPage() {
        twExtractRawSteps.verifyExtractLogPage();
    }

    // Verify DATE FROM field on Extract Log page

    @And("Verify that a calendar will be displayed when calendar icon is clicked on DATE FROM field")
    public void verifyThatACalendarWillBeDisplayedWhenCalendarIconIsClickedOnDateFROMField() {
        twExtractRawSteps.verifyCalendarIconIsClickedOnDateFROMField();
    }

    @And("verify that the calendar will disappear when Close is clicked on DATE FROM field")
    public void verifyThatTheCalendarWillDisappearWhenCloseIsClickedOnDateFROMField() {
        twExtractRawSteps.verifyCloseButtonIsClickedOnDateFROMField();
    }

    @And("Verify that the data on DATE FROM field will be removed when Clear on calendar display is clicked")
    public void verifyThatTheDataOnDateFROMFieldWillBeRemovedWhenClearOnCalendarDisplayIsClicked() {
        twExtractRawSteps.verifyClearButtonOnCalendarDisplayIsClicked();
    }

    @And("Verify that the date today will be the date on DATE FROM field when Today is clicked")
    public void verifyThatTheDateTodayWillBeTheDateOnDateFROMFieldWhenTodayIsClicked() {
        twExtractRawSteps.verifyTodayDateWhenTodayButtonIsClicked();
    }

    @And("Verify that next month will be displayed when forward Arrow is clicked DATE FROM field")
    public void verifyThatNextMonthWillBeDisplayedWhenForwardArrowIsClickedDateFROMField() {
        twExtractRawSteps.verifyNextMonthDisplayedWhenForwardArrowIsClickedDateFROMField();
    }

    @And("Verify that previous month will be displayed when back Arrow is clicked DATE FROM field")
    public void verifyThatPreviousMonthWillBeDisplayedWhenBackArrowIisClickedDateFROMField() {
        twExtractRawSteps.verifyPreviousMonthDisplayedWhenBackArrowIsClickedDateFROMField();
    }

    @And("Verify that the selected date will be the data on DATE FROM field")
    public void verifyThatTheSelectedDateWillBeTheDataOnDateFROMField() {
        twExtractRawSteps.verifySelectedDateWillBeTheDataOnDateFROMField();
    }

    // Verify DATE TO field on Extract Log page

    @And("Verify that a calendar will be displayed when calendar icon is clicked on DATE TO field")
    public void verifyThatACalendarWillBeDisplayedWhenCalendarIconIsClickedOnDateTOField() {
        twExtractRawSteps.verifyCalendarIconIsClickedOnDateTOField();
    }

    @And("Verify that the calendar will disappear when Close is clicked on DATE TO field")
    public void verifyThatTheCalendarWillDisappearWhenCloseIsClickedOnDateTOMField() {
        twExtractRawSteps.verifyCloseButtonIsClickedOnDateTOField();
    }

    @And("Verify that the data on DATE TO field will be removed when Clear on calendar display is clicked")
    public void verifyThatTheDataOnDateTOFieldWillBeRemovedWhenClearOnCalendarDisplayIsClicked() {
        twExtractRawSteps.verifyClearButtonOnTOCalendarDisplayIsClicked();
    }

    @And("Verify that the date today will be the date on DATE TO field when Today is clicked")
    public void verifyThatTheDateTodayWillBeTheDateOnDateTOFieldWhenTodayIsClicked() {
        twExtractRawSteps.verifyTodayDateWhenTODateTodayButtonIsClicked();
    }

    @And("Verify that next month will be displayed when forward Arrow is clicked DATE TO field")
    public void verifyThatNextMonthWillBeDisplayedWhenForwardArrowIsClickedDateTOField() {
        twExtractRawSteps.verifyNextMonthDisplayedWhenForwardArrowIsClickedDateTOField();
    }

    @And("Verify that previous month will be displayed when back Arrow is clicked DATE TO field")
    public void verifyThatPreviousMonthWillBeDisplayedWhenBackArrowIisClickedDateTOField() {
        twExtractRawSteps.verifyPreviousMonthDisplayedWhenBackArrowIsClickedDateTOField();
    }

    @And("Verify that the selected date will be the data on DATE TO field")
    public void verifyThatTheSelectedDateWillBeTheDataOnDateTOField() {
        twExtractRawSteps.verifySelectedDateWillBeTheDataOnDateTOField();
    }

    // Verify Campaign field using TL access

    @And("Verify Campaign field using TL access")
    public void verifyCampaignFieldUsingTLAccess() {
        twExtractRawSteps.verifyExtractRawCampaignField();
    }

    // Verify Campaign field using OM access

    @And("OM clicks on Extract Logs Page")
    public void OMClicksOnExtractLogsPage() {
        twExtractRawSteps.clickOnExtractLogsPage();
    }

    @And("Verify Campaign field using OM access")
    public void verifyCampaignFieldUsingOMAccess() {
        twExtractRawSteps.verifyExtractRawCampaignField();
    }

    // Verify Campaign field using Admin access

    @And("Admin clicks on Extract Logs Page")
    public void adminClicksOnExtractLogsPage() {
        twExtractRawSteps.clickOnExtractLogsPage();
    }

    @And("Verify Campaign field using Admin access")
    public void verifyCampaignFieldUsingAdminAccess() {
        twExtractRawSteps.verifyExtractRawCampaignField();
    }

    // Verify Team Leader field for the selected campaign

    @And("Verify Team Leader field for the selected campaign")
    public void verifyTLFieldForTheSelectedCampaign() {
        twExtractRawSteps.verifySelectedCampaignForTLField();
    }

    // Verify that when Team Leader = ALL, list of TMs will not be displayed on Teammate field

    @And("Verify that when Team Leader is ALL, list of TMs will not be displayed on Teammate field")
    public void verifyThatWhenTeamLeaderIsALLTMsListWillNotBeDisplayedOnTeammateField() {
        twExtractRawSteps.verifyTMsListWhenTLEqualsAll();
    }

    // Verify the list of TMs on Teammate field for the selected TL

    @And("Verify the list of TMs on Teammate field for the selected TL")
    public void verifyTheListOfTMsOnTeammateFieldForTheSelectedTL() {
        twExtractRawSteps.verifyTheListOfTMsForTheSelectedTL();
    }

    // Verify that when there is no data on Team Leader field an error will be prompted after clicking Generate

    @And("Verify that when there is no data on Team Leader field an error will be prompted after clicking Generate")
    public void verifyThatWhenThereIsNoDataOnTLFieldAnErrorPromptedAfterClickingGenerate() throws InterruptedException {
        twExtractRawSteps.verifyNoDataOnTLFieldPromptErrorWhenClickGenerateButton();
    }

    // Verify that activity logs will be displayed after clicking Generate button

    @And("Verify that activity logs will be displayed after clicking Generate button")
    public void verifyThatActivityLogsWillBeDisplayedAfterClickingGenerateButton() {
        twExtractRawSteps.verifyActivityLogsWhenClickOnGenerateButton();
    }


    //Extract Raw Tab - Displayed Activity Logs scenarios
    //Verify the activity logs for ALL TLs under the selected campaign on the specified date

    @And("Verify the activity logs for ALL TLs under the selected campaign on the specified date")
    public void verifyTheActivityLogsForALLTLsUnderTheSelectedCampaignOnTheSpecifiedDate() {
        twExtractRawSteps.verifyActivityLogsForALLTLsForSpecifiedDate();
    }

    //Verify the activity logs for ALL TMs under the selected TL on the specified date
    @And("Verify the activity logs for ALL TMs under the selected TL on the specified date")
    public void verifyTheActivityLogsForALLTMsUnderSelectedTLOnTheSpecifiedDate() {
        twExtractRawSteps.verifyActivityLogsForALLTMsForSpecifiedDate();
    }

    //Verify the activity logs for the selected TM on the specified date
    @And("Verify the activity logs for the selected TM on the specified date")
    public void verifyTheActivityLogsForSelectedTMForSpecifiedDate() {
        twExtractRawSteps.verifyActivityLogsForSelectedTMsForSpecifiedDate();
    }


}
package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.ExtractRawPage;

public class TWExtractRawSteps {

    ExtractRawPage extractRawPage;

    // Verify the Extract Log page

    @Step("Click on Extract logs page")
    public void clickOnExtractLogsPage() {
        extractRawPage.verifyExtractLogPageHeader();
    }

    @Step("Verify Extract logs page")
    public void verifyExtractLogPage() {
        extractRawPage.verifyExtractLogPageContent();
    }

    // Verify DATE FROM field on Extract Log page

    @Step("Verify Calendar icon is clicked on Date FROM field")
    public void verifyCalendarIconIsClickedOnDateFROMField() {
        extractRawPage.verifyCalendarVisibleWhenDateFROMFieldCalendarIconClicked();
    }

    @Step("Verify Close button is clicked on Date FROM field")
    public void verifyCloseButtonIsClickedOnDateFROMField() {
        extractRawPage.verifyCalenderDisappearWhenDateFROMFieldCloseIconClicked();
    }

    @Step("Verify Clear button on calendar display is clicked")
    public void verifyClearButtonOnCalendarDisplayIsClicked() {
        extractRawPage.verifyDataRemovedWhenClearButtonIsClicked();
    }

    @Step("Verify Today Date when Today button is clicked")
    public void verifyTodayDateWhenTodayButtonIsClicked() {
        extractRawPage.verifyTodayDateOnDateFromFieldWhenTodayButtonIsClicked();
    }

    @Step("Verify next month displayed when Forward Arrow is clicked Date FROM field")
    public void verifyNextMonthDisplayedWhenForwardArrowIsClickedDateFROMField() {
        extractRawPage.verifyNextMonthShowsWhenForwardArrowIsClickedDateFROMField();
    }

    @Step("verify previous month displayed when Back Arrow is Clicked Date FROMField")
    public void verifyPreviousMonthDisplayedWhenBackArrowIsClickedDateFROMField() {
        extractRawPage.verifyPreviousMonthShowsWhenBackArrowIsClickedDateFROMField();
    }

    @Step("Verify Selected Date will be the Data on Date FROM Field")
    public void verifySelectedDateWillBeTheDataOnDateFROMField() {
        extractRawPage.verifySelectedDateWillBeOnDateFROMField();
    }

    // Verify DATE TO field on Extract Log page

    @Step("Verify Calendar icon is clicked on Date TO field")
    public void verifyCalendarIconIsClickedOnDateTOField() {
        extractRawPage.verifyCalendarVisibleWhenDateTOFieldCalendarIconClicked();
    }

    @Step("Verify Close button is clicked on Date TO field")
    public void verifyCloseButtonIsClickedOnDateTOField() {
        extractRawPage.verifyCalenderDisappearWhenDateTOFieldCloseIconClicked();
    }

    @Step("Verify Clear button on TO calendar display is clicked")
    public void verifyClearButtonOnTOCalendarDisplayIsClicked() {
        extractRawPage.verifyDataRemovedWhenClearButtonIsClickedTODate();
    }

    @Step("Verify Today Date when TO Date Today button is clicked")
    public void verifyTodayDateWhenTODateTodayButtonIsClicked() {
        extractRawPage.verifyTodayDateOnDateTOFieldWhenTodayButtonIsClicked();
    }

    @Step("Verify next month displayed when Forward Arrow is clicked Date TO field")
    public void verifyNextMonthDisplayedWhenForwardArrowIsClickedDateTOField() {
        extractRawPage.verifyNextMonthShowsWhenForwardArrowIsClickedDateTOField();
    }

    @Step("verify previous month displayed when Back Arrow is Clicked Date TO Field")
    public void verifyPreviousMonthDisplayedWhenBackArrowIsClickedDateTOField() {
        extractRawPage.verifyPreviousMonthShowsWhenBackArrowIsClickedDateTOField();
    }

    @Step("Verify Selected Date will be the Data on Date TO Field")
    public void verifySelectedDateWillBeTheDataOnDateTOField() {
        extractRawPage.verifySelectedDateWillBeOnDateTOField();
    }

    // Verify Campaign field using TL/OM/Admin access
    @Step("Verify Extract Raw Campaign field using TL access")
    public void verifyExtractRawCampaignField() {
        extractRawPage.verifyCampaignBySelectingDate();
    }

    // Verify Team Leader field for the selected campaign
    @Step("Verify Selected Campaign for TL field")
    public void verifySelectedCampaignForTLField() {
        extractRawPage.verifyTLFieldForCampaign();
    }

    // Verify that when Team Leader = ALL, list of TMs will not be displayed on Teammate field
    @Step("Verify Selected Campaign for TL field")
    public void verifyTMsListWhenTLEqualsAll() {
        extractRawPage.verifyTMsList();
    }

    // Verify the list of TMs on Teammate field for the selected TL
    @Step("Verify the list of TMs for the selected TL")
    public void verifyTheListOfTMsForTheSelectedTL() {
        extractRawPage.verifyTMsListForSpecificTL();
    }


    // Verify that when there is no data on Team Leader field an error will be prompted after clicking Generate
    @Step("Verify no data on TL field prompt error when click Generate button")
    public void verifyNoDataOnTLFieldPromptErrorWhenClickGenerateButton() throws InterruptedException {
        extractRawPage.verifyErrorMessageWhenClickGenerateButtonWithNoDataOnTLField();
    }

    // Verify that activity logs will be displayed after clicking Generate button
    @Step("Verify Activity Logs when click on Generate button")
    public void verifyActivityLogsWhenClickOnGenerateButton() {
        extractRawPage.verifyActivityLogsWithAllValueSelectedAndClickOnGenerateButton();
    }


    //Extract Raw Tab - Displayed Activity Logs scenarios
    //Verify the activity logs for ALL TLs under the selected campaign on the specified date

    @Step("Verify Activity logs for ALL TLs for specified date")
    public void verifyActivityLogsForALLTLsForSpecifiedDate() {
        extractRawPage.verifyActivityLogsForSpecificDateForALLTLs();
    }

    //Verify the activity logs for ALL TMs under the selected TL on the specified date
    @Step("Verify Activity logs for ALL TMs for specified date")
    public void verifyActivityLogsForALLTMsForSpecifiedDate() {
        extractRawPage.verifyActivityLogsForSpecificDateForALLTMs();
    }

    //Verify the activity logs for the selected TM on the specified date
    @Step("Verify Activity logs for Selected TM for specified date")
    public void verifyActivityLogsForSelectedTMsForSpecifiedDate() {
        extractRawPage.verifyActivityLogsForSpecificDateForSelectedTM();
    }


}

package stepdefinitions;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import steps.TWDashboardSteps;

public class TWDashboardStepDefinition {

    @Steps
    TWDashboardSteps tw_DashboardSteps;

    // Verify the TL, OM and Admin login for TimeWarp

    @And("TL clicks on Dashboard Page and verify contents on Dashboard page")
    public void TLClicksOnDashboardPageAndVerifyContentsOnDashboardPage() {
        tw_DashboardSteps.verifyNavigationOnDashboardPage();
    }

    @And("Verify OM is on activity page by clicking on TimeWarp Tab")
    public void verifyOMIsOnActivityPage() throws InterruptedException {
        tw_DashboardSteps.verifyOMsNavigationOnTimeWarpTab();
    }

    @And("Verify OM's Dashboard will have the list of current or most recent activities")
    public void verifyOMsDashboardHaveListOfCurrentOrMostRecentActivities() {
        tw_DashboardSteps.verifyOMsNavigationOnDashboardPage();
    }

    @And("Verify Admin Dashboard will have the list of current or most recent activities")
    public void verifyAdminDashboardHaveListOfCurrentOrMostRecentActivities() {
        tw_DashboardSteps.verifyAdminNavigationOnDashboardPage();
    }

    // Verify the Dashboard for Active users

    @And("TL clicks on Dashboard Page")
    public void TLClicksOnDashboardPage() {
        tw_DashboardSteps.clickOnDashboardPage();
    }

    @And("Verify list of active users for All TLs under the selected campaign")
    public void verifyListOfActiveUsersForAllTLsUnderSelectedCampaign() {
        tw_DashboardSteps.verifyAllIsSelectedInTLsDropdown();
    }

    @And("Verify list of active users under the Selected TL")
    public void verifyListOfActiveUsersForSelectedTL() {
        tw_DashboardSteps.verifyAllTMsAreSelectedForSpecificTL();
    }

    @And("Verify Specific Teammate shows in Teammate dropdown for the Selected TL")
    public void verifySpecificTMForSpecificTL() {
        tw_DashboardSteps.verifyTMIsSelectedForSpecificTL();
    }

    // Verify the Dashboard for Activity Logs

    @And("Verify Activity logs for list of active users for All TLs under the selected campaign")
    public void verifyActivityLogsForListOfActiveUsersForAllTLsUnderSelectedCampaign() {
        tw_DashboardSteps.verifyActivityLogsForAllIsSelectedInTLsDropdown();
    }

    @And("Verify Activity logs for list of active users under the Selected TL")
    public void verifyActivityLogsForListOfActiveUsersForSelectedTL() {
        tw_DashboardSteps.verifyActivityLogsForAllTMsAreSelectedForSpecificTL();
    }

    @And("Verify Activity logs for Specific Teammate shows in Teammate dropdown for the Selected TL")
    public void verifyActivityLogsForSpecificTMForSpecificTL() {
        tw_DashboardSteps.verifyActivityLogsForTMIsSelectedForSpecificTL();
    }

    // Verify the Dashboard for Search Function

    @And("Verify Active User are showing based on Employee ID search")
    public void verifyActiveUserAreShowingBasedOnEmployeeIDSearch() {
        tw_DashboardSteps.verifyActiveUserListBasedOnEmployeeIDSearch();
    }

    @And("Verify Active User are showing based on Employee Name search")
    public void verifyActiveUserAreShowingBasedOnEmployeeNameSearch() {
        tw_DashboardSteps.verifyActiveUserListBasedOnEmployeeNameSearch();
    }

    @And("Verify Active User are showing based on Current Activity Name search")
    public void verifyActiveUserAreShowingBasedOnActivityNameSearch() {
        tw_DashboardSteps.verifyActiveUserListBasedOnActivityNameSearch();
    }

    @And("Verify Active User are showing based on Timezone search")
    public void verifyActiveUserAreShowingBasedOnTimezoneSearch() {
        tw_DashboardSteps.verifyActiveUserListBasedOnTimezoneSearch();
    }

    // Verify the Dashboard for Color Code

    @And("Verify the color of Start Shift of the TM")
    public void verifyTheColorOfStartShiftOfTheTM() throws InterruptedException {
        tw_DashboardSteps.verifyTMStartShiftColorIsGreen();
    }

    @And("Verify the color of Productive Time of the TM")
    public void verifyTheColorOfProductiveTimeOfTheTM() throws InterruptedException {
        tw_DashboardSteps.verifyTMProductiveTimeColorIsYellow();
    }

//    @And("Verify the color of Productive Time of the TM for more than 4 hours")
//    public void verifyTheColorOfProductiveTimeMoreThan4HoursOfTheTM() {
//        tw_DashboardSteps.verifyTMProductiveTimeMoreThan4HoursColorIsRed();
//    }

    @And("Verify the color of Breakfast for 15 minutes")
    public void verifyTheColorOfBreakfastTimeMoreThan15MinutesOfTheTM() throws InterruptedException {
        tw_DashboardSteps.verifyTMBreakfastMoreThan15MinutesColorIsRed();
    }

    // Verify the Dashboard for Terminate Activity

    @And("Verify that an employee's activity will be terminated when Terminate button is clicked")
    public void verifyThatAnEmployeeActivityWillBeTerminatedWhenTerminateButtonIsClicked() throws InterruptedException {
        tw_DashboardSteps.verifyThatTLCanTerminateEmployeeActivity();
    }

    @And("Verify end time of the terminated activity and start time of Idle Time")
    public void verifyEndTimeOfTheTerminatedActivityAndStartTimeOfIdleTime() throws InterruptedException {
        tw_DashboardSteps.verifyTerminateActivityEndTimeAndStartTimeIdleTime();
    }

    // Verify the Dashboard for Force End Shift

    @And("Verify Force End shift will eliminate Activity log from Active User tab")
    public void verifyForceEndShiftWillEliminateActivityLogFromActiveUserTab() throws InterruptedException {
        tw_DashboardSteps.verifyForceEndShiftEliminateLogFromActiveUserTab();
    }

    @And("Verify Activity log End time timestamp is same when End shift button clicked")
    public void verifyActivityLogEndTimeTimestampIsSameWhenEndShiftButtonClicked() throws InterruptedException {
        tw_DashboardSteps.verifyActivityLogEndTimeTimestamp();
    }

    @And("Verify End Shift activity will be created on the Activity Log table after a force End Shift")
    public void verifyEndShiftActivityWillBeCreatedOnTheActivityLogTableAfterAForceEndShift() throws InterruptedException {
        tw_DashboardSteps.verifyActivityLogAfterForceEndShift();
    }

    @And("Verify Start an End time for End Shift is same when End shift button clicked")
    public void verifyStartAnEndTimeForEndShiftIsSameWhenEndShiftButtonClicked() throws InterruptedException {
        tw_DashboardSteps.verifyStartAndEndTimeForEndShift();
    }

}
package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.DashboardPage;
import pageobjects.TimewarpPage;

public class TWDashboardSteps {

    DashboardPage dashboardPage;
    TimewarpPage timewarpPage;

    // Verify the TL, OM and Admin login for TimeWarp

    @Step("Verify Navigation on Dashboard page and its contents")
    public void verifyNavigationOnDashboardPage() {
        dashboardPage.verifyDashboardPageContent();
    }

    @Step("Verify OM is on activity page by clicking on Timewarp Tab")
    public void verifyOMsNavigationOnTimeWarpTab() throws InterruptedException {
        timewarpPage.verifyOMTimeWarpPage();
    }

    @Step("Verify OM Navigation on Dashboard page and its contents")
    public void verifyOMsNavigationOnDashboardPage() {
        dashboardPage.verifyOMDashboardPageContent();
    }

    @Step("Verify Admin Navigation on Dashboard page and its contents")
    public void verifyAdminNavigationOnDashboardPage() {
        dashboardPage.verifyAdminDashboardPageContent();
    }

    // Verify the Dashboard for Active users

    @Step("Click on Dashboard page")
    public void clickOnDashboardPage() {
        dashboardPage.verifyDashboardPageHeader();
    }

    @Step("Verify All is Selected in TLs dropdown")
    public void verifyAllIsSelectedInTLsDropdown() {
        dashboardPage.verifyAllActiveUsersAreShowingForAllTLs();
    }

    @Step("Verify TMs are selected for specific TL")
    public void verifyAllTMsAreSelectedForSpecificTL() {
        dashboardPage.verifyAllActiveUsersAreShowingForSpecificTL();
    }

    @Step("Verify TM is selected for specific TL")
    public void verifyTMIsSelectedForSpecificTL() {
        dashboardPage.verifySpecificTMIsShowingForSpecificTL();
    }

    // Verify the Dashboard for Activity Logs

    @Step("Verify Activity logs for All is Selected in TLs dropdown")
    public void verifyActivityLogsForAllIsSelectedInTLsDropdown() {
        dashboardPage.verifyActivityLogsForAllActiveUsersAreShowingForAllTLs();
    }

    @Step("Verify Activity logs for TMs are selected for specific TL")
    public void verifyActivityLogsForAllTMsAreSelectedForSpecificTL() {
        dashboardPage.verifyActivityLogsForAllActiveUsersAreShowingForSpecificTL();
    }

    @Step("Verify Activity logs for TM is selected for specific TL")
    public void verifyActivityLogsForTMIsSelectedForSpecificTL() {
        dashboardPage.verifyActivityLogsForSpecificTMIsShowingForSpecificTL();
    }

    // Verify the Dashboard for Search Function

    @Step("Verify Active User Tab based on Employee ID Search")
    public void verifyActiveUserListBasedOnEmployeeIDSearch() {
        dashboardPage.verifyActiveUsersSearchBasedOnEmployeeID();
    }

    @Step("Verify Active User Tab based on Employee Name Search")
    public void verifyActiveUserListBasedOnEmployeeNameSearch() {
        dashboardPage.verifyActiveUsersSearchBasedOnEmployeeName();
    }

    @Step("Verify Active User Tab based on Activity Name Search")
    public void verifyActiveUserListBasedOnActivityNameSearch() {
        dashboardPage.verifyActiveUsersSearchBasedOnActivityName();
    }

    @Step("Verify Active User Tab based on Timezone Search")
    public void verifyActiveUserListBasedOnTimezoneSearch() {
        dashboardPage.verifyActiveUsersSearchBasedOnTimezone();
    }

    // Verify the Dashboard for Color Code

    @Step("Verify TM Start Shift color is Green")
    public void verifyTMStartShiftColorIsGreen() throws InterruptedException {
        dashboardPage.verifyTMStartActivityColorIsGreen();
    }

    @Step("Verify TM Productive Time color is Yellow")
    public void verifyTMProductiveTimeColorIsYellow() throws InterruptedException {
        dashboardPage.verifyTMProductiveActivityColorIsYellow();
    }

//    @Step("Verify Active User Tab based on Activity Name Search")
//    public void verifyTMProductiveTimeMoreThan4HoursColorIsRed() {
//        dashboardPage.verifyActiveUsersSearchBasedOnActivityName();
//    }

    @Step("Verify TM Breakfast more than 15 minutes color is Red")
    public void verifyTMBreakfastMoreThan15MinutesColorIsRed() throws InterruptedException {
        dashboardPage.verifyTMBreakfastMoreThan15MinutesActivityColorIsRed();
    }

    // Verify the Dashboard for Terminate Activity

    @Step("Verify that TL can Terminate Employee's Activity")
    public void verifyThatTLCanTerminateEmployeeActivity() throws InterruptedException {
        dashboardPage.clickOnEmployeeActivityTerminateButton();
    }

    @Step("Verify Terminate Activity End Time and start time Idle time")
    public void verifyTerminateActivityEndTimeAndStartTimeIdleTime() throws InterruptedException {
        dashboardPage.compareTerminateActivityEndTimeAndIdleTimeStartTime();
    }

    // Verify the Dashboard for Force End Shift

    @Step("Verify force End Shift eliminate log from Active User tab")
    public void verifyForceEndShiftEliminateLogFromActiveUserTab() throws InterruptedException {
        dashboardPage.verifyForceEndShiftRemoveLogFromActiveUserTab();
    }

    @Step("Verify Activity Log End Time Timestamp")
    public void verifyActivityLogEndTimeTimestamp() throws InterruptedException {
        dashboardPage.verifyActivityLogEndTimeTimestampToBeSame();
    }

    @Step("Verify Activity Log after force End Shift")
    public void verifyActivityLogAfterForceEndShift() throws InterruptedException {
        dashboardPage.verifyActivityLogVisibleAfterForceEndShift();
    }

    @Step("Verify Start and End Time for End Shift")
    public void verifyStartAndEndTimeForEndShift() throws InterruptedException {
        dashboardPage.verifyStartAndEndTimeSameForEndShift();
    }



}

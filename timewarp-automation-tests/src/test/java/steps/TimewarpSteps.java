package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.TimewarpPage;

public class TimewarpSteps {

    TimewarpPage timewarpPage;
    String PopupMessageText = "All activities are being monitored and are being logged. Any suspicious or malicious activity is subject to disciplinary action.";

    @Step("Timewarp Home Page")
    public void TimewarpHomePage(){
        assert timewarpPage.verifyTimewarpPopupMessageButton().equalsIgnoreCase(PopupMessageText);
    }

    @Step("Verify Activity Page")
    public void verifyActivityPage(){
        timewarpPage.verifyActivityPageHeader();
    }

    @Step("Verify Activity Page")
    public void verifyStartShiftHasBeenRecorded(){
        timewarpPage.verifyCurrentActivityTable();
    }

    @Step("Verify Start Shift is recorded and show")
    public void verifyStartShiftIsRecordedAndShow(){
        timewarpPage.verifyStartShiftAndCurrentActivityTable();
    }

    @Step("Verify Yes button is clicked")
    public void verifyYesButtonIsClicked() {
        timewarpPage.verifyActivityPageHeader();
    }

    @Step("Verify Timer Stopped and Start activity button is Disabled")
    public void verifyActivityTimerStoppedStartActivityButtonDisabled() {
        timewarpPage.verifyTimerStoppedAndStartButtonDisabled();
    }

    @Step("Verify Timer Stopped and Start activity button is Disabled")
    public void verifyThatEndTimeShouldBeRecordedAndActivityTimerStarts() {
        timewarpPage.verifyTimerStoppedAndStartButtonDisabled();
    }

    @Step("Verify Start shift ends and Productive activity started")
    public void verifyStartShiftEndsAndProductiveActivityStarted() {
        timewarpPage.verifyShiftEndAndNewShiftStartInActivityTable();
    }

    // 17Jul'2020 Activity Page Logs Color

    @Step("Verify New Activity Started And Closed Activity Color Green")
    public void verifyNewActivityStartedAndClosedActivityColorGreen() {
        timewarpPage.verifyPreviousActivityColorGreen();
    }

    @Step("Verify Ongoing Activity Color Is Yellow")
    public void verifyOngoingActivityColorIsYellow() {
        timewarpPage.verifyCurrentActivityColorYellow();
    }

    @Step("Wait for 15 Minutes for Break Activity")
    public void waitFor15MinutesForBreakActivity() throws InterruptedException {
        timewarpPage.startAndWaitFor15MinutesForBreakActivity();
    }

    @Step("Verify finished Activity is color Red")
    public void verifyFinishedActivityIsColorRed() {
        timewarpPage.verifyBreakTimeActivityIsColorRed();
    }

    // Verify End Shift 05_activity_page_end_shift.feature - 20th Jul'2020

    @Step("End Shift and Select No on Confirmation Box")
    public void endShiftAndSelectNoOnConfirmationBox() throws InterruptedException {
        timewarpPage.verifyEndTimeEndsAndConfirmationBoxCloses();
    }

    @Step("Verify End Shift Starts and End Time are same")
    public void verifyEndShiftStartsAndEndTimeAreSame() {
        timewarpPage.verifyEndShiftTimesAreSame();
    }



}

package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.TimewarpSteps;

public class TimewarpStepDefinition {

    @Steps
    TimewarpSteps timewarpSteps;

    @Then("User lands on the Home page")
    public void userLandsOnTheHomePage() {
        timewarpSteps.TimewarpHomePage();
    }

    @And("Verify User is on activity page")
    public void verifyUserIsOnActivityPage() {
        timewarpSteps.verifyActivityPage();
    }

    @And("Verify that Start Shift has been recorded at the Current Activity table")
    public void verifyThatStartShiftHasBeenRecordedAtTheCurrentActivityTable() {
        timewarpSteps.verifyStartShiftHasBeenRecorded();
    }

    @Given("Verify User click the Yes button")
    public void verifyUserClickTheYesButton() {
        timewarpSteps.verifyYesButtonIsClicked();
    }

    @And("Verify that Start Shift should be started and be recorded at the Current Activity table")
    public void verifyThatStartShiftShouldBeStartedAndBeRecordedAtCurrentActivityTable() {
        timewarpSteps.verifyStartShiftIsRecordedAndShow();
    }

    @And("Verify that Activity Timer should stop and Start Activity button should be disabled")
    public void verifyThatActivityTimerShouldStopAndStartActivityButtonShouldBeDisabled() {
        timewarpSteps.verifyActivityTimerStoppedStartActivityButtonDisabled();
    }

    @And("Verify that End Time should be recorded and Activity Timer starts for the selected activity")
    public void verifyThatEndTimeShouldBeRecordedAndActivityTimerStartsForSelectedActivity() {
        timewarpSteps.verifyThatEndTimeShouldBeRecordedAndActivityTimerStarts();
    }

    @And("Verify Start shift ending and new activity started")
    public void verifyStartShiftEndingAndNewActivityStarted() {
        timewarpSteps.verifyStartShiftEndsAndProductiveActivityStarted();
    }

    // Activity Page Logs Color - 17Jul'2020

    @And("^Verify the new activity is started and previous activity changed to Green color$")
    public void verifyTheNewActivityIsStartedAndPreviousActivityChangedToGreenColor() {
        timewarpSteps.verifyNewActivityStartedAndClosedActivityColorGreen();
    }

    @And("^Click on new Activity and Verify the On-going activity color is Yellow$")
    public void clickOnNewActivityAndVerifyTheOngoingActivityColorIsYellow() {
        timewarpSteps.verifyOngoingActivityColorIsYellow();
    }

    @And("^Wait for 15 minutes for Break activity to be finished$")
    public void waitFor15MinutesForBreakActivityToBeFinished() throws InterruptedException {
        timewarpSteps.waitFor15MinutesForBreakActivity();
    }

    @And("^Verify finished activity in more time has color Red$")
    public void verifyFinishedActivityInMoreTimeHasColorRed() {
        timewarpSteps.verifyFinishedActivityIsColorRed();
    }

    // Verify End Shift 05_activity_page_end_shift.feature - 20th Jul'2020

    @And("^Select the End Shift and click No on Confirmation dialog box$")
    public void selectTheEndShiftAndClickNoOnConfirmationDialogBox() throws InterruptedException {
        timewarpSteps.endShiftAndSelectNoOnConfirmationBox();
    }

    @And("^Verify that End Shift Activity start and end time are same$")
    public void verifyThatEndShiftActivityStartAndEndTimeAreSame() {
        timewarpSteps.verifyEndShiftStartsAndEndTimeAreSame();
    }



}


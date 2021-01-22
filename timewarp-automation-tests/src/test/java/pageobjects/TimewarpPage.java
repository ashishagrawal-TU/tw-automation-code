package pageobjects;

import com.paulhammant.ngwebdriver.ByAngular;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import steps.StepsLogin;
import testdataobjects.EmployeeProfile;

import java.util.HashMap;

public class TimewarpPage extends PageObject {

    @FindBy(className = "btn btn-default")
    public WebElementFacade timewarpPopupMessageCloseButton;

    @FindBy(xpath = "//div[contains(text(),'All activities are being monitored and are being l')]")
    private WebElementFacade timewarpPopupMessageText;

    @FindBy(className = "bootstrap-dialog-header")
    private WebElementFacade timewarpRecentEndShiftDialogBox;

    @FindBy(xpath = "//button[@title='Yes']")
    private WebElementFacade timewarpRecentEndShiftDialogYesButton;

    @FindBy(xpath = "//button[@title='No']")
    private WebElementFacade timewarpRecentEndShiftDialogNoButton;

    @FindBy(xpath = "//b[contains(text(),'Time Warp')]")
    private WebElementFacade timewarpPageHeader;

    @FindBy(xpath = "//h1[@class='page-header ng-scope']")
    private WebElementFacade pageHeader;

    @FindBy(css = "b.ng-binding")
    private WebElementFacade userNameHeader;

    @FindBy(css = "h2.panel-title")
    private WebElementFacade timePanelHeader;

    @FindBy(css = "timer.ng-binding.ng-isolate-scope")
    private WebElementFacade timerClock;

    @FindBy(xpath = "//*[@id=\"activityTypeBox\"]/tbody/tr[1]/td/span")
    private WebElementFacade activityTypeProductivity;

    @FindBy(xpath = "//*[@id=\"activityTypeBox\"]/tbody/tr[7]/td")
    private WebElementFacade activityTypeTeamMeeting;

    @FindBy(xpath = "//*[@id=\"activityTypeBox\"]/tbody/tr[17]/td")
    private WebElementFacade activityTypeEndShift;


    @FindBy(xpath = "//*[@id=\"submitActivity\"]")
    private WebElementFacade startActivityButton;

    @FindBy(xpath = "//a[@class='ng-binding']")
    private WebElementFacade activityPageTableHeader;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[1]")   //td[@class='warning'][contains(text(),'Start Shift')]
    private WebElementFacade activityPageStartShift;
    //*[@id="submitActivity"]

    @FindBy(xpath = "//td[@class='warning'][contains(text(),'Productive Time')]")
    private WebElementFacade activityTableProductiveShift;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[1]")
    private WebElementFacade activityTableTeamMeetingsShift;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[2]")
    private WebElementFacade activityTableStartShiftEndTime;

    @FindBy(xpath = "//body//div[@id='AuxTool']//div//div//div//div//div//tr[2]//td[1]")
    private WebElementFacade lastActivityEndShift;

    @FindBy(xpath = "//*[@id=\"activityTypeBox\"]/tbody/tr[17]/td")
    private WebElementFacade selectTheEndShiftActivity;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[1]")
    private WebElementFacade activityPageOMStartShift;

    @FindBy(xpath = "//*[@id=\"AuxTool\"]/div[2]/div/div[1]")
    private WebElementFacade resultTable;

    @FindBy(xpath = "//*[@id=\"activityTypeBox\"]/tbody/tr[17]/td")
    private WebElementFacade selectTheEndShiftActivityTL;

    @FindBy(xpath = "//*[@id=\"submitActivity\"]")
    private WebElementFacade startActivityButtonTL;

    @FindBy(xpath = "//td[@class='warning'][contains(text(),'Start Shift')]")
    private WebElementFacade activityPageStartShiftTL;

    @FindBy(xpath = "//td[contains(text(),'End Shift')]")
    private WebElementFacade lastActivityEndShiftTL;

    @FindBy(xpath = "//div[@class='panel panel-primary']//timer[@class='ng-binding ng-isolate-scope'][contains(text(),'00:00:00')]")
    private WebElementFacade verifyTimerStopped;

    // 17Jul'2020 Activity Page Logs Color
    @FindBy(xpath = "//*[@id=\"DataTables_Table_1\"]/tbody/tr[2]/td[1]")
    private WebElementFacade activityTableColorGreen;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[1]")
    private WebElementFacade activityTableColorYellow;

    @FindBy(xpath = "//table[@id='activityTypeBox']//tr[3]//td[1]")
    private WebElementFacade activityTypeBreakTime;

    // Activity Page End Shift Time compare 20th Jul'2020
    @FindBy(xpath = "//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[2]")
    private WebElementFacade activityTableStartTime;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_1\"]/tbody/tr[1]/td[3]")
    private WebElementFacade activityTableEndTime;


    TWLoginPage twLoginPage;
    HashMap<String, EmployeeProfile> employeeList;
    StepsLogin loginSteps;
    EmployeeProfile omuser;

    public String verifyTimewarpPopupMessageButton() {
        String actualTextCompare = timewarpPopupMessageText.getText();
        return actualTextCompare;
    }

    public void verifyActivityPageHeader() {
        if (find(ByAngular.buttonText("YES")).isVisible()){
            find(ByAngular.buttonText("YES")).click();
        }
        if (find(ByAngular.buttonText("Close")).isVisible()){
            find(ByAngular.buttonText("Close")).click();
        }
        Assert.assertEquals("Verify Timewarp Activity Page", "Time Warp", timewarpPageHeader.getText());
        Assert.assertEquals("Verify Timewarp Activity Page", "Time Warp", pageHeader.getText());
    }

    public void verifyCurrentActivityTable() {
        Assert.assertEquals("Verify first activity is Start Shift ", "Start Shift", activityPageStartShift.getText());
        Assert.assertEquals("Verify Last Activity was End Shift ", "End Shift", lastActivityEndShift.getText());
        selectTheEndShiftActivity.click();
        startActivityButton.click();
        if (find(ByAngular.buttonText("NO")).isVisible()) {
            find(ByAngular.buttonText("NO")).click();
        }
    }

    public void verifyOMTimeWarpPage() throws InterruptedException {
        timewarpPageHeader.click();
        Thread.sleep(2000);
        if (find(ByAngular.buttonText("YES")).isVisible()){
            find(ByAngular.buttonText("YES")).click();
        }
        if (find(ByAngular.buttonText("Close")).isVisible()) {
            find(ByAngular.buttonText("Close")).click();
        }
        Assert.assertTrue(startActivityButtonTL.isDisplayed());
        //Assert.assertEquals("Verify Last Activity was End Shift ", "End Shift", lastActivityEndShift.getText());
        selectTheEndShiftActivityTL.click();
        startActivityButtonTL.click();

    }

    public void verifyStartShiftAndCurrentActivityTable() {
        Assert.assertTrue(startActivityButtonTL.isDisplayed());
        //Assert.assertEquals("Verify first activity is Start Shift ", "Start Shift", activityPageStartShift.getText());
        //Assert.assertEquals("Verify Last Activity was End Shift ", "End Shift", lastActivityEndShift.getText());
        selectTheEndShiftActivityTL.click();
        startActivityButtonTL.click();
    }


    public void verifyTimerStoppedAndStartButtonDisabled() {
        if (find(ByAngular.buttonText("Close")).isVisible()) {
            find(ByAngular.buttonText("Close")).click();
        }
        if (find(ByAngular.buttonText("NO")).isVisible()){
            find(ByAngular.buttonText("NO")).click();
            Assert.assertEquals("Verify Timer is Stopped", "00:00:00", verifyTimerStopped.getText());
        }
        else {
            selectTheEndShiftActivity.click();
            startActivityButton.click();
            //find(ByAngular.buttonText("NO")).click();
        }
        Assert.assertTrue(startActivityButton.isDisabled());
    }

    public void verifyShiftEndAndNewShiftStartInActivityTable() {
        activityTypeTeamMeeting.click();
        startActivityButton.click();
        waitForAngularRequestsToFinish();
        Assert.assertEquals("Verify New Activity is started ", "Team Meetings", activityTableTeamMeetingsShift.getText());
        Assert.assertTrue(activityTableStartShiftEndTime.isPresent());
    }

    // 17Jul'2020 Activity Page Logs Color

    public void verifyPreviousActivityColorGreen() {
        if (find(ByAngular.buttonText("YES")).isVisible()){
            find(ByAngular.buttonText("YES")).click();
        }
        if (find(ByAngular.buttonText("Close")).isVisible()){
            find(ByAngular.buttonText("Close")).click();
        }
        activityTypeBreakTime.click();
        startActivityButton.click();
        activityTypeTeamMeeting.click();
        startActivityButton.click();
        Assert.assertEquals("Verify Previous Activity Color is Green ", "rgba(223, 240, 216, 1)", activityTableColorGreen.getCssValue("background-color"));
    }

    // Verify Yellow Color
    public void verifyCurrentActivityColorYellow() {
        if (find(ByAngular.buttonText("YES")).isVisible()){
            find(ByAngular.buttonText("YES")).click();
        }
        if (find(ByAngular.buttonText("Close")).isVisible()){
            find(ByAngular.buttonText("Close")).click();
        }
        Assert.assertEquals("Verify Current Activity Color is Yellow", "rgba(252, 248, 227, 1)", activityTableColorYellow.getCssValue("background-color"));
    }

    // Wait for 15min
    public void startAndWaitFor15MinutesForBreakActivity() throws InterruptedException {
        if (find(ByAngular.buttonText("YES")).isVisible()){
            find(ByAngular.buttonText("YES")).click();
        }
        if (find(ByAngular.buttonText("Close")).isVisible()){
            find(ByAngular.buttonText("Close")).click();
        }
        activityTypeBreakTime.click();
        startActivityButton.click();
        Thread.sleep(901000);
        activityTypeTeamMeeting.click();
        startActivityButton.click();
        Assert.assertEquals("Verify Break Time activity Started", "Break (15 minutes)", activityTableColorYellow.getText());
    }

    // Verify Red Color
    public void verifyBreakTimeActivityIsColorRed() {
        if (find(ByAngular.buttonText("YES")).isVisible()){
            find(ByAngular.buttonText("YES")).click();
        }
        if (find(ByAngular.buttonText("Close")).isVisible()){
            find(ByAngular.buttonText("Close")).click();
        }
        activityTypeTeamMeeting.click();
        startActivityButton.click();
        Assert.assertEquals("Verify Break Time activity color is Red", "rgba(252, 248, 227, 1)", activityTableColorYellow.getCssValue("background-color"));
    }

    // Verify End Shift 05_activity_page_end_shift.feature - 20th Jul'2020

    public void verifyEndTimeEndsAndConfirmationBoxCloses() throws InterruptedException {
        if (find(ByAngular.buttonText("YES")).isVisible()){
            find(ByAngular.buttonText("YES")).click();
        }
        find(ByAngular.buttonText("Close")).click();
        activityTypeEndShift.click();
        startActivityButton.click();
        Thread.sleep(2000);
    }

    public void verifyEndShiftTimesAreSame() {

        Assert.assertEquals("Verify End Shift Times are same", activityTableStartTime.getText(), activityTableEndTime.getText());
    }



}
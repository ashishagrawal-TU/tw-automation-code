package pageobjects;

import com.paulhammant.ngwebdriver.ByAngular;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static net.thucydides.core.pages.components.HtmlTable.rowsFrom;

public class DashboardPage extends PageObject {

    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    public WebElementFacade dashboardTabHeader;

    @FindBy(xpath = "//h1[@class='page-header ng-scope']")
    public WebElementFacade dashboardPageHeader;

    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    public WebElementFacade dashboardUserNameHeader;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/div/div[1]/div[1]/div[2]/div[1]/div/div[1]/span/span[2]")
    public WebElementFacade campaignDropDown;

    @FindBy(xpath = "/html/body/ui-view/div[1]/div/div/ui-view/div/div[1]/div[1]/div[2]/div[2]/div/input[1]")
    public WebElementFacade teamLeaderDropDown;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/div/div[1]/div[1]/div[2]/div[3]/div/div[1]/span/span[2]")
    public WebElementFacade teamMateDropDown;

    @FindBy(xpath="//*[@id=\"pads\"]/div/ui-view/div/div[1]/div[2]/div/div/input")
    public WebElementFacade refreshButton;

    @FindBy(xpath="//*[@id=\"pads\"]/div/ui-view/div/div[2]/ul/li[1]/a")
    public WebElementFacade activeUsersTab;

    @FindBy(xpath="//*[@id=\"DataTables_Table_8_wrapper\"]/div[2]/div[1]/div/table/thead/tr/th[1]")
    public WebElementFacade activeUserResultTable;

    @FindBy(xpath="//*[@id=\"pads\"]/div/ui-view/div/div[2]/ul/li[2]/a")
    public WebElementFacade activityLogsTab;

    @FindBy(xpath="//*[@id=\"DataTables_Table_11_wrapper\"]/div[2]/div[1]/div/table")
    public WebElementFacade activityLogsResultTable;

    @FindBy(xpath="/html/body/ui-view/div[1]/div/div/ui-view/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[4]")
    public WebElementFacade activityLogsStartTimeColFirstRow;

    @FindBy(xpath="/html/body/ui-view/div[1]/div/div/ui-view/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[5]")
    public WebElementFacade activityLogsEndTimeColSecondRow;

    @FindBy(css = "input.form-control.input-sm")
    public WebElementFacade activeUserSearchBox;

    @FindBy(xpath = "/html/body/ui-view/div[1]/div/div/ui-view/div/div[2]/div/div[1]/div/div/div/div[2]/div[2]/table/tbody/tr/td[2]")
    public WebElementFacade activeUserEmployeeIDColumn;

    @FindBy(xpath="/html/body/ui-view/div[1]/div/div/ui-view/div/div[2]/div/div[1]/div/div/div/div[2]/div[2]/table/tbody/tr/td[3]")
    public WebElementFacade activeUserFullNameColumn;

    @FindBy(xpath="/html/body/ui-view/div[1]/div/div/ui-view/div/div[2]/div/div[1]/div/div/div/div[2]/div[2]/table/tbody/tr/td[4]")
    public WebElementFacade activeUserCurrentActivityColumn;

    @FindBy(xpath="/html/body/ui-view/div[1]/div/div/ui-view/div/div[2]/div/div[1]/div/div/div/div[2]/div[2]/table/tbody/tr/td[7]")
    public WebElementFacade activeUserTimezoneColumn;

    @FindBy(xpath="//*[@id=\"DataTables_Table_3\"]/tbody/tr[2]/td[1]")
    public WebElementFacade activityLogsColorGreen; // previous Activity xpath

    @FindBy(xpath="//*[@id=\"DataTables_Table_3\"]/tbody/tr[1]/td[1]")
    public WebElementFacade activityLogsColorYellow; // Current Activity xpath

    @FindBy(xpath="/html/body/ui-view/div[1]/div/div/ui-view/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[1]")
    public WebElementFacade activityLogsColorRed; // more than time Activity xpath

    // Terminate button on Active User tab
    @FindBy(xpath="//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[1]/button[2]/b")
    public WebElementFacade activeUserTerminateButton;

    // Force End Shift button on Active User tab
    @FindBy(xpath="//*[@id=\"DataTables_Table_*\"]/tbody/tr/td[1]/button[1]")
    public WebElementFacade activeUserEndShiftButton;

    @FindBy(xpath="/html/body/ui-view/div[1]/div/div/ui-view/div/div[2]/div/div[1]/div/div/div/div[2]/div[2]/table/tbody/tr/td[4]")
    public WebElementFacade dashboardActiveUserCurrentActivityCol;

    // Activity Logs Tab, Employee 1st row and 1st column
    @FindBy(xpath="/html/body/ui-view/div[1]/div/div/ui-view/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[1]")
    public WebElementFacade activityLogsEmployeeCol;

    @FindBy(xpath="/html/body/ui-view/div[1]/div/div/ui-view/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[3]")
    public WebElementFacade activityLogsActivityColumn;

    @FindBy(xpath="/html/body/ui-view/div[1]/div/div/ui-view/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[4]")
    public WebElementFacade activityLogsStartTimeColumn;

    @FindBy(xpath="/html/body/ui-view/div[1]/div/div/ui-view/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[5]")
    public WebElementFacade activityLogsEndTimeColumn;

    @FindBy(xpath="/html/body/ui-view/div[1]/div/div/ui-view/div/div[2]/div/div[1]/div/div/div/div[2]/div[2]/table/tbody/tr/td")
    public WebElementFacade activeUserEmptyTableMessage;

    // TimeWarp Home page
    @FindBy(xpath = "//table[@id='activityTypeBox']//tr[7]//td[1]")
    public WebElementFacade activityTypeTeamMeeting;

    @FindBy(xpath = "//button[@id='submitActivity']")
    public WebElementFacade startActivityButton;


    @FindBy(css = "h1.page-header.ng-scope")
    public WebElementFacade pageHeader;

    @FindBy(css = "a.dropdown-toggle")
    public WebElementFacade userNameHeader;

    @FindBy(css = "table#tableResult")
    public WebElementFacade resultTable;

    @FindAll({ @org.openqa.selenium.support.FindBy(xpath = "//button[normalize-space(text())='Edit Logs']"),})
    public List<WebElement> editLogs;

    @FindBy(xpath = "//div[@class='overlay']")
    public WebElementFacade overlay;

    public boolean doesPageHeaderContainsText(String title){
       return pageHeader.getText().contains(title);
    }

    TimewarpPage timewarpPage = new TimewarpPage();

    public List<Map<Object, String>> getSearchResults() {
        List<Map<Object, String>> dataList = rowsFrom(resultTable);
        Collections.sort(dataList, new Comparator<Map<Object, String>>() {
            @Override
            public int compare(Map<Object, String> map1, Map<Object, String> map2) {
                return map1.get(2).compareTo(map2.get(2));
            }
        });
        return dataList;
     }

     public List<WebElement> getListOfEditLogs(){
        return editLogs;
     }

    public WebElementFacade getResultTable() {
        return resultTable;
    }

    public void waitForOvelaytoBeInvisible(){
        if(overlay.isPresent() && overlay.isVisible()){
            withTimeoutOf(Duration.ofMinutes(2)).waitFor(ExpectedConditions.invisibilityOf(overlay));
        }
    }

    // Verify the TL, OM and Admin login for TimeWarp

    public void verifyDashboardPageContent() {
        // click on Dashboard tab on TimeWarp home Page
        dashboardTabHeader.click();

        // Verify Dashboard page headers
        Assert.assertTrue(dashboardPageHeader.isPresent());
        Assert.assertTrue(dashboardUserNameHeader.isPresent());

        // Verify Dashboard Page contents like dropdown
        Assert.assertTrue(campaignDropDown.isPresent());
        Assert.assertTrue(teamLeaderDropDown.isPresent());
        Assert.assertTrue(teamMateDropDown.isPresent());

        // Verify Active Users tab contents
        Assert.assertTrue(activeUsersTab.isDisplayed());
        Assert.assertTrue(activityLogsTab.isDisplayed());
        Assert.assertTrue(refreshButton.isDisplayed());
    }

    public void verifyOMDashboardPageContent() {
        // click on Dashboard tab on TimeWarp home Page
        dashboardTabHeader.click();

        // Verify Dashboard page headers
        Assert.assertTrue(dashboardPageHeader.isPresent());
        Assert.assertTrue(dashboardUserNameHeader.isPresent());

        // Verify Dashboard Page contents like dropdown
        Assert.assertTrue(campaignDropDown.isPresent());
        Assert.assertTrue(teamLeaderDropDown.isPresent());
        Assert.assertTrue(teamMateDropDown.isPresent());

        // Verify Active Users tab contents
        Assert.assertTrue(activeUsersTab.isPresent());
        Assert.assertTrue(activityLogsTab.isPresent());
        Assert.assertTrue(refreshButton.isPresent());
    }

    public void verifyAdminDashboardPageContent() {
        // click on Dashboard tab on TimeWarp home Page
        dashboardTabHeader.click();

        // Verify Dashboard page headers
        Assert.assertTrue(dashboardPageHeader.isPresent());
        Assert.assertTrue(dashboardUserNameHeader.isPresent());

        // Verify Dashboard Page contents like dropdown
        Assert.assertTrue(campaignDropDown.isPresent());
        Assert.assertTrue(teamLeaderDropDown.isPresent());
        Assert.assertTrue(teamMateDropDown.isPresent());

      // Verify Active Users tab contents
        Assert.assertTrue(activeUsersTab.isPresent());
        Assert.assertTrue(activityLogsTab.isPresent());
        Assert.assertTrue(refreshButton.isPresent());
    }

    // Verify the Dashboard for Active users

    public void verifyDashboardPageHeader() {
        // click on Dashboard tab on TimeWarp home Page
        dashboardTabHeader.click();
        waitForAngularRequestsToFinish();

        // Verify Dashboard page headers
        Assert.assertTrue(dashboardPageHeader.isVisible());
        Assert.assertTrue(dashboardUserNameHeader.isVisible());
    }

    public void verifyAllActiveUsersAreShowingForAllTLs() {

        // Select all TLs from TL dropdown
        //Thread.sleep(3000);
        System.out.println("Test check1:");
        //Select tlDropDown = new Select(teamLeaderDropDown);
        System.out.println("Test check2:");
        //tlDropDown.selectByValue("All");
        System.out.println("Test check3:");
        activeUserTerminateButton.isPresent();
        activeUserEndShiftButton.isPresent();
        System.out.println("Test check4:");
    }

    public void verifyAllActiveUsersAreShowingForSpecificTL() {

        // Verify Teammates shows in TMs dropdown
        //Assert.assertNotNull(teamMateDropDown.selectByValue("Team mate"));
        activeUserTerminateButton.isPresent();
        activeUserEndShiftButton.isPresent();

    }

    public void verifySpecificTMIsShowingForSpecificTL() {

        // Verify Teammates shows in TMs dropdown
        //Assert.assertNotNull(teamMateDropDown.selectByValue("Team mate"));
        activeUserTerminateButton.isPresent();
        activeUserEndShiftButton.isPresent();
    }

    // Verify the Dashboard for Activity Logs

    public void verifyActivityLogsForAllActiveUsersAreShowingForAllTLs() {

        // Verify Activity Logs for all TMs
        activityLogsTab.click();
        waitForAngularRequestsToFinish();
        //activityLogsResultTable.isPresent();

        // Write code as per activity Logs Result Table fields
        //Assert.assertEquals("8888001", activeUserEmployeeIDColumn.getTextContent());

    }

    public void verifyActivityLogsForAllActiveUsersAreShowingForSpecificTL() {
        // Verify Activity Logs for all TMs
        activityLogsTab.click();
        waitForAngularRequestsToFinish();
        //activityLogsResultTable.isPresent();

        // Write code as per activity Logs Result Table fields
        //Assert.assertEquals("8888001", activeUserEmployeeIDColumn.getTextContent());
    }

    public void verifyActivityLogsForSpecificTMIsShowingForSpecificTL() {
        // Verify Activity Logs for all TMs
        activityLogsTab.click();
        waitForAngularRequestsToFinish();
        //activityLogsResultTable.isPresent();

        // Write code as per activity Logs Result Table fields
        //Assert.assertEquals("8888001", activeUserEmployeeIDColumn.getTextContent());
    }

    // Verify the Dashboard for Search Function

    public void verifyActiveUsersSearchBasedOnEmployeeID() {
        // Search Function
        refreshButton.click();
        activeUserSearchBox.typeAndEnter("8888001");
        Assert.assertEquals("8888001", activeUserEmployeeIDColumn.getTextContent());

    }

    public void verifyActiveUsersSearchBasedOnEmployeeName() {
        // Search Function
        activeUserSearchBox.typeAndEnter("Team Mate");
        Assert.assertEquals("Team Mate", activeUserFullNameColumn.getTextContent());

    }

    public void verifyActiveUsersSearchBasedOnActivityName() {
        // Search Function
        activeUserSearchBox.typeAndEnter("Start Shift");
        Assert.assertEquals("Start Shift", activeUserCurrentActivityColumn.getTextContent());
    }

    public void verifyActiveUsersSearchBasedOnTimezone() {
        // Search Function
        activeUserSearchBox.typeAndEnter("Singapore Standard Time");
        Assert.assertEquals("Singapore Standard Time", activeUserTimezoneColumn.getTextContent());

    }

    // Verify the Dashboard for Color Code

    public void verifyTMStartActivityColorIsGreen() throws InterruptedException {
        activityLogsTab.click();
        Thread.sleep(2000);
        // Verify Start shift Color Code
        Assert.assertEquals("Verify Previous Activity Color is Green ", "rgba(223, 240, 216, 1)", activityLogsColorGreen.getCssValue("background-color"));
    }

    public void verifyTMProductiveActivityColorIsYellow() throws InterruptedException {
        activityLogsTab.click();
        Thread.sleep(2000);
        // Verify Break Time Color Code
        Assert.assertEquals("Verify Current Activity Color is Yellow", "rgba(252, 248, 227, 1)", activityLogsColorYellow.getCssValue("background-color"));

    }

    public void verifyTMBreakfastMoreThan15MinutesActivityColorIsRed() throws InterruptedException {
        activityLogsTab.click();
        Thread.sleep(2000);
        // Search Function
        Assert.assertEquals("Verify activity Color is Red", "rgba(242, 222, 222, 1)", activityLogsColorRed.getCssValue("background-color"));

}

    // Verify the Dashboard for Terminate Activity
    public void clickOnEmployeeActivityTerminateButton() throws InterruptedException {

        // Click on Terminate button and Confirm
        //waitForAngularRequestsToFinish();
        Thread.sleep(2000);
        find(ByAngular.buttonText("Terminate")).click();
        find(ByAngular.buttonText("YES")).click();
        Thread.sleep(2000);
        Assert.assertEquals("Check Idle Activity:","Idle Time", activeUserCurrentActivityColumn.getText());

    }

    public void compareTerminateActivityEndTimeAndIdleTimeStartTime() throws InterruptedException {

        // Compare start time for Idle time activity and End time of Terminated Activity
        // Write code here
        //waitForAngularRequestsToFinish();
        activityLogsTab.click();
        Thread.sleep(2000);
        Assert.assertEquals("Compare Terminate Activity End time with Idle Start Time",activityLogsStartTimeColFirstRow.getText(), activityLogsEndTimeColSecondRow.getText());
    }


    // Verify the Dashboard for Force End Shift

    public void verifyForceEndShiftRemoveLogFromActiveUserTab() throws InterruptedException {
        // Click on End shift
        find(ByAngular.buttonText("End Shift")).click();
        find(ByAngular.buttonText("YES")).click();

        Thread.sleep(2000);
        // Verify activity in Active user tab
        Assert.assertEquals("Verify Empty table:", "No data available in table", activeUserEmptyTableMessage.getText());
        //Assert.assertFalse(find(ByAngular.buttonText("8888001")).isPresent());

    }

    public void verifyActivityLogEndTimeTimestampToBeSame() throws InterruptedException {

        // Click on End shift
        activityLogsTab.click();
        Thread.sleep(2000);
        Assert.assertEquals("Verify Time on Activity Logs Tab", "End Shift", activityLogsActivityColumn.getText());

    }

    public void verifyActivityLogVisibleAfterForceEndShift() throws InterruptedException {

       // Click on Activity Logs tab and verify End shift
        activityLogsTab.click();
        Thread.sleep(2000);
        Assert.assertEquals("Verify Logs on Activity Logs Tab", "8888001", activityLogsEmployeeCol.getText());

    }

    public void verifyStartAndEndTimeSameForEndShift() throws InterruptedException {

        // Click on Activity Logs tab and verify End shift
        activityLogsTab.click();
        Thread.sleep(2000);
        Assert.assertEquals("Verify Start and End Time on Activity Logs Tab", activityLogsStartTimeColumn.getText(), activityLogsEndTimeColumn.getText());

    }

}

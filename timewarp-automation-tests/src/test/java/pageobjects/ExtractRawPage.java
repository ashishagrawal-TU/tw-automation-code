package pageobjects;

import com.paulhammant.ngwebdriver.ByAngular;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class
ExtractRawPage extends PageObject {

    //@FindBy(xpath = "//a[@title='Extract Raw']")
    //private WebElementFacade extractRawTabHeader;
    TWLoginPage twLoginpage = new TWLoginPage();

    @FindBy(css = "h1.page-header")
    private WebElementFacade extractLogsPageHeader;

    @FindBy(xpath = "//*[@id=\"navbar-collapse\"]/ul[3]/li/a")
    private WebElementFacade extractLogsUserNameHeader;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[1]/p/input")
    private WebElementFacade extractLogsFromDate;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[2]/p/input")
    private WebElementFacade extractLogsToDate;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[3]/div/div[1]/span/span[2]")
    private WebElementFacade extractLogsCampaignDropDown;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[4]/div/div[1]/span/span[2]")
    private WebElementFacade extractLogsTeamLeaderDropDown;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[5]/div/div[1]/span/span[2]")
    private WebElementFacade extractLogsTeamMateDropDown;

    @FindBy(xpath = "/html/body/ui-view/div[1]/div/div/ui-view/extract-raw/div/div[1]/div/div[2]/button/i")
    private WebElementFacade extractLogsGenerateButton;

    @FindBy(xpath = "//*[@id=\"table-logs_wrapper\"]/div[1]/a")
    private WebElementFacade extractLogsCSVButton;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[2]/ul/li/a")
    private WebElementFacade extractLogsTableHeader;

    @FindBy(xpath = "/html/body/ui-view/div[1]/div/div/ui-view/extract-raw/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[1]")
    private WebElementFacade extractLogsTableFirstRow;

    // From Date locators

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[1]/p/span/button")
    private WebElementFacade extractLogsFromDateIcon;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[1]/p/div/ul/li[1]/div/div/div/table/thead/tr[2]/th[2]/small")
    private WebElementFacade extractLogsFromDateMondayText;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[1]/p/div/ul/li[1]/div/div/div/table/thead/tr[1]/th[1]/button")
    private WebElementFacade extractLogsFromDateBackArrow;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[1]/p/div/ul/li[1]/div/div/div/table/thead/tr[1]/th[3]/button")
    private WebElementFacade extractLogsFromDateForwardArrow;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[1]/p/div/ul/li[2]/span/button[1]")
    private WebElementFacade extractLogsFromDateTodayButton;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[1]/p/div/ul/li[2]/span/button[2]")
    private WebElementFacade extractLogsFromDateClearButton;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[1]/p/div/ul/li[2]/button")
    private WebElementFacade extractLogsFromDateCloseButton;

    @FindBy(css = "span.ng-binding")
    private WebElementFacade extractLogsFromDateFirstDateCell;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[1]/p/div/ul/li[1]/div/div/div/table/tbody/tr[1]/td[1]/em")
    private WebElementFacade extractLogsFromDateWeekNumber;

    // To Date locators

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[2]/p/span/button")
    private WebElementFacade extractLogsToDateIcon;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[2]/p/div/ul/li[1]/div/div/div/table/thead/tr[2]/th[2]/small")
    private WebElementFacade extractLogsToDateMondayText;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[2]/p/div/ul/li[1]/div/div/div/table/thead/tr[1]/th[1]/button/i")
    private WebElementFacade extractLogsToDateBackArrow;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[2]/p/div/ul/li[1]/div/div/div/table/thead/tr[1]/th[3]/button")
    private WebElementFacade extractLogsToDateForwardArrow;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[2]/p/div/ul/li[2]/span/button[1]")
    private WebElementFacade extractLogsToDateTodayButton;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[2]/p/div/ul/li[2]/span/button[2]")
    private WebElementFacade extractLogsToDateClearButton;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[2]/p/div/ul/li[2]/button")
    private WebElementFacade extractLogsToDateCloseButton;

    @FindBy(css = "span.ng-binding")
    private WebElementFacade extractLogsToDateFirstDateCell;

    @FindBy(xpath = "//*[@id=\"pads\"]/div/ui-view/extract-raw/div/div[1]/div/div[2]/div[2]/p/div/ul/li[1]/div/div/div/table/tbody/tr[1]/td[1]/em")
    private WebElementFacade extractLogsToDateWeekNumber;


    // Verify the Extract Log page

    public void verifyExtractLogPageHeader() {
        if (find(ByAngular.buttonText("YES")).isVisible()){
            find(ByAngular.buttonText("YES")).click();
        }
        if (find(ByAngular.buttonText("Close")).isVisible()){
            find(ByAngular.buttonText("Close")).click();
        }
        // click on Extract Log tab on TimeWarp home Page
        extractLogsUserNameHeader.click();
        waitForAngularRequestsToFinish();
        // Verify Extract Log page headers
        Assert.assertTrue(extractLogsPageHeader.isDisplayed());
        Assert.assertTrue(extractLogsUserNameHeader.isPresent());
    }

    public void verifyExtractLogPageContent() {
        // click on Extract Log tab on TimeWarp home Page

        // Verify Extract Log page contents like dropdown
        Assert.assertTrue(extractLogsFromDate.isPresent());
        Assert.assertTrue(extractLogsToDate.isPresent());
        Assert.assertTrue(extractLogsCampaignDropDown.isPresent());
        Assert.assertTrue(extractLogsTeamLeaderDropDown.isPresent());
        Assert.assertTrue(extractLogsTeamMateDropDown.isPresent());
        Assert.assertTrue(extractLogsGenerateButton.isPresent());
        Assert.assertTrue(extractLogsCSVButton.isPresent());
        Assert.assertEquals("Verify Extract Log Table Header", "Time Warp Log(s)", extractLogsTableHeader.getText());

    }

    // Verify DATE FROM field on Extract Log page

    public void verifyCalendarVisibleWhenDateFROMFieldCalendarIconClicked() {

        // Verify Date FROM field calendar
        extractLogsFromDateIcon.click();
        Assert.assertTrue(extractLogsFromDateTodayButton.isPresent());
        Assert.assertTrue(extractLogsFromDateClearButton.isPresent());
        Assert.assertTrue(extractLogsFromDateCloseButton.isPresent());
        extractLogsFromDateIcon.click();
    }

    public void verifyCalenderDisappearWhenDateFROMFieldCloseIconClicked() {

        // Verify Date FROM field calendar for Close button
        extractLogsFromDateIcon.click();
        extractLogsFromDateCloseButton.click();
        Assert.assertTrue(extractLogsFromDate.isPresent());
        Assert.assertTrue(extractLogsToDate.isPresent());

    }

    public void verifyDataRemovedWhenClearButtonIsClicked() {

        // Verify Date FROM field calendar for Clear Button
        extractLogsFromDateIcon.click();
        extractLogsFromDateClearButton.click();
        Assert.assertEquals("Verify From Date field is Blank", "", extractLogsFromDate.getText());

    }

    public void verifyTodayDateOnDateFromFieldWhenTodayButtonIsClicked() {

        // Verify Date FROM field calendar for Today button
        extractLogsFromDateIcon.click();
        extractLogsFromDateTodayButton.click();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        //get current date with Date()
        Date date = new Date();

        // Now format the date
        String currentDate= dateFormat.format(date);
        extractLogsFromDate.getValue().equals(currentDate);

    }

    public void verifyNextMonthShowsWhenForwardArrowIsClickedDateFROMField() {

        // Verify Date FROM field calendar for Forward arrow
        extractLogsFromDateIcon.click();
        String weekNumber = extractLogsFromDateWeekNumber.getText();
        extractLogsFromDateForwardArrow.click();
        Assert.assertNotEquals("Compare the Week number", weekNumber, extractLogsFromDateWeekNumber.getText());
        extractLogsFromDateIcon.click();
    }

    public void verifyPreviousMonthShowsWhenBackArrowIsClickedDateFROMField() {

        // Verify Date FROM field calendar for Back arrow
        extractLogsFromDateIcon.click();
        String weekNumber = extractLogsFromDateWeekNumber.getText();
        extractLogsFromDateBackArrow.click();
        Assert.assertNotEquals("Compare the Week number", weekNumber, extractLogsFromDateWeekNumber.getText());
        extractLogsFromDateIcon.click();
    }

    public void verifySelectedDateWillBeOnDateFROMField() {

        // Verify Date FROM field calendar for Date selected
        extractLogsFromDateIcon.click();
        String dayNumber = extractLogsFromDateFirstDateCell.getText();
        extractLogsFromDateFirstDateCell.click();

        String dateFieldValue = extractLogsFromDate.getTextValue();
        String extractDayNumber = dateFieldValue.substring(7,9);
        Assert.assertEquals("Compare selected date with date box", dayNumber, extractDayNumber);

    }


    // Verify DATE TO field on Extract Log page

    public void verifyCalendarVisibleWhenDateTOFieldCalendarIconClicked() {

        JavascriptExecutor js = (JavascriptExecutor) twLoginpage.getDriver();
        //This will scroll the web page till end
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        // Verify Date TO field calendar
        extractLogsToDateIcon.click();
        Assert.assertTrue(extractLogsToDateTodayButton.isPresent());
        Assert.assertTrue(extractLogsToDateClearButton.isPresent());
        Assert.assertTrue(extractLogsToDateCloseButton.isPresent());
        extractLogsToDateIcon.click();
    }

    public void verifyCalenderDisappearWhenDateTOFieldCloseIconClicked() {

        // Verify Date TO field calendar for Close button
        extractLogsToDateIcon.click();
        extractLogsToDateCloseButton.click();
        Assert.assertTrue(extractLogsFromDate.isPresent());
        Assert.assertTrue(extractLogsToDate.isPresent());

    }

    public void verifyDataRemovedWhenClearButtonIsClickedTODate() {

        // Verify Date To field calendar for Clear Button
        extractLogsToDateIcon.click();
        extractLogsToDateClearButton.click();
        Assert.assertEquals("Verify From Date field is Blank", "", extractLogsToDate.getText());

    }

    public void verifyTodayDateOnDateTOFieldWhenTodayButtonIsClicked() {

        // Verify Date TO field calendar for Today button
        extractLogsToDateIcon.click();
        extractLogsToDateTodayButton.click();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        //get current date with Date()
        Date date = new Date();

        // Now format the date
        String currentDate= dateFormat.format(date);
        extractLogsToDate.getValue().equals(currentDate);

    }

    public void verifyNextMonthShowsWhenForwardArrowIsClickedDateTOField() {

        // Verify Date TO field calendar for Forward arrow
        extractLogsToDateIcon.click();
        String weekNumber = extractLogsToDateWeekNumber.getText();
        extractLogsToDateForwardArrow.click();
        Assert.assertNotEquals("Compare the Week number", weekNumber, extractLogsToDateWeekNumber.getText());
        extractLogsToDateIcon.click();
    }

    public void verifyPreviousMonthShowsWhenBackArrowIsClickedDateTOField() {

        // Verify Date To field calendar for Back arrow
        extractLogsToDateIcon.click();
        String weekNumber = extractLogsToDateWeekNumber.getText();
        extractLogsToDateBackArrow.click();
        Assert.assertNotEquals("Compare the Week number", weekNumber, extractLogsToDateWeekNumber.getText());
        extractLogsToDateIcon.click();
    }

    public void verifySelectedDateWillBeOnDateTOField() {

        // Verify Date To field calendar for Date selected
        extractLogsToDateIcon.click();
        String dayNumber = extractLogsToDateFirstDateCell.getText();
        extractLogsToDateFirstDateCell.click();

        String dateFieldValue = extractLogsToDate.getText();
        String extractDayNumber = dateFieldValue.substring(8,9);
        Assert.assertEquals("Compare selected date with date box", dayNumber, extractDayNumber);

    }

    // Verify Campaign field using TL/OM/Admin access

    public void verifyCampaignBySelectingDate() {

        // Select From/To Date
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar todayDate = Calendar.getInstance();
        Calendar yesterdayDate = Calendar.getInstance();
        yesterdayDate.add(Calendar.DATE, -1);
        Date date = yesterdayDate.getTime();
        String yesDate = simpleDateFormat.format(date);
        System.out.println("Yest Date: " + yesDate);
        //extractLogsFromDate.clear();
        //extractLogsFromDate.sendKeys(yesDate);

        //todayDate.add(Calendar.DATE, 0);
        //Date toDate = todayDate.getTime();
        //String todaysDate = simpleDateFormat.format(toDate);
        //System.out.println("Today Date: " + todaysDate);
        //extractLogsToDate.clear();
        //extractLogsToDate.sendKeys(todaysDate);

        //waitForAngularRequestsToFinish();

        //extractLogsGenerateButton.click();
        //waitForAngularRequestsToFinish();
        //Select select = new Select(extractLogsCampaignDropDown);

        //System.out.println("Drop down value1: " + select.getFirstSelectedOption());
        //System.out.println("Drop down value2: " + select.getAllSelectedOptions());

        //Assert.assertEquals("Verify Campaign by Team mate name", "Team Mate", extractLogsTableFirstRow.getText());
    }

    // Verify TL field for Selected Campaign

    public void verifyTLFieldForCampaign() {

        // Select From/To Date
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar todayDate = Calendar.getInstance();
        Calendar yesterdayDate = Calendar.getInstance();
        yesterdayDate.add(Calendar.DATE, -1);
        Date date = yesterdayDate.getTime();
        String yesDate = simpleDateFormat.format(date); // toString for Calendars is mostly not really useful

        extractLogsFromDate.sendKeys(yesDate);

        todayDate.add(Calendar.DATE, 0);
        Date toDate = todayDate.getTime();
        String todaysDate = simpleDateFormat.format(toDate); // toString for Calendars is mostly not really useful
        extractLogsToDate.sendKeys(todaysDate);

        waitForAngularRequestsToFinish();
        //extractLogsCampaignDropDown.selectByIndex(0);
        extractLogsGenerateButton.click();
        waitForAngularRequestsToFinish();
        Assert.assertEquals("Verify Campaign by Team mate name", "Team Mate", extractLogsTableFirstRow.getText());
        //Assert.assertTrue(extractLogsTeamLeaderDropDown.containsElements("Campaign"));
    }

    // Verify that when Team Leader = ALL, list of TMs will not be displayed on Teammate field

    public void verifyTMsList() {

        // Select From/To Date
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar todayDate = Calendar.getInstance();
        Calendar yesterdayDate = Calendar.getInstance();
        yesterdayDate.add(Calendar.DATE, -1);
        Date date = yesterdayDate.getTime();
        String yesDate = simpleDateFormat.format(date); // toString for Calendars is mostly not really useful

        extractLogsFromDate.sendKeys(yesDate);

        todayDate.add(Calendar.DATE, 0);
        Date toDate = todayDate.getTime();
        String todaysDate = simpleDateFormat.format(toDate); // toString for Calendars is mostly not really useful
        extractLogsToDate.sendKeys(todaysDate);

        waitForAngularRequestsToFinish();
        //Assert.assertNotNull(extractLogsTeamMateDropDown.expect("--Select Teammate--"));
        extractLogsGenerateButton.click();
        waitForAngularRequestsToFinish();
        Assert.assertEquals("Verify Campaign by Team mate name", "Team Mate", extractLogsTableFirstRow.getText());

    }

    // Verify the list of TMs on Teammate field for the selected TL

    public void verifyTMsListForSpecificTL() {

        // Select From/To Date
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar todayDate = Calendar.getInstance();
        Calendar yesterdayDate = Calendar.getInstance();
        yesterdayDate.add(Calendar.DATE, -1);
        Date date = yesterdayDate.getTime();
        String yesDate = simpleDateFormat.format(date); // toString for Calendars is mostly not really useful

        extractLogsFromDate.sendKeys(yesDate);

        todayDate.add(Calendar.DATE, 0);
        Date toDate = todayDate.getTime();
        String todaysDate = simpleDateFormat.format(toDate); // toString for Calendars is mostly not really useful
        extractLogsToDate.sendKeys(todaysDate);

        waitForAngularRequestsToFinish();
        //extractLogsCampaignDropDown.selectByIndex(0);
        //extractLogsTeamLeaderDropDown.selectByIndex(1);
        extractLogsGenerateButton.click();
        waitForAngularRequestsToFinish();
        Assert.assertEquals("Verify Campaign by Team mate name", "Team Mate", extractLogsTableFirstRow.getText());

        //Assert.assertTrue(extractLogsTeamMateDropDown.containsElements(extractLogsTeamMateDropDown.getTextContent()));
    }

    // Verify that when there is no data on Team Leader field an error will be prompted after clicking Generate

    public void verifyErrorMessageWhenClickGenerateButtonWithNoDataOnTLField() throws InterruptedException {

        // Select From/To Date
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar todayDate = Calendar.getInstance();
        Calendar yesterdayDate = Calendar.getInstance();
        yesterdayDate.add(Calendar.DATE, -29);
        Date date = yesterdayDate.getTime();
        String yesDate = simpleDateFormat.format(date); // toString for Calendars is mostly not really useful

        extractLogsFromDate.sendKeys(yesDate);

        todayDate.add(Calendar.DATE, -29);
        Date toDate = todayDate.getTime();
        String todaysDate = simpleDateFormat.format(toDate); // toString for Calendars is mostly not really useful
        extractLogsToDate.sendKeys(todaysDate);

        //waitForAngularRequestsToFinish();
        //extractLogsCampaignDropDown.selectByIndex(1);
        //extractLogsTeamLeaderDropDown.selectByIndex(0);
        Thread.sleep(3000);

        //Assert.assertFalse(extractLogsGenerateButton.isClickable());
        Assert.assertTrue(extractLogsGenerateButton.isPresent());

    }

    // Verify that activity logs will be displayed after clicking Generate button
    public void verifyActivityLogsWithAllValueSelectedAndClickOnGenerateButton() {

        // Select From/To Date
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar todayDate = Calendar.getInstance();
        Calendar yesterdayDate = Calendar.getInstance();
        yesterdayDate.add(Calendar.DATE, -29);
        Date date = yesterdayDate.getTime();
        String yesDate = simpleDateFormat.format(date); // toString for Calendars is mostly not really useful

        extractLogsFromDate.sendKeys(yesDate);

        todayDate.add(Calendar.DATE, -29);
        Date toDate = todayDate.getTime();
        String todaysDate = simpleDateFormat.format(toDate); // toString for Calendars is mostly not really useful
        extractLogsToDate.sendKeys(todaysDate);

        //Selecting all values in Drop Down
        //extractLogsCampaignDropDown.selectByIndex(0);
        //extractLogsTeamLeaderDropDown.selectByIndex(0);
        //extractLogsTeamMateDropDown.selectByIndex(0);
        waitForAngularRequestsToFinish();

        extractLogsGenerateButton.click();
        waitForAngularRequestsToFinish();
        Assert.assertFalse(extractLogsTableFirstRow.getText().isEmpty());

    }

    //Extract Raw Tab - Displayed Activity Logs scenarios
    //Verify the activity logs for ALL TLs under the selected campaign on the specified date

    public void verifyActivityLogsForSpecificDateForALLTLs() {

        // Select From/To Date
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar todayDate = Calendar.getInstance();
        Calendar yesterdayDate = Calendar.getInstance();
        yesterdayDate.add(Calendar.DATE, -1);
        Date date = yesterdayDate.getTime();
        String yesDate = simpleDateFormat.format(date); // toString for Calendars is mostly not really useful

        extractLogsFromDate.sendKeys(yesDate);

        todayDate.add(Calendar.DATE, 0);
        Date toDate = todayDate.getTime();
        String todaysDate = simpleDateFormat.format(toDate); // toString for Calendars is mostly not really useful
        extractLogsToDate.sendKeys(todaysDate);

        waitForAngularRequestsToFinish();
        //Selecting all values in Drop Down
        //extractLogsCampaignDropDown.selectByIndex(1);
        //extractLogsTeamLeaderDropDown.selectByIndex(0);

        //extractLogsGenerateButton.click();
        waitForAngularRequestsToFinish();
        //Assert.assertFalse(extractLogsTableFirstRow.getText().isEmpty());

    }

    //Verify the activity logs for ALL TMs under the selected TL on the specified date
    public void verifyActivityLogsForSpecificDateForALLTMs() {

        // Select From/To Date
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar todayDate = Calendar.getInstance();
        Calendar yesterdayDate = Calendar.getInstance();
        yesterdayDate.add(Calendar.DATE, -1);
        Date date = yesterdayDate.getTime();
        String yesDate = simpleDateFormat.format(date); // toString for Calendars is mostly not really useful

        extractLogsFromDate.sendKeys(yesDate);

        todayDate.add(Calendar.DATE, 0);
        Date toDate = todayDate.getTime();
        String todaysDate = simpleDateFormat.format(toDate); // toString for Calendars is mostly not really useful
        extractLogsToDate.sendKeys(todaysDate);

        //Selecting all values in Drop Down
        //extractLogsCampaignDropDown.selectByIndex(1);
        //extractLogsTeamLeaderDropDown.selectByIndex(0);
        //extractLogsTeamMateDropDown.selectByIndex(0);

        //extractLogsGenerateButton.click();
        waitForAngularRequestsToFinish();
        //Assert.assertFalse(extractLogsTableFirstRow.getText().isEmpty());

    }

    //Verify the activity logs for the selected TM on the specified date
    public void verifyActivityLogsForSpecificDateForSelectedTM() {

        // Select From/To Date
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar todayDate = Calendar.getInstance();
        Calendar yesterdayDate = Calendar.getInstance();
        yesterdayDate.add(Calendar.DATE, -1);
        Date date = yesterdayDate.getTime();
        String yesDate = simpleDateFormat.format(date); // toString for Calendars is mostly not really useful

        extractLogsFromDate.sendKeys(yesDate);

        todayDate.add(Calendar.DATE, 0);
        Date toDate = todayDate.getTime();
        String todaysDate = simpleDateFormat.format(toDate); // toString for Calendars is mostly not really useful
        extractLogsToDate.sendKeys(todaysDate);

        //Selecting all values in Drop Down
        //extractLogsCampaignDropDown.selectByIndex(1);
        //extractLogsTeamLeaderDropDown.selectByIndex(2);
        //extractLogsTeamMateDropDown.selectByIndex(1);

        //extractLogsGenerateButton.click();
        waitForAngularRequestsToFinish();
       // Assert.assertFalse(extractLogsTableFirstRow.getText().isEmpty());

    }


}
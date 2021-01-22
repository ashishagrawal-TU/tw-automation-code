package steps;

import common.CredentialsCSVReader;
import common.DBHelper;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import pageobjects.TWLoginPage;
import testdataobjects.EmployeeProfile;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class StepsLogin {

    TWLoginPage twLoginpage;
    EmployeeProfile omuser;
    //WebDriver driver;
    EnvironmentVariables environmentVariables;
    //ChromeOptions options;

    DBHelper dbHelper = new DBHelper();
    HashMap<String, EmployeeProfile> employeeList;

    @Step("Open the Time Warp login page")
    public void  theTimeWarpLoginPage() {
        if(employeeList==null){
            employeeList = CredentialsCSVReader.readAndLoadCSVData();
        }
        twLoginpage.getDriver().manage().deleteAllCookies();
        twLoginpage.open();
        twLoginpage.getDriver().navigate().refresh();
        twLoginpage.VerifyUserGSignIn();
        twLoginpage.VerifyUserOTPSignIn();
        twLoginpage.VerifyEnterEmailAddressPage();
    }

    @Step("Open Chrome in Incognito Mode")
    public void OpenChromeIncognitoMode(){
        twLoginpage.getDriver().manage().deleteAllCookies();
        twLoginpage.open();
    }

    @Step("Open Timewarp in Incognito Mode")
    public void OpenTimewarpInChromeIncognito() throws InterruptedException {
        twLoginpage.getDriver().navigate().refresh();
        twLoginpage.getDriver().manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
    }

    @Step("Verify Timewarp in Incognito Mode")
    public void VerifyTimewarpInChromeIncognito(){
        assert twLoginpage.VerifyChromeIncognitoModeError();
    }


    @Step("Open Other browser")
    public void OpenOtherBrowser(){
        twLoginpage.getDriver().manage().deleteAllCookies();
        twLoginpage.open();
    }

    @Step("Verify Timewarp in other browser")
    public void VerifyTimewarpInOtherBrowser(){
        assert twLoginpage.VerifyOtherBrowserError();
    }

    @Step("Enter username and password")
    public void enterUsernameAndPassword(String username, String password) {
        twLoginpage.enterUserName(username);
        twLoginpage.enterPassword(password);
    }

    @Step("Click the Sign In button")
    public void clickTheSignInBtn() {
        twLoginpage.clickSignInBtn();
    }

    public EmployeeProfile UserLogsIn(String user) throws InterruptedException {
        omuser = employeeList.get(user);
        Serenity.setSessionVariable("omuser").to(omuser);
        Serenity.setSessionVariable("EmpNo").to(omuser.getEmpno());
        twLoginpage.EnterEmailAddress(omuser.getUsername());

        String OTP;
        OTP = dbHelper.getOTPGivenEID(omuser.getEmpno());
        twLoginpage.enterOTPSignIn(OTP);
        return omuser;
   }


}

@Regression @function=TWDashboardDisplayedActivityLogs
Feature: Verify the Extract Logs page for Displayed Activity Logs

  @QA_01_TW
  Scenario: To be able to verify the activity logs for ALL TLs under the selected campaign on the specified date
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    #And Verify the activity logs for ALL TLs under the selected campaign on the specified date

  @QA_02_TW
  Scenario: To be able to verify the activity logs for ALL TMs under the selected TL on the specified date
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    #And Verify the activity logs for ALL TMs under the selected TL on the specified date

  @QA_03_TW
  Scenario: To be able to verify the activity logs for the selected TM on the specified date
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    #And Verify the activity logs for the selected TM on the specified date

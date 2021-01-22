@Regression @function=TWDashboardActivityLogs
Feature: Verify the Dashboard for Activity Logs

  @QA_01_TW
  Scenario: To be able to verify the activity logs for ALL TLs under the selected campaign
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify list of active users for All TLs under the selected campaign
    And Verify Activity logs for list of active users for All TLs under the selected campaign

  #@QA_02_TW // Will check if 100 logs list shows once TW is available
  #Scenario: To be able to verify that the number of activity logs displayed is the latest 100 logs
  #  Given User access the Time Warp Login page
  #  When A team Leader user logs in
  #  Then User lands on the Home page
  #  And Verify User is on activity page
  #  And TL clicks on Dashboard Page
  #  And Verify Activity logs displayed is the latest 100 logs

  @QA_03_TW
  Scenario: To be able to verify the activity logs for ALL TMs under the selected TL
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify Activity logs for list of active users under the Selected TL

  @QA_04_TW
  Scenario: To be able to verify the activity logs for specific TM
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify Activity logs for Specific Teammate shows in Teammate dropdown for the Selected TL

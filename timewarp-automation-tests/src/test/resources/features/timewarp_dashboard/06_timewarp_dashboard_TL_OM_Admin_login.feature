@Regression @function=TWDashboardTLOMAdminLogin
Feature: Verify the TL, OM and Admin login for TimeWarp

  @QA_01_TW
  Scenario: To be able to verify Start Shift recording for TW first-time user #Logged in using TL
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And Verify that Start Shift should be started and be recorded at the Current Activity table
    And TL clicks on Dashboard Page and verify contents on Dashboard page

  @QA_02_TW
  Scenario: To be able to verify Start Shift recording for TW first-time user #Logged in using OM
    Given User access the Time Warp Login page
    When An operations manager user logs in
    And Verify OM is on activity page by clicking on TimeWarp Tab
    And Verify OM's Dashboard will have the list of current or most recent activities

  @QA_03_TW
  Scenario: To be able to verify Start Shift recording for TW first-time user #Logged in using Admin
    Given User access the Time Warp Login page
    When An Admin user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And Verify that Start Shift should be started and be recorded at the Current Activity table
    And Verify Admin Dashboard will have the list of current or most recent activities
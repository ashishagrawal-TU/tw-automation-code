@Regression @function=TWDashboardForceEndShift
Feature: Verify the Dashboard for Force End Shift

  @QA_01_TW
  Scenario: To be able to verify that after force end shift using End Shift button on the dashboard, activity log will be eliminated on the Active Users table
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify Force End shift will eliminate Activity log from Active User tab

  @QA_02_TW
  Scenario: To be able to verify that the end time of the activity log that is ended using End Shift button will be the timestamps when the button is clicked
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify Activity log End time timestamp is same when End shift button clicked

  @QA_03_TW
  Scenario: To be able to verify that End Shift activity will be created on the Activity Log table after a force End Shift
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify End Shift activity will be created on the Activity Log table after a force End Shift

  @QA_04_TW
  Scenario: To be able to verify that the start and end time of the created End Shift will be the timestamps when the button is clicked
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify Start an End time for End Shift is same when End shift button clicked

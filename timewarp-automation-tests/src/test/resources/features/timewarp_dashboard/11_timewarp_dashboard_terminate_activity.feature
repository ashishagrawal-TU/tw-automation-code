@Regression @function=TWDashboardTerminateActivity
Feature: Verify the Dashboard for Terminate Activity

  @QA_01_TW
  Scenario: To be able to verify that an employee's activity will be terminated when Terminate button is clicked
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify that an employee's activity will be terminated when Terminate button is clicked

  @QA_02_TW
  Scenario: To be able to verify end time of the terminated activity and start time of Idle Time
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify end time of the terminated activity and start time of Idle Time

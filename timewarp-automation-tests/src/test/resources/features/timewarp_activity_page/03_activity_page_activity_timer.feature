@Regression @function=ActivityPageActivityTimer
Feature: Verify the Activity Timer is working for Start and Stop

  @QA_01_TW
  Scenario: To be able to verify that the Activity Timer will stop and Start Activity button is disabled
    Given User access the Time Warp Login page
    When A team mate user logs in
    Then User lands on the Home page
    And Verify that Activity Timer should stop and Start Activity button should be disabled

  @QA_02_TW
  Scenario: To be able to verify that Activity Timer will start for every activity selected
    Given User access the Time Warp Login page
    When A team mate user logs in
    Then User lands on the Home page
    And Verify User click the Yes button
    And Verify Start shift ending and new activity started
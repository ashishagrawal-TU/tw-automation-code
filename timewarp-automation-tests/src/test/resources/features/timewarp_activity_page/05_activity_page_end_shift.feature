@Regression @function=ActivityPageEndShift
Feature: Verify the Activity page for End Shift logs

  @QA_01_TW
  Scenario:  Verify that End Shift Activity will End the shift
    Given User access the Time Warp Login page
    When A team mate user logs in
    Then User lands on the Home page
    And Select the End Shift and click No on Confirmation dialog box
    And Verify that End Shift Activity start and end time are same

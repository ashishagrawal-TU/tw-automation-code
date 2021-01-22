@Regression @function=TWExtractLogsGUI
Feature: Verify UI of Extract Logs Page

  @QA_01_TW
  Scenario: To be able to verify UI of Extract Logs Page
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And TL clicks on Extract Logs Page
    And Verify GUI of Extract Log Page

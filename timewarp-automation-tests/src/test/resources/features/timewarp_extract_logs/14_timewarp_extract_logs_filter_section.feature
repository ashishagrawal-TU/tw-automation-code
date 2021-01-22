@Regression @function=TWExtractLogsFilterSection
Feature: Verify Extract Logs Page for Filter Section

  @QA_01_TW
  Scenario: To be able to verify DATE FROM field
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Extract Logs Page
    And Verify that a calendar will be displayed when calendar icon is clicked on DATE FROM field
    And verify that the calendar will disappear when Close is clicked on DATE FROM field
    And Verify that the data on DATE FROM field will be removed when Clear on calendar display is clicked
    And Verify that the date today will be the date on DATE FROM field when Today is clicked
    And Verify that next month will be displayed when forward Arrow is clicked DATE FROM field
    And Verify that previous month will be displayed when back Arrow is clicked DATE FROM field
    #And Verify that the selected date will be the data on DATE FROM field

  @QA_02_TW
  Scenario: To be able to verify DATE TO field
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Extract Logs Page
    And Verify that a calendar will be displayed when calendar icon is clicked on DATE TO field
    And Verify that the calendar will disappear when Close is clicked on DATE TO field
    And Verify that the data on DATE TO field will be removed when Clear on calendar display is clicked
    And Verify that the date today will be the date on DATE TO field when Today is clicked
    And Verify that next month will be displayed when forward Arrow is clicked DATE TO field
    And Verify that previous month will be displayed when back Arrow is clicked DATE TO field
    #And Verify that the selected date will be the data on DATE TO field

  @QA_03_TW
  Scenario: To be able to verify Campaign field using TL access
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Extract Logs Page
    And Verify Campaign field using TL access

  @QA_04_TW
  Scenario: To be able to verify Campaign field using OM access
    Given User access the Time Warp Login page
    When An operations manager user logs in
    And OM clicks on Extract Logs Page
    And Verify Campaign field using OM access

  @QA_05_TW
  Scenario: To be able to verify Campaign field using Admin access
    Given User access the Time Warp Login page
    When An Admin user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And Admin clicks on Extract Logs Page
    And Verify Campaign field using Admin access

  @QA_06_TW
  Scenario: To be able to verify Team Leader field for the selected campaign
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Extract Logs Page
    And Verify Team Leader field for the selected campaign

  @QA_07_TW
  Scenario: To be able to verify that when Team Leader = ALL, list of TMs will not be displayed on Teammate field
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Extract Logs Page
    And Verify that when Team Leader is ALL, list of TMs will not be displayed on Teammate field

  @QA_08_TW
  Scenario: To be able to verify the list of TMs on Teammate field for the selected TL
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Extract Logs Page
    And Verify the list of TMs on Teammate field for the selected TL

  @QA_09_TW
  Scenario: To be able to verify that when there is no data on Team Leader field an error will be prompted after clicking Generate
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Extract Logs Page
    And Verify that when there is no data on Team Leader field an error will be prompted after clicking Generate

  @QA_10_TW
  Scenario: To be able to verify that activity logs will be displayed after clicking Generate button
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Extract Logs Page
    And Verify that activity logs will be displayed after clicking Generate button


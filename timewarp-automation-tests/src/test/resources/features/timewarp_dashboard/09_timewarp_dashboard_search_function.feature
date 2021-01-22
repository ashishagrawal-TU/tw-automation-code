@Regression @function=TWDashboardSearchFunction
Feature: Verify the Dashboard for Search Function

  @QA_01_TW
  Scenario: To be able to verify Search Function using Employee ID
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify Active User are showing based on Employee ID search

  @QA_02_TW
  Scenario: To be able to verify Search Function using Full Name
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify Active User are showing based on Employee Name search

  @QA_03_TW
  Scenario: To be able to verify Search Function using Current Activity
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify Active User are showing based on Current Activity Name search

  @QA_04_TW
  Scenario: To be able to verify Search Function using Timezone
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify Active User are showing based on Timezone search

@Regression @function=TWDashboardActiveUsers
Feature: Verify the Dashboard for Active users

  @QA_01_TW
  Scenario: To be able to verify list of active users for All TLs under the selected campaign
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify list of active users for All TLs under the selected campaign

  @QA_02_TW
  Scenario: To be able to verify list of active users under the selected TL
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify list of active users under the Selected TL

  @QA_03_TW
  Scenario: To be able to verify the list of active users when a specific TM is populated in the Teammate field
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify Specific Teammate shows in Teammate dropdown for the Selected TL
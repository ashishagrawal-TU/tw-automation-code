@Regression @function=TWDashboardColorCode
Feature: Verify the Dashboard for Color Code

  @QA_01_TW
  Scenario: Verify that the finished activity will have a color Green
    Given User access the Time Warp Login page
    When A team mate user logs in
    Then User lands on the Home page
    And Verify the new activity is started and previous activity changed to Green color

  @QA_02_TW
  Scenario: To be able to verify that the finished activity will have Green color
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify the color of Start Shift of the TM

  @QA_03_TW
  Scenario: To be able to verify that the on-going activity will have Yellow color
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify the color of Productive Time of the TM

#  @QA_03_TW // Need to wait for 4 hours which will make scripts execution time high
#  Scenario: To be able to verify that the finished activity with log hours > 4 hours will have red color
#    Given User access the Time Warp Login page
#    When A team Leader user logs in
#    Then User lands on the Home page
#    And Verify User is on activity page
#    And TL clicks on Dashboard Page
#    And Verify the color of Productive Time of the TM for more than 4 hours

  @QA_04_TW #Team mate more than 15 activity wait so that TL can get that in Activity Log
  Scenario: Verify finished activity with log hours more than allotted time will have color Red
    Given User access the Time Warp Login page
    When A team mate user logs in
    Then User lands on the Home page
    And Wait for 15 minutes for Break activity to be finished
    And Verify finished activity in more time has color Red

  @QA_05_TW
  Scenario: To be able to verify that the finished activity with log hours > allotted time will have a color red
    Given User access the Time Warp Login page
    When A team Leader user logs in
    Then User lands on the Home page
    And Verify User is on activity page
    And TL clicks on Dashboard Page
    And Verify the color of Breakfast for 15 minutes

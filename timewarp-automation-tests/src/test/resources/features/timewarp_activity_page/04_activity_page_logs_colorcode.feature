@Regression @function=ActivityPageLogsColorCode
Feature: Verify the Activity page logs for Color code changes

  @QA_01_TW
  Scenario: Verify that the finished activity will have a color Green
    Given User access the Time Warp Login page
    When A team mate user logs in
    Then User lands on the Home page
    And Verify the new activity is started and previous activity changed to Green color

  @QA_02_TW
  Scenario: Verify that the on-going activity will have a color Yellow
    Given User access the Time Warp Login page
    When A team mate user logs in
    Then User lands on the Home page
    And Click on new Activity and Verify the On-going activity color is Yellow

  @QA_03_TW
  Scenario: Verify finished activity with log hours more than allotted time will have color Red
    Given User access the Time Warp Login page
    When A team mate user logs in
    Then User lands on the Home page
    And Wait for 15 minutes for Break activity to be finished
    And Verify finished activity in more time has color Red

  # This scenario will make script wait for 4hours which will increase overall script execution time high hence commented
  #@QA_04_TW
  #Scenario: Verify that the finished activity with log hours > 4 hours will have red color
   # Given User access the Time Warp Login page
   # When A team mate user logs in
   # Then User lands on the Home page
   # And Click on Productive activity and wait for more than 4 hours
   # And Verify the Productive activity showing in color Red


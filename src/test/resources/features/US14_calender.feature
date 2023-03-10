@wip
Feature: calendar page functionality



  Scenario:Verify users get time list by default from 0:00 to 23:00 ,
  and increase by one hour each time
    Given the user logged in as pos
    When user on the calendar page
    Then verify the time starts with "0:00"
    When time increase by one hour
    Then verify the time ends with "23:00"
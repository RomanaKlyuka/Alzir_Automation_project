
Feature: As an Expenses manager, I should be able to access the different modules
  Agile story: As a user I should be able to see 12 modules on the expenses manager url.
  I should be able to have access to all 12 modules.
  @romana
Scenario: Verify the Expenses managers have access to 12 modules.
Given the user logged in with email as email and password as password
    Given the user should see 12 modules on the page
  Given the user should  access to all twelve modules


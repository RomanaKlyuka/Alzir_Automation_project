Feature: As an POSManager , I should be able to access the main modules
  Agile story: As a user I should be able to see 22 modules on the POSManager url.
  I should be able to have access to all 22 modules.
  @oksana
  Scenario: Verify the POSManager have access to 22 modules.
    Given the user logged in with email and password
    Given the user should see 22 modules on the page
    Given the user should  access to all twenty modules
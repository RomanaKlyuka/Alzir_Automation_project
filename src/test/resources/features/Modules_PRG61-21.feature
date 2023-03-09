Feature: As an Sales manager, I should be able to access the main modules.

  @asiye
  Scenario: Verify the Sales managers have access to 16 modules
    Given user is logged in with valid credentials username "salesmanager52@info.com" and password "salesmanager"
    Then user should see 19 modules on the page
    Then user should be able to have access to all modules


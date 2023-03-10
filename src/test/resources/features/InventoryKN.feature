Feature: As an Inventory manager, I should be able to access the main modules.

  @Kristina
  Scenario: Verify the Inventory managers have access to 16 modules
    Given user is logged in with valid credentials username "imm34@info.com" and password "inventorymanager"
    Then user should see 16 modules on the page
    Then user should be able to have access to all modules


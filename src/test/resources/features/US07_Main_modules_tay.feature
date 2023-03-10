Feature: Dashboard functionality
  User Story :
  As a CRM Event manager, I want to have access to different modules

  @tay
  Scenario: Positive CRM Event Manager verification they have access to 15 modules
    Given the user is on the login page
    Given the user logged in as "crm manager"
    Then user sees 15 modules
    Then user should have access to modules

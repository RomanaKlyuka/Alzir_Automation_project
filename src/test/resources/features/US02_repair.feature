
Feature: Repair page functionality

  @B28G4-118

  Scenario Outline: POS and sales manager has access to 1 checkbox and 6 columns
    Given users is logged in as POS or sales manager "<email>" and "<password>"
    When user click's on repairs
    Then use should see 1 checkbox and 6 columns

    Examples:
      | email                   | password     |
      | posmanager52@info.com   | posmanager   |
      | salesmanager52@info.com | salesmanager |



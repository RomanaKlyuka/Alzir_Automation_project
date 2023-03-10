Feature: As a POS & sales manager,
  I should be able to get correct information on the Sales page.

  @oksana
  Scenario Outline: Verify user sees 6 columns
    Given user enters  "<email>"  and "<password>"
    And Then user clicks on sale
    Then user should see 6 columns


    Examples:
      | email                  | password     |
      | posmanager52@info.com  | posmanager   |
      | salesmanager52@info.com | salesmanager |
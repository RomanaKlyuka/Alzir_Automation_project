Feature: Product Order Visibility
  AC:
  1. Verify the POS managers can view the order list on the Point of Sale page, after checking the Order reference, all the
  orders should be checked.
  2. Verify the Action drop down has 3 options : Import, Export, Delete (Bug: import is not displayed)



  @YA
    Scenario: As a Point of Sale manager (POS), I should be able to view the product order
      Given the user logged in as "pos"
      When the user clicks on Point of sales link
      Then the user should see orders on page
    Then the user clicks on Orders link
      And user should be able to view the order list on Point of Sale page

      @YA
      Scenario: Action drop down has 3 options
        Given the user logged in as "pos"
        When the user clicks on Point of sales link
        Then the user clicks on Orders link
    Given user should be able to click on checkboxes of each order
    Then the user should be able to see the Action dropdown box after clicking on checboxes
      Then user should be able to click on the Action dropdown box
      And user should be able to see the three options : Import, Export, Delete
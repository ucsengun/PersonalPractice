Feature: Discounts

  Scenario: Discounts
    Given navigate to website
    When login
    And click setup
    And click parameters
    And click discounts
    And click edit discounts
    And fill form again
    And click save button for discount
    Then see success message for editing discount


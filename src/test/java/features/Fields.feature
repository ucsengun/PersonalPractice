Feature: Fields

  Scenario: Fields
    Given navigate to website
    When login
    And click setup
    And click parameters
    And click fields
    And click add new fields
    And fill fields form
    And click save button for new fields
    Then see success message for new fields
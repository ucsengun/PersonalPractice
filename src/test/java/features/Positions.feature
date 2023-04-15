Feature: Positions

  Scenario: Positions
    Given navigate to website
    When login
    And click human resources
    And click setup in human resources
    And click positions
    And click trash button for positions
    And click delete positions button
    Then see success message for deleting position
Feature: Subject Categories

  Scenario: Subject Categories
    Given navigate to website
    When login
    And click education
    And click education setup
    And click subject categories
    And click add button for subject categories
    And fill form except subject category name
    Then see error message for subject category name


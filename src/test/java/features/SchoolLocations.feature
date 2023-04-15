Feature: School Locations

  Scenario:Validate Add New School Location Without School Location Capacity
    Given navigate to website
    When login
    And Click on Setup from the menu on the left
    And Click School Setup
    And Click Locations
    And Click Add School Location button
    And Fill all of them except location capacity area
    Then See error message for location capacity
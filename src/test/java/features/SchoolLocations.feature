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

  Scenario:Validate Add New School Location Without School Location Name
    Given navigate to website
    When login
    And Click on Setup from the menu on the left
    And Click School Setup
    And Click Locations
    And Click Add School Location button
    And Fill except school location name
    Then See error message for school location name

  Scenario:Validate Edit School Location for Name
    Given navigate to website
    When login
    And Click on Setup from the menu on the left
    And Click School Setup
    And Click Locations
    And Click Edit School Location button
    And Change Name of school location
    And Click save for name
    Then See success message for editing location name
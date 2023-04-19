Feature: Departments

  Scenario: Validate Add New School Departments Without School Code
    Given navigate to website
    When login
    And click setup
    And click school setup
    And click departments
    And click Add new school department
    And fill form except school code
    Then see error message for school code

  Scenario: Validate Delete School Department
    Given navigate to website
    When login
    And click setup
    And click school setup
    And click departments
    And click delete department button
    And click delete option for department
    Then see success message for deleting department

  Scenario: Validate Edit School Department
    Given navigate to website
    When login
    And click setup
    And click school setup
    And click departments
    And click edit school department button
    And  click edit and click save button for school department
    Then Success message with text School Department successfully updated is displayed





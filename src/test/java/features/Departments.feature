Feature: Departments

  Scenario: Departments
    Given navigate to website
    When login
    And click setup
    And click school setup
    And click departments
    And click Add new school department
    And fill form except school code
    Then see error message for school code


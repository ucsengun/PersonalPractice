Feature: Bank Accounts

  Scenario: Bank Accounts
    Given navigate to website
    When login
    And click setup from left frame
    And click parameters
    And click bank accounts
    And click trash button
    And click delete bank accounts button
    Then see success message for deleting bank account
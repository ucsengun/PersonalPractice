Feature: Document Types

  Scenario: Document Types
    Given navigate to website
    When login
    And click setup
    And click parameters
    And click document types
    And click trash button for document types
    And click delete document types button
    Then see success message for deleting document types

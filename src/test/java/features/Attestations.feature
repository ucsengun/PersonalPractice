Feature: Attestations

  Scenario: Validate add new attestations
  Given navigate to website
  When login
  And click human resources
  And click setup button for attestations
  And click attestations
  And click add attestations
  And fill attestations name
  And click save button for new attestations
  Then success message for attestations

  
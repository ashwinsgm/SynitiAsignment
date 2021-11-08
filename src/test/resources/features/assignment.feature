#Feature: To test tables are migrated from Target Source to Target
Feature: Verify user is able to add a database in Targets
  I want to add a database in target

  Scenario: Verify a database is added in Targets
    Given an user navigates to collect application
    And user login with credentials
      | id1      | pwd1     |
    When an database is added in Target is added in Target
      | QETestDB1 |
    Then user should see the actual database in the list
      | QETestDB1  |

Feature: EndToEnd feature
  @Smoke
  Scenario:  as user i want create Account Successfully
    Given i am on home page
    When i click on sign in link
    And i click on new account tab
    And i enter email address
    And i enter password "Asdfgh123"
    And i enater confirm password "Asdfgh123"
    And i click on create button
    Then i should be able to create account successfully

@sanity
  Scenario: as a user i should navigate to electronic page successfully
    Given i am on home page
    When i click on home tab
    And i navigate to home page
    And i click on electronic button
    Then i should navigate to electronic page
 @Regression
  Scenario: as a user i should be able to purchase successfully
    Given i am on home page
    Then i click on new tab
    And i navigate to new arrivals page
    And i click on  fitness tracker smart watch
    Then i should be bale to select watch successfully


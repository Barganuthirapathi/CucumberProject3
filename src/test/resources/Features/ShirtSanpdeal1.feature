#Author: bargan@your.domain.com
Feature: shirtpurchase
@shirt
  Scenario: shirtvalidation
    Given user login into snapdeal website
    And user enter the valid credentials
    When user searches the shirt in searchfield
    And user click on the shirt name
    Then user validate the shirt name
    

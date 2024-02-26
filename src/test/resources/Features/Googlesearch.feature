
Feature: feature to test login functional
 

  
  Scenario: validate google search is working
  
    Given browser is open 
    And user is on google search page  
    When user enter a text in search box 
    And hits enter
    Then user is navigated to search results
    

  


Feature: Title of your feature
  

 
  Scenario: user valid credentials successfuly
    Given user open browser
    When user enter the url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And user enter the username "Admin" password "admin123"
    And click the button
    Then user navigate page

  
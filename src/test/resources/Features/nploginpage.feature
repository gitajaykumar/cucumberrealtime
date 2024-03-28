@test1
Feature: Title of your feature

  Scenario Outline: user login successfully
    Given open the browser
    And user enter the url1 "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    When user enter the as "<email>" and as "<password>"
    And user click login button
    And log out the page
    Then user navigate the home page

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |

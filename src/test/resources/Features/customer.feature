@tgs1
Feature: customer functionality

  Scenario: add new customer
    Given user open the browser
    And user enter the url2 "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    When user enter the as email "<email>" and as password "<password>"
    And user click the button
    And user click the customer menu
    Then user click the customer item
    And user click the add new customer
    When user enter the customer info
    And click the save button
    Then view the conformation message

     Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |
    